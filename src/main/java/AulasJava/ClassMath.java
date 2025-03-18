package AulasJava;

public class ClassMath {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int resultMax = Math.max(a,b);
        int resultMin = Math.min(a,b);

        double c = 64;
        double d = -64;


        double resultSqrt = Math.sqrt(c);

        double resultAbs = Math.abs(c);






        System.out.println("Resultado minimo de a e b: " + resultMin + "\n");
        System.out.println("Resultado maximo de a e b: " + resultMax + "\n");
        System.out.println("Raiz quadrada de c: " + resultSqrt + "\n");
        System.out.println("Valor absoluto de d: " + resultAbs + "\n");
        //for (int i= 0; i < 10; i ++){
          //  int resultRandom = (int)(Math.random()*101);
           // System.out.println("Random com caster para int: " + resultRandom);
        //}
        for (int i= 0; i < 10; i ++){
            double resultRandom = Math.floor(Math.random()*101);
            System.out.println("Random com caster para int: " + resultRandom);
        }



    }
}
