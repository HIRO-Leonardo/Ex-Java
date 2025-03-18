package AulasJava;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();
        carros.add("GTR-R34");
        carros.add("SUPRA MK4");
        carros.add("ECLIPSE 1995");
        carros.add("CAMARO ZL1");

        System.out.println("Topo da fila: " + carros.peek());
        System.out.println("Topo da fila: " + carros.poll());
        System.out.println(carros);
        for (String c:carros){
            System.out.println(c);
        }

        System.out.println(carros.isEmpty()?"Fila vazia":"Fila com elementos");
    }
}
