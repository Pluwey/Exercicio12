/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author 10725117676
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        Arrays.sort(numeros);
        
        System.out.print("\nNúmeros em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            System.out.print(numero + " ");
        }
        
        scanner.close();
    }
}
