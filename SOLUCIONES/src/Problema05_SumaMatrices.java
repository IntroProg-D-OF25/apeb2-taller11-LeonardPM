/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 */
public class Problema05_SumaMatrices {

    public static void main(String[] args) {
        // Matriz cuadrada
        int[][] matriz = {
                {9, 8, 7},
                {4, 5, 6},
                {3, 2, 1}
        };

        int suma = sumarMatriz(matriz);
        int resta = restarMatriz(matriz);
        int multiplicacion = multiplicarMatriz(matriz);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
    }


    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static int restarMatriz(int[][] matriz) {
        int resta = 0;
        boolean esPrimero = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPrimero) {
                    resta = matriz[i][j];
                    esPrimero = false;
                } else {
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }

    public static int multiplicarMatriz(int[][] matriz) {
        int multiplicacion = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        return multiplicacion;
    }
}
/**
 *Suma: 45
 * Resta: -27
 * Multiplicación: 362880
 */