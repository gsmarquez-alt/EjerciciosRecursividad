package ejercicios;

public class Recursividad9 {
    public int division(int a, int b){
        if (a < b) {
            return 0;
        }
        return 1 +  division(a - b, b);
    }
}
