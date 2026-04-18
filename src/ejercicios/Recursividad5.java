package ejercicios;

public class Recursividad5{

    public int sumaDigitos(int numero){

        if(numero == 0){
            return 0;
        }
        return (numero % 10) + sumaDigitos(numero / 10);
    }
}