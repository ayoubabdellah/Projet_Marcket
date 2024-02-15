package com.example.projet_marcket.Service;

import com.example.projet_marcket.Entity.Commande;
import com.example.projet_marcket.Entity.Produit;
import com.example.projet_marcket.Entity.ProduitCommande;
import com.example.projet_marcket.Repository.CommandeRepository;
import com.example.projet_marcket.Repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeService {
    private final CommandeRepository commandeRepository;
    private ProduitRepository produitRepository;



    public List<Commande> getAllCommandes(){
        return commandeRepository.findAll();
    }
    public Commande getCommandeById(Long id){
        return commandeRepository.findById(id).orElse(null);

    }

    public Commande passerCommande(Commande commande){
        for(ProduitCommande produitcommande : commande.getProduitCommandes()){
            Produit produit = produitRepository.findById(produitcommande.getProduit().getId();
        }
        return commandeRepository.save(commande);
    }
    public Commande saveCommande(Commande commande){
        return commandeRepository.save(commande);
    }
    public void deleteCommande(Long id){
        commandeRepository.deleteById(id);
    }
}
