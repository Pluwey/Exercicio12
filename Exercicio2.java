/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;
import java.util.Scanner;
/**
 *
 * @author 10725117676
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < 15; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            }
        System.out.println("\nO maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);
        
        sc.close();
    }
}
