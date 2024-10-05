/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasabadao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 013.397490
 */
public class NewClass {
    public static void main(String[] args) {
        
        ArrayList <Integer> par = new ArrayList<>();        
        Scanner n = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        int valor = n.nextInt();
        
        if (valor % 2 == 0){
            par.add(valor);
            System.out.println("Numero par adicionado");
        }
        else{
            System.out.println("Valor impar");
        }
    }
}
