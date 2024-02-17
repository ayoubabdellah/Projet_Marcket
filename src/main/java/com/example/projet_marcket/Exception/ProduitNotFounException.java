package com.example.projet_marcket.Exception;

public class ProduitNotFounException extends RuntimeException{
    public ProduitNotFounException (String message){
        super(message);
    }
}
