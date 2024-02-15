package com.example.projet_marcket.Service;

import com.example.projet_marcket.Entity.Authentification;
import com.example.projet_marcket.Repository.AuthentificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthentificationService {
    private final AuthentificationRepository authentificationRepository;



    public List<Authentification> getAllAuthentification(){
        return authentificationRepository.findAll();
    }

    public Authentification getAuthentificationById(Long id){
        return authentificationRepository.findById(id).orElse(null);

    }
    public Authentification saveAuthentification(Authentification authentification){
        return authentificationRepository.save(authentification);

    }
    public void deleteAuthentification(Long id ){
        authentificationRepository.deleteById(id);
    }

}
