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
public class BuscarNome {
    
    public static void main (String args[]){

        int idade[] = new int[10];
        Scanner x = new Scanner (System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Digite a idade " + (i+1));
            idade[i] = x.nextInt();
        }

        for (int idades:idade){
            System.out.println(idades);
        }
    }
}