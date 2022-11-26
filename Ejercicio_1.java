
package com.politecnicomalaga.ejercicios_condicionalesbucles_java;

/**
 * EJERCICIO 1 Escriba un programa que pida primero un número par y luego un
 * número impar (positivos o negativos). En caso de que uno o los dos valores no
 * sea correcto, se mostrará un único aviso.
 *
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        int par, impar;
    
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Escriba un número par: ");
        par = entrada.nextInt();
        
        System.out.println("Escriba un número impar");
        impar = entrada.nextInt();
        
        if (par % 2 == 0  && impar % 2 !=0) {
            
            System.out.println("!Gracias por su colaboración¡");
            
        } else {
            System.out.println("Uno o más de los valores que ha escrito no son correctos");
        }
        
        
        
    }
}
