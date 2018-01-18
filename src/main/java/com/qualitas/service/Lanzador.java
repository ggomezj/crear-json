package com.qualitas.service;
import com.google.gson.Gson;
import com.qualitas.modelo.entities.Computadora;

public class Lanzador {
  public static void main (String[] args){
    Computadora compu=new Computadora("HP",8,500);
     Gson gson = new Gson();
        String json = gson.toJson(compu);
        System.out.println(compu);
        System.out.println(json);
        
  }
}
