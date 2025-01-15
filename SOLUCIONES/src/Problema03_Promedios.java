/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros.
 * Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal.
 * Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 */

import java.util.Scanner;

public class Problema03_Promedios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa Promedio: ");
        double premed = sc.nextDouble();
        System.out.println(calcuPromedio(premed));
    }

    public static String calcuPromedio(double promedio) {
        if (0 < promedio && promedio <= 5) {
            return "Regular";
        } else if (promedio <= 8) {
            return "Bueno";
        } else if (promedio <= 9) {
            return "Exelente";
        } else if (promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "El promedio es invalido";
        }

    }
}
/**
 * Ingresa Promedio:
 * 7.12
 * Bueno
 */