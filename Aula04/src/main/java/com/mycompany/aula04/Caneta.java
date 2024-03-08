/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author josemart
 */
public class Caneta {
    /*Atributos da classe*/
    public String modelo, cor;
    private float ponta;
    private boolean tampada;
    /*Método*/
    public Caneta(String m, String c, float p){ // Método contrutor 
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }
    
    //Primeiro Atributos público
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    //Segundo atributos privado
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    //Terceiro atributos
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
     public void tampar(){
        tampada = true;
    }
    public void destampar(){
        tampada = false;
    }
    //Quarto atributo
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }
   
    
    //Status
    public void status(){
        System.out.println("--Sobre a Caneta--");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor:" + this.getCor());
        System.out.println("Está Tampada: " + this.getTampada());
    }
    
    
}
