package ejercicios;

public class Recursividad2 {
    public int sumatoriaRecursiva(int numero){
        if(numero == 0){
            return 0;
        }
        return numero + (sumatoriaRecursiva(numero - 1));
    }
}
