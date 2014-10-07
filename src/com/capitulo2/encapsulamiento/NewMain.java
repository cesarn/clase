/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo2.encapsulamiento;

/**
 *
 * @author T
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pato p1=new Pato();
        //p1.setEdad(2);
        p1.hacerCuac("nada de esto es dificil");
        System.out.println(p1.getEdad());
    }
    
}
