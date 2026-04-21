package main;

import ejercicios.Recursividad1;
import ejercicios.Recursividad10;
import ejercicios.Recursividad11;
import ejercicios.Recursividad12;
import ejercicios.Recursividad13;
import ejercicios.Recursividad14;
import ejercicios.Recursividad2;
import ejercicios.Recursividad3;
import ejercicios.Recursividad4;
import ejercicios.Recursividad5;
import ejercicios.Recursividad7;
import ejercicios.Recursividad8;
import ejercicios.Recursividad9;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int n4 = 123;
        int a = 4;
        int b = 5;
        int m = 3;
        int k = 4;
        int div1 = 25;
        int div2= 5;
        int base = 3;
        int exponente = 2;
        int[] arr = {29, 63, 82, 38};
        int[][] mtx = {{62,37,29,98,72,13},{73,64,90,73,87,13,26}};

        
        Recursividad1 re1 = new Recursividad1();
        Recursividad2 re2 = new Recursividad2();
        Recursividad3 re3 = new Recursividad3();
        Recursividad4 re4 = new Recursividad4();
        Recursividad5 re5 = new Recursividad5();
        Recursividad7 re7 = new Recursividad7();
        Recursividad8 re8 = new Recursividad8();
        Recursividad9 re9 = new Recursividad9();
        Recursividad10 re10 = new Recursividad10();
        Recursividad11 re11 = new Recursividad11();
        Recursividad12 re12 = new Recursividad12();
        Recursividad13 re13 = new Recursividad13();
        Recursividad14 re14 = new Recursividad14();

        int r1 = re1.calcularFactorial(n);
        int r2 = re2.sumatoriaRecursiva(n);
        double r3 = re3.sumatoriaFraccionaria(n);
        int r4 = re4.invertirNumero(n4, 0);
        int r5 = re5.sumaDigitos(n);
        int r7 = re7.potencia(base, exponente);
        int r8 = re8.mcd(a, b);
        int r9 = re9.division(div1, div2);
        int r10 = re10.multiplicacion(a, b);
        int r11 = re11.sumaArreglo(arr, exponente);
        int r12 = re12.sumaMatriz(mtx, a, b);
        int r13 = re13.fibonacci(n);
        int r14 = re14.ackermann(m, k);

        System.out.println("Resultado del ejercicio 1 = " + r1);
        System.out.println("Resultado del ejercicio 2 = " + r2);
        System.out.println("Resultado del ejercicio 3 = " + r3);
        System.out.println("Resultado del ejercicio 4 = " + r4);
        System.out.println("Resultado del ejercicio 5 = " + r5);
        System.out.println("Resultado del ejercicio 7 = " + r7);
        System.out.println("Resultado del ejercicio 8 = " + r8);
        System.out.println("Resultado del ejercicio 9 = " + r9);
        System.out.println("Resultado del ejercicio 10 = " + r10);
        System.out.println("Resultado del ejercicio 11= " + r11);
        System.out.println("Resultado del ejercicio 12 = " + r12);
        System.out.println("Resultado del ejercicio 13 = " + r13);
        System.out.println("Resultado del ejercicio 14 = " + r14);



    }
    
}
