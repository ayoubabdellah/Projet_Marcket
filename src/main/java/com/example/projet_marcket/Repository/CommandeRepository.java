package com.example.projet_marcket.Repository;

import com.example.projet_marcket.Entity.Authentification;
import com.example.projet_marcket.Entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long> {
    //recher de commande par utilisateur
  /*  List<Commande> findByAuthentification(Authentification authentification);

    //recherche commande par statu
    List<Commande>findByStatut(String statut);*/

}
