package main;

import ejercicios.Recursividad1;
import ejercicios.Recursividad2;
import ejercicios.Recursividad3;
import ejercicios.Recursividad4;

public class Main {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 5;
        double n3 = 5;       
        int n4 = 123;
        Recursividad1 re1 = new Recursividad1();
        Recursividad2 re2 = new Recursividad2();
        Recursividad3 re3 = new Recursividad3();
        Recursividad4 re4 = new Recursividad4();
        int r1 = re1.calcularFactorial(n1);
        int r2 = re2.sumatoriaRecursiva(n2);
        double r3 = re3.sumatoriaFraccionaria(n3);
        int r4 = re4.invertirNumero(n4, 0);
        System.out.println("Resultado del ejercicio 1 = " + r1);
        System.out.println("Resultado del ejercicio 2 = " + r2);
        System.out.println("Resultado del ejercicio 3 = " + r3);
        System.out.println("Resultado del ejercicio 4 = " + r4);



    }
    
}
