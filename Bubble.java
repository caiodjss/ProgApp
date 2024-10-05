/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author 013.397490
 */
public class Bubble  {
    public static void main(String[] args) {
        int bubble[] = {5, 2, 8, 1, 6, 4, 9, 7, 3, 10, 0};
        
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                if (bubble[i] > bubble[j]){
                    int tmp = bubble[j];
                    bubble[j] = bubble[i];
                    bubble[i] = tmp;
                }
            }
        }
        for (int y = 10; y >= 0; y--){
            System.out.print(bubble[y] + " ");
        }
        
        System.out.println();
        
        for (int y = 0; y < 11; y++){
            System.out.print(bubble[y] + " ");   
        }
    }
}
