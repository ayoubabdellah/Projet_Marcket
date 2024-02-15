package com.example.projet_marcket.Controller;

import com.example.projet_marcket.Entity.Categorie;
import com.example.projet_marcket.Service.CategorieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;



    @GetMapping("/")
    public ResponseEntity<List<Categorie>> getAllCategorie(){
        List<Categorie> categories=categorieService.getAllCategorie();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorie> getCategorieById(@PathVariable Long id){
        Categorie categorie=categorieService.getCategorieById(id);
        return ResponseEntity.ok(categorie);
    }
    @PostMapping("/")
    public ResponseEntity<Categorie> saveCategorie(@RequestBody Categorie categorie){
        Categorie savedCategorie = categorieService.saveCategorie(categorie);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCategorie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Categorie> deleteCategorie(@PathVariable Long id){
        categorieService.deleteCategorie(id);
        return ResponseEntity.noContent().build();
    }



}
