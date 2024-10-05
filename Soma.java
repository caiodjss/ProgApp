/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author 013.397490
 */
public class Soma {
    public static void main(String[] args) {
        int v1[] = new int[10];
        int v2[] = new int[10];
        int v3[] = new int[10];
        
        Scanner x = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            
            System.out.println("Qual o primeiro numero?");
            int n1 = x.nextInt();
            v1[i] = n1;
            
            System.out.println("Qual o segundo numero?");
            int n2 = x.nextInt();
            v2[i] = n2;
            
            v3[i] = v1[i] + v2[i];
        }
        for (int y = 0; y < 10; y++){
            System.out.println("A soma de " + v1[y] + " com " + v2[y] + " eh: " + v3[y]);
        }
    }
}
