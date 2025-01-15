/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo.
 * Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente.
 * Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado;
 * 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 */

import java.util.Scanner;

public class Problema02_Areas {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        while (continuar) {
            System.out.println("Area de: ");
            System.out.println("1)\tCuadrado");
            System.out.println("2)\tTriangulo");
            System.out.println("3)\tRectángulo");
            System.out.println("4)\tExit");
            int num = sc.nextInt();


            switch (num) {
                case 1:
                    System.out.println("Dame un lado del Cuadrado");
                    double ladoC = sc.nextDouble();
                    System.out.println("El area del cuadrado es:\t" + areaC(ladoC) + "\n");
                    break;
                case 2:
                    System.out.println("Dame base del Triangulo");
                    double baseT = sc.nextDouble();
                    System.out.println("Dame altura del Triangulo");
                    double alturaT = sc.nextDouble();
                    System.out.println("El area del rectángulo es:\t" + areaTri(baseT, alturaT) + "\n");
                    break;
                case 3:
                    System.out.println("Dame la base del Rectángulo");
                    double baseR = sc.nextDouble();
                    System.out.println("Dame la altura del Rectángulo");
                    double alturaRe = sc.nextDouble();
                    System.out.println("El area del rectángulo es de:\t" + areaRe(baseR, alturaRe) + "\n");
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("\nOpción invalida \n");
                    break;
            }
        }
    }

    public static double areaC(double l) {
        return l * l;
    }

    public static double areaRe(double b, double a) {
        return b * a;
    }

    public static double areaTri(double b, double a) {
        return (b * a) / 2;
    }
}
/**
 * Area de:
 * 1)	Cuadrado
 * 2)	Triangulo
 * 3)	Rectángulo
 * 4)	Exit
 * 1
 * Dame un lado del Cuadrado
 * 5
 * El area del cuadrado es:	25.0
 *
 * Area de:
 * 1)	Cuadrado
 * 2)	Triangulo
 * 3)	Rectángulo
 * 4)	Exit
 * 4
 */