
package com.politecnicomalaga.ejercicios_condicionalesbucles_java;

/** EJERCICIO 2
 * Escriba un programa que pida primero un número par (positivo o
negativo) y si el valor no es correcto, muestre un aviso. Si el valor es
correcto, pedirá un número impar (positivo o negativo) y si el valor no
es correcto, mostrará un aviso.
 * @author Jose-PC
 */

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        int par, impar;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba un número par: ");
        par = entrada.nextInt();

        if (par % 2 == 0) {

            System.out.println("Escriba un número impar");
            impar = entrada.nextInt();

            if (impar % 2 != 0) {

                System.out.println("¡Gracias por su colaboración!");

            } else {
                System.out.println("No ha escrito un número impar");
                System.out.println("Ejecute de nuevo el programa para intentarlo");
            }

        } else {
            System.out.println("No ha escrito un número par");
            System.out.println("Ejecute de nuevo el programa para intentarlo");

        }

    }
}
