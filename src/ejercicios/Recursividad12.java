package ejercicios;

public class Recursividad12 {
    
    public static int sumaMatriz(int[][] mat, int i, int j) {
        if (i == mat.length){
            return 0;
        } 
            if (j == mat[0].length){
                return sumaMatriz(mat, i + 1, 0);
            } 
             return mat[i][j] + sumaMatriz(mat, i, j + 1);
    }
}
