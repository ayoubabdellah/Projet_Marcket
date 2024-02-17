package com.example.projet_marcket.Service;

import com.example.projet_marcket.Entity.Commande;
import com.example.projet_marcket.Entity.Produit;
import com.example.projet_marcket.Entity.ProduitCommande;
import com.example.projet_marcket.Exception.InsufficentStockException;
import com.example.projet_marcket.Exception.ProduitNotFounException;
import com.example.projet_marcket.Repository.CommandeRepository;
import com.example.projet_marcket.Repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeService {
    private final CommandeRepository commandeRepository;
    private ProduitRepository produitRepository;

    public Commande passerCommande(Commande commande){
        //veriffier le stock
        for(ProduitCommande produitCommande : commande.getProduitCommandes()){
            Produit produit = produitRepository.findById(produitCommande.getProduit().getId())
                    .orElseThrow(() -> new ProduitNotFounException("Produit non trouver "+ produitCommande.getProduit().getId()));
            if(produit.getStockDisponible() < produitCommande.getQuatite()){
                throw new InsufficentStockException("Stock Insuffisant pour le produit :" +produit.getNom());

            }

        }

        //Calcul du total de la commande
        double totaleCommande = 0.0 ;
        for(ProduitCommande produitCommande: commande.getProduitCommandes()){
            Produit produit = produitCommande.getProduit();
            double prixUnitaire = produit.getPrix();
            int quantite = produitCommande.getQuatite();
            double totalProduit = prixUnitaire * quantite;
            totaleCommande += totalProduit;
        }
        commande.setTotale(totaleCommande);


        return commandeRepository.save(commande);
    }



    public List<Commande> getAllCommandes(){
        return commandeRepository.findAll();
    }
    public Commande getCommandeById(Long id){
        return commandeRepository.findById(id).orElse(null);

    }

    public Commande saveCommande(Commande commande){
        return commandeRepository.save(commande);
    }
    public void deleteCommande(Long id){
        commandeRepository.deleteById(id);
    }
}
