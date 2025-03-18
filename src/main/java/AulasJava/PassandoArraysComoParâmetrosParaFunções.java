/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

/**
 *
 * @author leona
 */
public class PassandoArraysComoParâmetrosParaFunções {
    public static void main(String[] args) {
        int[] numeros = {1,5,36,37,34,542,5,23353245,46336,234132,1231467};
        
        parImpar(numeros);
    }
    
    public static void parImpar(int[] num){
       
        for (int n:num) {
            if (n%2 == 0) {
                System.out.printf("%d: %s%n",n,"Par");
            }else{
                 System.out.printf("%d: %s%n",n,"Impar");
            }
            
            
            
            
        }
    }
}
