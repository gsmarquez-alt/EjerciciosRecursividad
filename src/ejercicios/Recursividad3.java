package ejercicios;

public class Recursividad3 {

    public double sumatoriaFraccionaria(double numero){
        if(numero == 1){
            return 1;
        }
        return (1 / numero) + sumatoriaFraccionaria(numero - 1);
    }
}