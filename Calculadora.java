/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author 013.397490
 */
public class Calculadora {
    public double Somar(double a, double b){
        double c = a+b;
        return c;
    }   
    public double Subtrair(double a, double b){
        double c = a-b;
        return c;
    }
    public double Multiplicar(double a, double b){
        double c = a*b;
        return c;
    }
    public double Dividir(double a, double b){
        double c = a/b;
        return c;    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double x = Double.parseDouble(JOptionPane.showInputDialog("Valor de A"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Valor de B"));
        String o = JOptionPane.showInputDialog("Qual a operação?");
        
        if (o.equals("+")){
            System.out.println(c.Somar(x,y));
        }
        else if (o.equals("-")){
            System.out.println(c.Subtrair(x,y));
        }
        else if (o.equals("*")){
            System.out.println(c.Multiplicar(x,y));
        }
        else if (o.equals("/")){
            System.out.println(c.Dividir(x,y));
        }
        else {
            System.out.println("Operação inválida");
        }
    }   
}