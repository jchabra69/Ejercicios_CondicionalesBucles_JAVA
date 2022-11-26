/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_condicionalesbucles_java;

/** EJERCICIO 3
 *  Escriba un programa que pida primero un número par y a
continuación un numero impar (positivos o negativos). En caso de que uno
o los dos valores no sean correctos, se mostrarán uno o dos avisos.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        int par, impar;

        Scanner entrada = new Scanner(System.in);

        //Pido número par
        System.out.println("Escriba un número par: ");
        par = entrada.nextInt();

        //Si es par el número...
        if (par % 2 == 0) {

            //Entonces pido un impar
            System.out.println("Escriba un número impar");
            impar = entrada.nextInt();

            //Si es impar también, doy buen resultado.
            if (impar % 2 != 0) {

                System.out.println("¡Gracias por su colaboración!");

                //Si ninguno es par o impar, doy error.
                if (par % 2 == 0 && impar % 2 != 0) {

                    System.out.println("No ha escrito un número par");
                    System.out.println("No ha escrito un número impar");
                    System.out.println("Ejecute de nuevo el programa para intentarlo");
                }
                //Si no es impar, doy error.
            } else {
                System.out.println("No ha escrito un número impar");
                System.out.println("Ejecute de nuevo el programa para intentarlo");
            }
            //Si no es par, doy error.
        } else {
            System.out.println("No ha escrito un número par");
            System.out.println("Ejecute de nuevo el programa para intentarlo");
            

        }

    }
}

       
