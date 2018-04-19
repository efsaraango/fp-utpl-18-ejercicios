/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        String nombre ;
        System.out.print("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.print("ingrese su calificacion");
        calificacion = entrada.nextByte();

        if (calificacion >= 100) {
            System.out.printf("Usted está aprobado (excelente) con %d\n", calificacion, calificacion);
        } else {
            
            if (calificacion < 90 && calificacion >= 100) {
                System.out.printf("Usted está aprobado (muy buena) con %d\n", calificacion,calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Usted está aprobado (regular) con %d\n", calificacion,calificacion);

                } else {
                    System.out.printf("Usted está reprobado con %d\n", calificacion);
                    
                }
            }
        }
    }
}
