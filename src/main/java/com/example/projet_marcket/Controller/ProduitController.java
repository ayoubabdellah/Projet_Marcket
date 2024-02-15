package com.example.projet_marcket.Controller;

import com.example.projet_marcket.Entity.Produit;
import com.example.projet_marcket.Service.ProduitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;



    @GetMapping("/")
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public Produit getProduitByProduit(@PathVariable Long id ){
        return produitService.getProduitById(id);
    }

    @PostMapping("/")
    public Produit saveProduit(@RequestBody Produit produit){
        return produitService.saveProduit(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id){
        produitService.deleteProduit(id);
    }

}
