package com.example.projet_marcket.Exception;

public class InsufficentStockException extends RuntimeException{
    public InsufficentStockException(String message){
        super(message);
    }
}
