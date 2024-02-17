package com.example.projet_marcket.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Getter @Setter
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Authentification authentification;

    @OneToMany(mappedBy = "commande")
    private List<ProduitCommande> produitCommandes;
    private Date dateCommande;
    private String statut;
    private double Totale;

}
