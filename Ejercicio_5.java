
package com.politecnicomalaga.ejercicios_condicionalesbucles_java;

/** EJERCICIO 5 
 * Realiza un programa que calcule la suma acumulada de los primeros
 * N números positivos, siendo N obtenido por teclado. Es decir, si N = 3, el
 * resultado es 1+2+3 -> 6 Si N = 5, el resultado es 1+2+3+4+5 -> 15
 *
 * @author Jose-PC
 */

import java.util.Scanner;
        
public class Ejercicio_5 {

    public static void main(String[] args) {
        
        int n = 0;
        int resultado = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un número y te calcularé la suma acumulada de este:");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            resultado = resultado+i;
            System.out.println("Sumando... " +i );
            System.out.println("La suma acumulada es: " +resultado);
        }
    }
}
