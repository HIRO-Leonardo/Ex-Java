/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package AulasJava;

/**
 *
 * @author leona
 */
public class Switch {

    public static void main(String[] args) {
       int posicao = 2;
       int n1,n2;
       String op = "+";
       int total;
       n1=10;n2=5;
       
        switch (op) {
            case "+" -> {
                total = n1 + n2;
                System.out.println(total);
            }
            case "*" -> {
                total = n1 * n2;
                System.out.println(total);
            }
            case "-" -> {
                total = n1 - n2;
                System.out.println(total);
            }
            
            default -> System.out.printf("%s%n", "Sem medalha");
        }
    
    }
}
