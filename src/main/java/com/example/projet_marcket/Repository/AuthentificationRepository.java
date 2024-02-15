package com.example.projet_marcket.Repository;

import com.example.projet_marcket.Entity.Authentification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AuthentificationRepository extends JpaRepository<Authentification,Long> {
    //recher d'un utilisateur par son nom
   // Optional<Authentification> findByNomAuthentification(String nomAuthentification);
}
