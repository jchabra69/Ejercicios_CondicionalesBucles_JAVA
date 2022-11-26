/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.ejercicios_condicionalesbucles_java;

/** EJERCICIO 6 
 * Realiza un programa que calcule los múltiplos del número M entre
 * el valor MIN y MAX. Los valores de M, MIN y MAX se leen de teclado. Ejemplo:
 * M = 4, MIN = 38, MAX = 50. Resultado: 40, 44, 48
 *
 * @author Jose-PC
 */
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int multiplo, max, min;
      
        System.out.println("Introduzca un múltiplo entero por teclado para calcularte la sumatoria entre un valor mínimo y máximo: ");
        multiplo = entrada.nextInt();
        System.out.println("Ahora introduce el valor mínimo:");
        min = entrada.nextInt();
        System.out.println("Y por último, el valor máximo:");
        max = entrada.nextInt();

        for (int i = 0; i<= max; i = i+multiplo){
            if (i >= min && i <= max) {
                System.out.print(" Resultado: "  +i );
            }
            
                
            
    }
    }
}
