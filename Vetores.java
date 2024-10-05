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
public class Vetores {
    public static void main (String [] args){
        
        int vidade[] = new int[5];
        String vnome[] = new String[5];
        
        Scanner x = new Scanner(System.in);
 
        for (int i = 0; i < 5; i++){
            
            System.out.println("qual o nome?");
            String nome = x.next();
            vnome[i] = nome;
            
            System.out.println("qual a idade?");
            int idade = x.nextInt();
            vidade[i] = idade;

        }
        for (int y = 0; y < 5; y++){
            System.out.println("Ola, " +vnome[y]);
            System.out.println("Sua idade eh " +vidade[y]);
            System.out.println();
            
        }
    }
}