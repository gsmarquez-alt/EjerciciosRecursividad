package ejercicios;

public class Recursividad7 {

    public int potencia(int base, int exp){
        if(exp == 0){
            return 1;
        }
        return base * potencia(base, exp - 1);
    }
}
