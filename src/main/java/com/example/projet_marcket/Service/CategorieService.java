package com.example.projet_marcket.Service;

import com.example.projet_marcket.Entity.Categorie;
import com.example.projet_marcket.Repository.CategorieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorieService {

    private final CategorieRepository categorieRepository;



    public List<Categorie> getAllCategorie(){
        return categorieRepository.findAll();
    }

    public Categorie getCategorieById(Long id){
        return categorieRepository.findById(id).orElse(null);
    }

    public Categorie saveCategorie(Categorie categorie){
        return categorieRepository.save(categorie);
    }

    public void deleteCategorie(Long id){
        categorieRepository.deleteById(id);
    }
}
