package ejercicios;

public class Recursividad12 {

    public int sumaMatriz(int[][] matriz, int i, int j) {
        // Caso base: si se pasa de las filas
        if (i >= matriz.length) {
            return 0;
        }

        // Si se pasa de columnas, pasa a la siguiente fila
        if (j >= matriz[0].length) {
            return sumaMatriz(matriz, i + 1, 0);
        }

        // Suma el elemento actual + siguiente
        return matriz[i][j] + sumaMatriz(matriz, i, j + 1);
    }
}