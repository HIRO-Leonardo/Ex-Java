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
public class ArrayListAula {
    public static void main(String[] args) {
        
        
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>(100);
        
        numeros.add(10);
        numeros.add(22);
        numeros.add(33);
        
        carros.add("GTR R-34");
        carros.add("TOYOTA SUPRA MK4");
        carros.add("L-200 TRITON");
        carros.add(1, "PAJERO");
        /*
        for(int n:numeros){
            System.out.println(n);
        }
        System.out.println("");
        
        for(String c:carros){
            System.out.println(c);
        }
        */
        carros.trimToSize();
        
        //System.out.println("Nome do veiculo: " + carros.indexOf("L-200 TRITON"));
        //System.out.println(carros.remove("PAJERO"));
        carros.remove(2);
        
        
        for (int i = 0; i < carros.size() ; i++) {
            System.out.println("Nome do veiculo: " + carros.get(i));
            System.out.println("");
        }
        
        
        
        
        
        
        
    }
}
