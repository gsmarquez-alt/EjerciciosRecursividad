package ejercicios;

public class Recursividad11 {
    public static int sumaArreglo(int[] arr, int n) {
    if (n == 0) return 0;
    return arr[n - 1] + sumaArreglo(arr, n - 1);
}
}
