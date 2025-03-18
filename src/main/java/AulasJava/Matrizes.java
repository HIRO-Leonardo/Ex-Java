/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;
import java.security.SecureRandom;
/**
 *
 * @author leona
 */
public class Matrizes {
    public static void main(String[] args) {
        final int linha=3;
        final int coluna=5;
        int[][] numeros = new int[linha][coluna];
        
        
        
        geraDados(numeros, linha, coluna);
        impDados(numeros, linha, coluna);
         
    }
    
    
    
    
    
    public static void geraDados(int[][] mtz, int linha, int coluna){
        for(int l=0; l< linha; l++){
            for(int c=0; c < coluna; c++){
                mtz[l][c] = new SecureRandom().nextInt(100);
            }
        }
    }
    
    
    
    public static void impDados(int[][] mtz, int linha,int colunas){
        for(int l=0; l< linha; l++){
            for(int c=0; c < colunas; c++){
                System.out.printf("%d - ",mtz[l][c]);
            }
            System.out.printf("%n");
        }
    }
}
