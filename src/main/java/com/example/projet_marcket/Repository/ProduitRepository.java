package com.example.projet_marcket.Repository;

import com.example.projet_marcket.Entity.Categorie;
import com.example.projet_marcket.Entity.Produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
    //Recher de produits par nom
    /*List<Produit> findbyNom(String nom);

    //Recher de produits par categori
    List<Produit>findByCategorie(Categorie categorie);

    //Recher de produits par prix
    List<Produit>findByPrixlesThan(double prix);

    //Recher de produits par prix entre min est max
    List<Produit> findByPrixBetween(double prixMin,double PrixMax);*/

}
