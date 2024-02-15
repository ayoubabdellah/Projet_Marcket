package com.example.projet_marcket.Service;

import com.example.projet_marcket.Entity.Produit;
import com.example.projet_marcket.Repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitService {

    private final ProduitRepository produitRepository;




    public List<Produit> getAllProduits(){
        return produitRepository.findAll();
    }

    public Produit getProduitById(Long id){
        return produitRepository.findById(id).orElse(null);
    }

    public Produit saveProduit(Produit produit){
        return produitRepository.save(produit);
    }

    public void deleteProduit(Long id){
        produitRepository.deleteById(id);
    }


}
