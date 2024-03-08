/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03;

/**
 *
 * @author josemart
 */
public class Caneta {
    /*Atributos*/
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    /*Método*/
    public void status(){
        System.out.println("O modelo da sua caneta é " + this.modelo);
        System.out.println("A cor da sua caneta é " + this.cor);
        System.out.println("A carga da sua caneta é " + this.carga);
        System.out.println("A ponta da sua caneta é " + this.ponta);
        System.out.println("A sua caneta está tampada? " + this.tampada);
    }
    public void rabisca(){
        if(this.tampada == true){
            System.out.println("ERRO, Caneta tampada!");
        }else{
            System.out.println("Rabiscando...");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
}
