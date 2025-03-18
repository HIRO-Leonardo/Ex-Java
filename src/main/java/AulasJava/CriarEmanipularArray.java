/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

/**
 *
 * @author leona
 */
public class CriarEmanipularArray {
    public static void main(String[] args) {
        // Basico sobre Arrays:
        
        //int[] num = new int[5];
        int[] num={10,20,30,40,50,};
        /*num[0]=52;
        num[1]=5231;
        num[2]=645;
        num[3]=34;
        num[4]=22;
        */
        
        // Array normal:
        System.out.println("Array normal");
        for (int i = num.length - 1; i >= 0; i--) {
            
            System.out.printf("%d%n",num[i]);
        }
        
        // Array especifico para Array:
        System.out.println("For especifico para Array");
        for(int n:num){
            System.out.printf("%d%n",n);
        }
            
        
        
    }
}
