/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

import java.util.Arrays;

/**
 *
 * @author leona
 */
public class MetodosParaFacilitarTrabalharComArray {
    public static void main(String[] args) {
        int[] num = {1,45,64,34,22,2,3,56,8,9,10,0,12,7,8,6,5,4,3};
        int[] num2 = new int[19];
        int[] num3 = {1,52,3456,45,54,6564,3456,346334,435,6456,6456,5};
        Arrays.sort(num);
        int valor=56;
        int pos = Arrays.binarySearch(num, 56);
        System.out.printf("%d esta no Array? %s - posicao:%d%n",valor, pos>-1?"SIM":"NAO",pos);
        
        
        
        
        
        
        
        
        
        
        //Arrays.sort(num);
        
        //Arrays.fill(num2, 100);
        
        //System.arraycopy(num, 0, num2, 0, num.length);
        //System.out.printf("Num igual num2? %s%n ",Arrays.equals(num, num2)? "Igual" : "Diferente");
        //System.out.printf("Num3 igual num2? %s%n ",Arrays.equals(num, num3)? "Igual" : "Diferente");
        
        
        //for(int n:num2){
        //    System.out.printf("%d - ",n);
        //}
    }
}
