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
public class Array2 {
    
    public static void main (String args[]){
    
        String nome[] = new String[5];
        
        Scanner m = new Scanner (System.in);
        
        for (int i = 0; i < 5; i++){
            
            System.out.println("Digite um nome ");
            String c = m.nextLine();
            nome[i] = c;
        }
        
        for (String x:nome)
            System.out.println(x);
    }
}
