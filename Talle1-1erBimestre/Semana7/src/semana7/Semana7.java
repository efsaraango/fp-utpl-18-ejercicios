
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

         int numhijo;
        String gastos = "";
        String reporte;
        String person;
        String nombre;
        String respu;
        double gana = 0;
        double pasaje;
        double bar;
        double salida;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        double sumtotal = 0;
        double total = 0;
        int padre;
        reporte = String.format("Reporte Gastos de Padres de Familia");
        System.out.println("Cuantas Familias se preguntara:");
        padre = entrada.nextInt();

        entrada.nextLine();

        for (int contador1 = 1; contador1 <= padre; contador1++) {
            

            System.out.println("Nombre del padre de familia:");
            nombre = entrada.nextLine();
            System.out.printf("Cuanto dinero gana semanal familia:");
            gana = entrada.nextDouble();
            System.out.println("Cuantos hijos tiene:");
            numhijo = entrada.nextInt();

            gastos = String.format("%s\nNombre de padre de Familia: %s\nSueldo Semanal: %.2f\nNúmero de Hijos: %d\n\nReporte Gastos Familia\n%-15s%-15s%-15s%-15s\n", gastos, nombre, gana, numhijo, "Persona", "Pasaje", "Bar", "Salida");
                entrada.nextLine();
            for (int contador = 1; contador <= numhijo; contador++) {
                System.out.printf("Ingrese hijo %d:\n", contador);
                person = entrada.nextLine();
                System.out.println("Ingrese gasto Pasajes:");
                pasaje = entrada.nextDouble();
                System.out.println("Ingrese gasto Bar :");
                bar = entrada.nextDouble();
                System.out.println("Ingrese gasto Salidas");
                salida = entrada.nextDouble();

            

                gastos = String.format("%s\n%-15s%-15.2f%-15.2f%-15.2f\n", gastos, person, pasaje, bar, salida);

                sum1 = sum1 + pasaje;
                sum2 = sum2 + bar;
                sum3 = sum3 + salida;
                
                entrada.nextLine();
            }

            gastos = String.format("%s\n%-15s\t%-15.2f%-15.2f%-15.2f\n", gastos, "totales", sum1, sum2, sum3);

            sumtotal = sum1 + sum2 + sum3;

            if (sumtotal < gana) {
                respu = "sobro";
            } else if (sumtotal == gana) {
                respu = "alcanzo";
            } else {
                respu = "falto";
            }

            gastos = String.format("%sEl padre de familia %s el dinero le %s", gastos, nombre, respu);

            reporte = String.format("%s\n%s", reporte, gastos);

        }
        System.out.println(reporte);
    }
}

