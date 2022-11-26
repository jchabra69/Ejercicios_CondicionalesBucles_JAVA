/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_condicionalesbucles_java;

/** EJERCICIO 4
 * Escriba un programa que pida primero un número par y a
continuación un numero impar (positivos o negativos). En cada petición,
si el valor no es correcto se mostrará un aviso.

 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio_4 {

    
    public static void main(String[] args) {

        int par, impar;

        Scanner entrada = new Scanner(System.in);

        //Pido un número par
        System.out.println("Escribe un número par");
        par = entrada.nextInt();

        // Si es par, PIDO impar.
        if (par % 2 == 0) {
            System.out.println("Escribe un número impar");
            impar = entrada.nextInt();
            // Si es impar, doy OK    
            if (impar % 2 != 0) {
                System.out.println("¡Gracias por su colaboración!");
            }
            // Si el número par está bien pero el impar no, doy error.
                if (impar % 2 ==0) {
                    System.out.println("Dado que no has escrito un numero impar");
                    System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
                }
            //Si no era par, le pido un impar igualmente
        } else {
            System.out.println("No ha escrito un número par");
            System.out.println("Escriba un número impar");
            impar = entrada.nextInt();

            //Le doy error porque no ha hecho bien par.
            if (impar % 2 != 0) {
                System.out.println("Dado que no has escrito un numero par");
                System.out.println("Ejecute de nuevo el programa para volver a intentarlo");

                //Si no es impar, doy error.
            } else {
                System.out.println("No ha escrito un número impar");
                System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
                
            }
        }
    }
}
