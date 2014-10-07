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
public class Pato {
    
    int edad;
   
    public void hacerCuac(String cuac) {
        System.out.println(cuac);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
