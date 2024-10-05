package Array;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 013.397490
 */
public class NumeroPar {
    
    public static void main(String[] args) {
    
        int par[] = new int[20];
    
        for (int i = 0; i < 20; i++){
            if ( i % 2 == 0){
                par[i]=i;
                System.out.println("O numero " + i + " eh par");
            }
        }
    }      
}