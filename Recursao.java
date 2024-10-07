/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author 013.397490
 */
public class Recursao {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

public static int sum (int k){
    if (k>0){
        return k + sum(k-1);
    }else{
            return 0;
        }
    }
}