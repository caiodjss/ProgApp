/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhaaula;

import javax.swing.JOptionPane;

/**
 *
 * @author 013.397490
 */
public class MinhaClasse {
    public static void main(String args[]){
        /*
        String nome = JOptionPane.showInputDialog("Digite seu lindo nome!");
        JOptionPane.showMessageDialog(null, nome);
        System.out.println("O nome digitado foi: "+nome);
        */           
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("O primeiro numero!"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("O segundo numero!"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("O terceiro numero!"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("O quarto numero!"));
        
        JOptionPane.showMessageDialog(null, "A soma é: "+(num1+num2+num3+num4));
        JOptionPane.showMessageDialog(null, "A subtração é: "+(num1-num2-num3-num4));
        JOptionPane.showMessageDialog(null, "A multiplicação é: "+(num1*num2*num3*num4));
        JOptionPane.showMessageDialog(null, "A divisão é: "+(num1/num2/num3/num4));
        
    }
}