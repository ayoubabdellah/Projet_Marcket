package com.example.projet_marcket.Service;

import com.example.projet_marcket.Entity.Commande;
import com.example.projet_marcket.Repository.CommandeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeService {
    private final CommandeRepository commandeRepository;



    public List<Commande> getAllCommandes(){
        return commandeRepository.findAll();
    }
    public Commande getCommandeById(Long id){
        return commandeRepository.findById(id).orElse(null);

    }

    public Commande saveCommande(Commande commande){
        return commandeRepository.save(commande);
    }
    public void deleteCommande(Long id){
        commandeRepository.deleteById(id);
    }
}
