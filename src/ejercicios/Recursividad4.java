package ejercicios;

public class Recursividad4 {

    public static int invertirNumero(int n, int invertido){
        // Caso base
        if(n == 0){
            return invertido;
        }
        // Tomar último dígito y acumularlo
        return invertirNumero(n / 10, invertido * 10 + (n % 10));
    }
}

