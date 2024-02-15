package com.example.projet_marcket.Service;

import com.example.projet_marcket.Entity.Commentaire;
import com.example.projet_marcket.Repository.CommentaireRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentaireService {
    private final CommentaireRepository commentaireRepository;




    public List<Commentaire> getAllCommentaire(){
        return commentaireRepository.findAll();
    }

    public Commentaire getCommentaireById(Long id ){
        return commentaireRepository.findById(id).orElse(null);

    }

    public Commentaire saveCommentaire(Commentaire commentaire){
        return commentaireRepository.save(commentaire);
    }

    public void deleteCommentaire(Long id ){
        commentaireRepository.deleteById(id);
    }
}
