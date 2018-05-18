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
public class Taller1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numhijo;
        String gastos = "";
        String person;
        double gana = 0;
        double pasaje;
        double bar;
        double salida;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 =0;
        double sumtotal = 0;
        double total = 0;
        int padre;
        System.out.println("Cuanto dinero gana semanal");
        gana = entrada.nextDouble();
        System.out.println("Cuantos hijos tiene:");
        numhijo = entrada.nextInt();
        gastos = String.format("\n%35s\n\n%-15s%-15s%-15s%-15s", "Gastos Familia\n", "Personas", "Pasajes", "Bar", "Salida");
        entrada.nextLine();
        for(int contador = 1; contador <= numhijo ; contador ++){
            System.out.println("Ingrese hijo:");
            person = entrada.nextLine();
            System.out.println("Ingrese gasto Pasajes:");
            pasaje = entrada.nextDouble();
            System.out.println("Ingrese gasto Bar :");
            bar = entrada.nextDouble();
            System.out.println("Ingrese gasto Salidas");
            salida = entrada.nextDouble();
           
            sum1 = sum1 + pasaje;
            sum2 = sum2 + bar;
            sum3 = sum3 + salida;
            sumtotal = sum1 + sum2 + sum3;
            total= gana  - sumtotal ;
            entrada.nextLine(); 
            gastos = String.format("%s\n%-15s%-15.2f%-15.2f%-15.2f\n", gastos, person, pasaje, bar, salida);
           
        }
        System.out.println(gastos);
        if(sumtotal < gana){
                System.out.printf("El padre de familia le sobra dinero:\n%.2f\n",total);
        }else if (sumtotal > gana){
                System.out.printf("El padre de familia le falta dinero:\n%.2f\n",total);
        }else{
                System.out.println("El padre no tienes familia");
        } 
            
        
    }
}
