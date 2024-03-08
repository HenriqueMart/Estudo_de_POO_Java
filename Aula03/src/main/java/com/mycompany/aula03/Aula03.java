/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula03;

/**
 *
 * @author josemart
 */
public class Aula03 {

    public static void main(String[] args) {
        /*Objeto*/
        /*Atributos*/
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 50;
        //c1.tampada = true;
     
        
        
        
        /*Método*/
        c1.destampar();
        c1.status();
        System.out.println("");
        c1.rabisca();
        
    }
}
