/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

/**
 *
 * @author leona
 */
public class PassagemPorValorePorReferência {
    public static void main(String[] args) {
        
        int[] notas = {10,40,60,07,80,88,66,55,77,88,99,100,61,76,102,22,323,22,23,3,4,5356443,6534,23,43,24,56,7,75,62,60};
        int[] resultado = {0,0};
        
        conferirNotas(notas, resultado);
        
        System.out.printf("Aprovados: %d%n", resultado[0]);
        System.out.printf("Reprovados: %d%n", resultado[1]);
    }
    
    public static void conferirNotas(int[] nt,int[] r){
        for(int n:nt){
            if (n >=60) {
               r[0]++;
            }else{
                r[1]++;
            }
        }
    }
}
