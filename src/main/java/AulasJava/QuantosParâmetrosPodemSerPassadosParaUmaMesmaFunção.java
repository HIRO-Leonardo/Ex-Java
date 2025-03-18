/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

/**
 *
 * @author leona
 */
public class QuantosParâmetrosPodemSerPassadosParaUmaMesmaFunção {
    public static void main(String[] args) {
        
        //int[] valores = {1,10,30,40,60,70,80,90,100};
        int n1,n2,n3;
        n1=10;
        n2=100;
        n3=200;
        int res = soma(n1,n2,n3);
        System.out.printf("%d", res);
        
        
    }
    
    public static int soma(int... n){
        int resp=0;
        for(int v:n){
            resp+= v;
        }
        
        return resp;
    }
}
