package com.example.projet_marcket.Controller;

import com.example.projet_marcket.Entity.Authentification;
import com.example.projet_marcket.Service.AuthentificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authentification")
@RequiredArgsConstructor
public class AuthentificationController {

    private final AuthentificationService authentificationService;



    @GetMapping("/")
    public ResponseEntity<List<Authentification>> getAllAuthentification(){
        List<Authentification> authentification=authentificationService.getAllAuthentification();
        return ResponseEntity.ok(authentification);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Authentification> getAuthentificationById(@PathVariable Long id){
        Authentification authentification= authentificationService.getAuthentificationById(id);
        return ResponseEntity.ok(authentification);
    }

    @PostMapping("/")
    public ResponseEntity<Authentification> saveAuthentification(@RequestBody Authentification authentification){
        Authentification savedAuthentification =authentificationService.saveAuthentification(authentification);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAuthentification);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteauthentification(@PathVariable Long id){
        authentificationService.deleteAuthentification(id);
        return ResponseEntity.noContent().build();
    }



}
