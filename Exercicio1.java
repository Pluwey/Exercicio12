/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;
import java.util.Scanner;

/**
 *
 * @author 10725117676
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X[] = new int[10]; 
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            X[i] = sc.nextInt();
            soma += X[i];
        }
        System.out.println("A soma é: " + soma);
        sc.close();
    }
}
