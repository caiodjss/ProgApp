/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasabadao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 013.397490
 */
public class AulaSabadao {

    public static void main(String[] args) {
        ArrayList <String> nome = new ArrayList<>();

        Scanner x = new Scanner(System.in);
        System.out.println("Digite um nome");
        String y = x.nextLine();
        nome.add(y);

        System.out.println(nome);
    }
}