/**
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional.
 * El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal
 * (quien es el único responsable de gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional.
 */

import java.util.Random;
import java.util.Scanner;

public class Problema01_ProcessM {

    static Random random = new Random();
    static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa limite de las columnas de la matriz: ");
        int limC = tcl.nextInt();
        System.out.println("Ingresa limite de las filas de la matriz: ");
        int limF = tcl.nextInt();

        int[][] matriz = new int[limF][limC]; // matriz[filas][columnas]
        creaMatriz(matriz);
        presentarMatriz(matriz);
        Pares(matriz);
        Impares(matriz);
        System.out.println("\n Promedio de la matriz ");
        System.out.printf("%.2f", promedioMatriz(matriz));
    }

    public static void creaMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

    }

    public static void presentarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void Pares(int[][] matriz) {
        System.out.println(" Números de pares de la matriz ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static void Impares(int[][] matriz) {
        System.out.println("\n Números de impares de la matriz ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static double promedioMatriz(int[][] matriz) {
        int proM = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                proM += matriz[i][j];
            }
        }
        return (double) proM / (matriz.length * matriz[0].length);
    }
}
/**
 * Ingresa limite de las columnas de la matriz:
 * 2
 * Ingresa limite de las filas de la matriz:
 * 2
 *
 * 5  0
 * 1  6
 *  Números de pares de la matriz
 * 0 6
 *  Números de impares de la matriz
 * 5 1
 *  Promedio de la matriz
 * 3.00
 */