package com.example.projet_marcket.Repository;

import com.example.projet_marcket.Entity.Commentaire;
import com.example.projet_marcket.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {

    //Recherche Commantaires par produit
    /*List<Commentaire> findByProduit(Produit produit);*/
}
