/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author josemart
 */
public class Caneta {
    /*Variável em JAVA*/
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    /*Método em JAVA*/
    void status (){
           System.out.println("Uma caneta de cor " + this.cor);
           System.out.println("Está tampada: " + this.tampada);
           System.out.println("Qual o modelo: " + this.modelo);
           System.out.println("Qual tipo de ponta utilizada nessa caneta: " + this.ponta);
    }
    void rabisca(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar tampada");
        }else{
            System.out.println("Rabiscando...");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
}
