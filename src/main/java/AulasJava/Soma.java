/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

/**
 *
 * @author leona
 */
public class Soma {
    public static void main(String[] args) {
        int soma=0;
        if (args.length <= 0) {
            System.out.printf("%s%n","Sem valores para somar");
            return;
        }
        
        for(String n:args){
            int v = Integer.parseInt(n);
            soma+= v;
        }
        
        System.out.printf("%nSoma dos valores: %d ",soma);
    }
}
