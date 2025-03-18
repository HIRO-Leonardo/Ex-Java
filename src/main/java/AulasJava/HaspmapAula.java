package AulasJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HaspmapAula {
    public static void main(String[] args) {
        HashMap<Integer,String> carros= new HashMap<Integer,String>();
        carros.put(1, "GTR-34");
        carros.put(2,"SUPRA MK4");
        carros.put(3, "GTR-33");
        carros.put(4,"SUPRA MK5");
        carros.put(5, "GTR-32");
        carros.put(6,"SUPRA MK3");

        System.out.println(carros);

        carros.remove(6);



        System.out.println(carros.get(2));
        System.out.println("For normal");
        for (int i = 1; i < carros.size() + 1; i++){
            System.out.println(carros.get(i));
        }

        System.out.println("For para arrays");
        for (String c:carros.values()){
            System.out.println(c);
        }

        System.out.println("\n");
        System.out.println("HashSet");
        System.out.println("\n");

        HashSet<String> personagens = new HashSet<String>();
        personagens.add("Klukai");
        personagens.add("Groza");
        personagens.add("Kalina");
        personagens.add("Lenna");

        System.out.println(personagens);

    }
}
