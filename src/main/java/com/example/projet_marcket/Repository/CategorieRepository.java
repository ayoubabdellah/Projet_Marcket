package com.example.projet_marcket.Repository;

import com.example.projet_marcket.Entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
    //recherche de categori par nom
   // List<Categorie> findbyNom(String nom);
}
