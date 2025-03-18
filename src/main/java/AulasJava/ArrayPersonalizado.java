/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

/**
 *
 * @author leona
 */
public class ArrayPersonalizado {
    public static void main(String[] args) {
       final int numCarros = 5;
       Carro[] carros = new Carro[numCarros];
       String[] modelosCarros ={"MBW M30","MBW M50","TOYOTA SUPRA MK4","GTR-34","ECLIPSE"}; 
       
       
      
        // Inicializar o array carros
       for(int i=0; i < numCarros; i++){
        carros[i] = new Carro(modelosCarros[i]);
        }
       // Imprimir carros
       for(Carro c:carros){
           c.info();
       }
       
    }
}
