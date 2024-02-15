package com.example.projet_marcket.Controller;


import com.example.projet_marcket.Entity.Commande;
import com.example.projet_marcket.Service.CommandeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")
@RequiredArgsConstructor
public class CommandeController {
    private final CommandeService commandeService;



    @GetMapping("/")
    public ResponseEntity<List<Commande>> getAllCommandes(){
        List<Commande> commandes = commandeService.getAllCommandes();
        return ResponseEntity.ok(commandes);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Commande> getCommandeById(@PathVariable Long id){
        Commande commande = commandeService.getCommandeById(id);
        return ResponseEntity.ok(commande);
    }

    @PostMapping("/")
    public ResponseEntity<Commande> saveCommande(@RequestBody Commande commande){
        Commande savedCommande = commandeService.saveCommande(commande);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCommande);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCommande(@PathVariable Long id ){
        commandeService.deleteCommande(id);
        return ResponseEntity.noContent().build();
    }
}
