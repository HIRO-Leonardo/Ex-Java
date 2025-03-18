package AulasJava;

import java.util.Stack;

public class StackPilha<S> {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        carros.push("GTR-R34");
        carros.push("SUPRA MK4");
        carros.push("ECLIPSE 1995");
        carros.push("CAMARO ZL1");

        //System.out.println("Topo da pilha: " + carros.peek());
        System.out.println("Topo da pilha: " + carros.pop());
        System.out.println(carros);
        for (String c:carros){
            System.out.println(c);
        }

        System.out.println(carros.empty()?"Pilha vazia":"Pilha com elementos");





    }
}
