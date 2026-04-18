package ejercicios;

public class Recursividad1 {

    public int calcularFactorial(int numero){
        if(numero == 0){
            return 1;
        }
        return numero * calcularFactorial(numero - 1);
    }
}
