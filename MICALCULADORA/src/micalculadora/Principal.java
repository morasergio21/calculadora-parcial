package micalculadora;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
   public static void main(String[] args){
       
      //  crear objeto de la clase Calculadora
      
    Calculador  miCalculadora; //definicion 
    miCalculadora=new Calculador(); //construir el objeto
    
     Scanner miScanner;
     miScanner = new Scanner(System.in);
     
     int entrada;
     System.out.println("Ingresar el valor de X:");
     entrada = miScanner.nextInt();
     miCalculadora.setX(entrada);

     System.out.println("Ingresar el valor de Y:");
     entrada = miScanner.nextInt();
     miCalculadora.setY(entrada);
     
     miCalculadora.sumar();
        System.out.println("El resultado de la suma es:");
        System.out.println(miCalculadora.getZ());

        miCalculadora.restar();
        System.out.println("El resultado de la resta es:");
        System.out.println(miCalculadora.getZ());
     
   }
}
