package com.example.projet_marcket.Controller;

import com.example.projet_marcket.Entity.Commentaire;
import com.example.projet_marcket.Service.CommentaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commentaires")
@RequiredArgsConstructor
public class CommentaireController {

    private final CommentaireService commentaireService;




    @GetMapping("/")
    public ResponseEntity<List<Commentaire>> getAllCommentaires(){
        List<Commentaire> commentaires = commentaireService.getAllCommentaire();
        return ResponseEntity.ok(commentaires);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Commentaire> getCommentaireById(@PathVariable Long id){
        Commentaire commentaire = commentaireService.getCommentaireById(id);
        return ResponseEntity.ok(commentaire);
    }

    @PostMapping("/")
    public ResponseEntity<Commentaire> saveCommande(@RequestBody Commentaire commentaire){
        Commentaire savedCommentaire = commentaireService.saveCommentaire(commentaire);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCommentaire);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCommande(@PathVariable Long id ){
        commentaireService.deleteCommentaire(id);
        return ResponseEntity.noContent().build();
    }
}
