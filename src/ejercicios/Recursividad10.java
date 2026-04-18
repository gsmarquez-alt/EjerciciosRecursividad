package ejercicios;

public class Recursividad10{

    public int multiplicacion(int a, int b){
        if(b == 0){
            return 0;
        }
        return a + multiplicacion(a, b - 1);
    } 

}