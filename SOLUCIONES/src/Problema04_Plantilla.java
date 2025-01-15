/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble.
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes.
 * Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 *
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble.
 * Y se genera el siguiente reporte:
 *
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 *
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio.
 * Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 */

import java.util.Scanner;

public class Problema04_Plantilla {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        boolean continua = true;
        String nombre;
        int id;
        while (continua) {
            System.out.println("Seleccione una opción ");
            System.out.println("1. Calcular valor de la planilla de luz");
            System.out.println("2. Calcular valor del predio de un bien ");
            System.out.println("3. Salir");
            switch (tcl.nextInt()) {
                case 1:
                    System.out.println("Ingrese nombre del Cliente");
                    nombre = tcl.next();
                    tcl = new Scanner(System.in);
                    System.out.println("Ingrese su cédula");
                    id = tcl.nextInt();
                    System.out.println("Ingrese los kilowatts consumidos por mes");
                    int kilowattsT = tcl.nextInt();
                    System.out.println("Ingrese el valor de Kilowatts");
                    int vKilowatts = tcl.nextInt();
                    System.out.println(planillaLuz(nombre, id, kilowattsT, vKilowatts));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del Cliente");
                    nombre = tcl.nextLine();
                    System.out.println("Ingrese sus cédula");
                    id = tcl.nextInt();
                    System.out.println("Ingrese el valor del inmueble");
                    int inmueble = tcl.nextInt();
                    System.out.println(valorP(nombre, id, inmueble));
                    break;
                case 3:
                    continua = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

    }

    public static String planillaLuz(String name, int cedula, double kMes, double costoK) {
        return "Cliente " + name + " con cédula  " + cedula + " tiene que cancelar el valor de $" + (costoK * kMes) + ".";
    }

    public static String valorP(String name, int id, double valorInmueble) {
        return "Cliente " + name + " con cédula " + id + " tiene un bien inmueble valorado en " + valorInmueble + " y tiene que pagar de predio $" + (valorInmueble * 0.02) + ".";
    }
}
/**
 *Seleccione una opción
 * 1. Calcular valor de la planilla de luz
 * 2. Calcular valor del predio de un bien
 * 3. Salir
 * 1
 * Ingrese nombre del Cliente
 * leo
 * Ingrese su cédula
 * 1105976870
 * Ingrese los kilowatts consumidos por mes
 * 5
 * Ingrese el valor de Kilowatts
 * 9
 * Cliente leo con cédula  1105976870debe cancelar el valor de $45.0.
 * Seleccione una opción
 * 1. Calcular valor de la planilla de luz
 * 2. Calcular valor del predio de un bien
 * 3. Salir
 * 3
 */
