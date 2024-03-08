/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02;

/**
 *
 * @author josemart
 */
public class Aula02 {

    public static void main(String[] args) {
        /*Atributos*/
        /*1 Objeto*/
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        c1.rabisca();
        c1.status();
        
        System.out.println("");
        /*2 Objeto*/
        Caneta c2 = new Caneta();
        c2.modelo = "Big";
        c2.cor = "Vermelha";
        c2.destampar();
        c2.status();
        c2.rabisca();
        
    }
}
