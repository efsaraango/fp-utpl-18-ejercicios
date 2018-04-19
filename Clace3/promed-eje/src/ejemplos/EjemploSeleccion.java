/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Crear un progrma que permita ingresar una calificación por teclado si la calificación ingresada es mayor o igual a 5 y la calificación es menor 
    a 10, se debe precentar un mensaje que diga "Usted esta en supletorios" de lo contrario se precenta un mensaje con el valor de la calificación dividido
    para dos*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class EjemploSeleccion {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificación");
        calificacion = entrada.nextDouble();
        //python se usa "and"
        if (calificacion >= 5 && calificacion <10) {
            System.out.println("Usted esta en supletorio");  
        }
        else{
             // System.out.printf("%d",calificacion/2);
              double resultado = calificacion/2;
              System.out.printf("%.2f",resultado);
        }
      
    }
}
