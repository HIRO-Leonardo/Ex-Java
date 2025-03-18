/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Desafio {
    public static void main(String[] args) {
        // Metodo 2 com arrays
        Scanner teclado = new Scanner(System.in);
        final int maxPerguntas = 5;
        
        String resp;
        String nome;
        String[] perguntas = {
                "Qual a maior estrela do nosso sistema solar?",
                "Qual a primeira letra do alfabeto",
                "2X10 = ?",
                "Tranformes 1 lancou em que ano?",
                "Valor de PI"
        };
        
        String[] questoes = {
                "A) SOL  B)LUA C)MARTE",
                "A)A  B)C C)F",
                "A)40  B)20 C)60",
                "A)2007  B)2000 C)2013",
                "A) 3.1222  B)3.10 C)3.14"
        };
        String[] respostas ={"A","A","B","A","C"};
        int nota = 0;
        
        
        System.out.println("Qual seu nome?");
        nome = teclado.nextLine();
        for (int i = 0; i < maxPerguntas; i++) {
                System.out.println(perguntas[i]);
                System.out.println(questoes[i]);
                resp = teclado.nextLine();
                if (resp.equals(respostas[i])) {
                    nota += 2;
            }
                
                
                
        }
        if (nota >= 6) {
                    System.out.printf("Nome: %s voce foi aprovado com nota: %d %n", nome, nota);
            }else{
                    System.out.printf("Nome: %s voce foi reprovado com nota: %d %n", nome, nota);
        }
        
        
    
        /*
        String nome;
        String[] respostas ={"A","A","B","A","C"};
        int nota = 0;
        String resp;
        
        System.out.println("Nome:");
        nome = teclado.nextLine();
        
        System.out.println("Qual a maior estrela do nosso sistema solar?");
        System.out.println("A) SOL  B)LUA C)MARTE");
        System.out.println("---------------------------");
        resp = teclado.nextLine();
        if (resp.equals(respostas[0])) {
            nota += 2;
        }
        System.out.println("Qual a primeira letra do alfabeto");
        System.out.println("A)A  B)C C)F");
        System.out.println("---------------------------");
        resp = teclado.nextLine();
        if (resp.equals(respostas[1])) {
            nota += 2;
        }
        System.out.println("2X10 = ?");
        System.out.println("A)40  B)20 C)60");
        System.out.println("---------------------------");
        resp = teclado.nextLine();
        if (resp.equals(respostas[2])) {
            nota += 2;
        }
        System.out.println("Tranformes 1 lancou em que ano?");
        System.out.println("A)2007  B)2000 C)2013");
        System.out.println("---------------------------");
        resp = teclado.nextLine();
        if (resp.equals(respostas[3])) {
            nota += 2;
        }
        System.out.println("Valor de PI");
        System.out.println("A) 3.1222  B)3.10 C)3.14");
        System.out.println("---------------------------");
        resp = teclado.nextLine();
        if (resp.equals(respostas[4])) {
            nota += 2;
        }
        System.out.printf("Nota: %d ", nota);
        if (nota >= 6) {
            System.out.printf("Parabens %s sua nota foi %d portando vc voi aprovado!!!", nome, nota);
        }else{
            System.out.printf("Infelismente %s sua nota foi %d e voce reprovou ", nome, nota);
        }
        
        */
        
        //  Metodo 2:
        
        
        
        
    }
}
