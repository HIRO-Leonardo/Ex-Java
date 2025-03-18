/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDaVelha;
import java.util.Scanner;
/**
 *
 * @author leona
 */
public class JogoDaVelha {
    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        char simvoloAtual = 'X';
        Boolean game=true;
        String Vitoria = "";
        Scanner teclado = new Scanner(System.in);
        
        
        while(game){
            
        }
    }
    
    public static void desenharJogo(Campo[][] velha){
        //limparTela();
        
        System.out.print("0 1 2/n");
        System.out.printf("0   %c | %c | %c %n ", velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("    ------------");
        System.out.printf("0   %c | %c | %c %n ", velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("    ------------");
        System.out.printf("0   %c | %c | %c %n ", velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
        
        
    }
    
    
    
    
    
    
}
