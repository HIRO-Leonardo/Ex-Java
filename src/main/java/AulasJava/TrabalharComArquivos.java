/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 *
 * @author leona
 */
public class TrabalharComArquivos {

    public static void main(String[] args) throws IOException {
        Path diretorio = Paths.get("C:/Users/leona/OneDrive/Documents/NetBeansProjects/teste12/src/main/java/AulasJava");
        Path arquivo = Paths.get("C:/Users/leona/OneDrive/Documents/NetBeansProjects/teste12/src/main/java/AulasJava/Matrizes.java");
        if (Files.isDirectory(diretorio)) {
            System.out.println("Caminho existe");
        } else {
            System.out.println("Nao existe");
        }

        if (Files.exists(arquivo)) {
            System.out.println("Arquivo existe");
        } else {
            System.out.println("Arquivo nao existe");
        }

        //Parte 2:
        Path arquivoAula2 = Paths.get("C:/Users/leona/OneDrive/Documents/Padaria/loginesenha.txt");

        List<String> linhas = Files.readAllLines(arquivoAula2);
        
        //for (String linha:linhas) {
        //    System.out.println(linha);
        //}
        
        linhas.forEach(linha -> System.out.println(linha));

    }
}
