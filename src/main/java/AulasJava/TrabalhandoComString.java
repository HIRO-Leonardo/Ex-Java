/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class TrabalhandoComString {

    public static void main(String[] args) {

        char[] texto_c = {'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a', '!'};
        char[] texto_c2 = new char[10];
        String texto_s = new String("CBF Cursos");
        int tam;
        char c;

        //Aula parte 1:
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String(texto_s);
        System.out.println(s2);

        String s3 = new String(texto_c);
        System.out.println(s3);

        String s4 = new String(texto_c, 0, 5);
        System.out.println(s4);

        //length, charAt getChars
        tam = texto_s.length();
        System.out.println("Tamanho do texto: " + tam);

        c = texto_s.charAt(2);
        System.out.println("charAt: " + c);

        texto_s.getChars(4, 10, texto_c2, 0);
        System.out.println(texto_c2);

        //Aula parte 2:
        String s5 = "CBF2 Curso de javA TESTE";
        String s6 = "CBF curso de java on";
        String s7 = new String("curso de java");

        //Comparar entre Strings :
        //equals ou == 
        if (s7.equals(s5)) {
            System.out.println("usando apenas equals");
            System.out.println("s7 igual s5");
        } else {
            System.out.println("usando apenas equals");
            System.out.println("s7 diferente de s5");
        }

        // equalsIgnoreCase
        if (s7.equalsIgnoreCase(s5)) {
            System.out.println("Usando equalsIgnoreCase");
            System.out.println("s7 igual s5");
        } else {
            System.out.println("Usando equalsIgnoreCase");
            System.out.println("s7 diferente de s5");
        }

        //CompareTo
        System.out.println("Usando o compapreTo");
        System.out.println(s5.compareTo(s7));

        //regionMatches
        System.out.println("Usando regionMatches ");
        if (s5.regionMatches(true, 0, s6, 0, 4)) {

            System.out.println("s6 diferente de s5");
        } else {

            System.out.println("s6 igual s5");
        }

        //Parte 3:
        String aulaParte3 = "CFB Cursos - Curso de Java";
        String aulaParte3s2 = " Feito por mim hehehe";
        String aulaParte4s1 = "   Feito por mim hehehe      ";

        String aulaStrings3;
        //startsWith e endsWith
        System.out.println("Usando startsWith");
        if (aulaParte3.startsWith("CFB")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
        System.out.println("Usando endsWith");
        if (aulaParte3.endsWith("Java")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        //indexOf
        System.out.println("Usando indexOf");
        System.out.println(aulaParte3.indexOf("C", 1));

        //substring
        System.out.println("Usando substrings");
        System.out.println(aulaParte3.substring(13, 16));

        //concat
        System.out.println("Usando concat");
        System.out.println(aulaParte3.concat(aulaParte3s2));

        //Parte 4
        // replace
        System.out.println("Usando replace");
        String aulaStrings2 = "Ola Mundo";
        aulaStrings3 = aulaStrings2.replace('l', 'L');
        System.out.println(aulaStrings3);

        //toLowerCasse - toUpperCase
        System.out.println("Usando toLowerCase");
        System.out.println(aulaParte4s1.toLowerCase());
        System.out.println("Usando toUpperCase");
        System.out.println(aulaParte4s1.toUpperCase());
        
        //trim
        System.out.println("usando o trim");
        System.out.println(aulaParte4s1.trim());
        
        //toCharArray
        System.out.println("Usando o toCharArray");
        char[] c3 = aulaParte4s1.toCharArray();
        System.out.println(c3);
        
        //split
        String textoAula4 = "Leonardo willian";
        System.out.println("Usando split");
        String[] s9 = textoAula4.split(" ");
        for (String s:s9) {
            System.out.println(s);
        }
        
    }
}
