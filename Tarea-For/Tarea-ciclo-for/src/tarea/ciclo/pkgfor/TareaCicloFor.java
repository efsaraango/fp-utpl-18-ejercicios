/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.ciclo.pkgfor;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class TareaCicloFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String reporte;
        String reporte1;
        String nombre;
        String asignom;
        String resulfi;
        int numrepor;
        int edad;
        int numasig;
        double prom, prom1 = 0, prom2 = 0, prom3 = 0;
        double bim1;
        double bim2;

        System.out.printf("Ingrese numero de reportes: ");
        numrepor = entrada.nextInt();

        reporte1 = String.format("Reporte Calificaciones de Estudiantes");

        for (int cont = 1; cont <= numrepor; cont++) {
            entrada.nextLine();

            System.out.printf("\nNombre del Estudiante: ");
            nombre = entrada.nextLine();
            System.out.printf("Edad: ");
            edad = entrada.nextInt();
            System.out.printf("Cantidad de Materias: ");
            numasig = entrada.nextInt();

            reporte = String.format("Nombre del Estudiante %d: %S\nEdad: %d\nCantidad de Asignatura: %d\nRoporte de Notas\n%-14s%-14s%-14s%-14s\n", cont, nombre, edad, numasig, "Asignatura", "Bim-1", "Bim-2", "Promedio");

            for (int cont2 = 1; cont2 <= numasig; cont2++) {
                entrada.nextLine();

                System.out.printf("Nombre de Materia: %d\n", cont2);
                asignom = entrada.nextLine();
                System.out.printf("Nota Bim-1: ");
                bim1 = entrada.nextDouble();
                System.out.printf("Nota Bim-2: ");
                bim2 = entrada.nextDouble();

                prom = (bim1 + bim2) / 2;

                reporte = String.format("%s%-15s%-15.2f%-15.2f%-15.2f\n", reporte, asignom, bim1, bim2, prom);

                prom1 = prom1 + prom;

            }
            prom1 = prom1 / numasig;
            prom2 = prom2 + prom1;
            prom3 = prom3 + edad;

            reporte = String.format("%s%30s%-15.2f\n\n", reporte, "Promedio", prom1);

            if (prom1 < 13) {
                resulfi = "Regular";
            } else if (prom1 >= 13 & prom1 < 16) {
                resulfi = "Bueno";
            } else if (prom1 >= 16 & prom1 < 19) {
                resulfi = "Muy Bueno";
            } else {
                resulfi = "Sobresaliente";
            }

            reporte = String.format("%s%s tiene un promedio de %s\n", reporte, nombre, resulfi);
            reporte1 = String.format("%s\n%s", reporte1, reporte);

        }
        prom2 = prom2 / numrepor;
        prom3 = prom3 / numrepor;

        reporte1 = String.format("%s\n\nInfomracion global de los estudiantes:\nPromedio de edad es: %.2f\nPromedio de Notas de los estudiantes es: %.2f", reporte1, prom3, prom2);

        System.out.printf("%s\n", reporte1);
    }

}
