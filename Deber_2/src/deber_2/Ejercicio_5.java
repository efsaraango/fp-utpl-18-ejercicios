/*
- La conversión de grados Celcius (C) a Fahrenheit (F) se realiza con la siguiente expresión matemática:
F = (9/5)*C+32

La conversión de Fahrenheit (F) a grados Celcius (C) se realiza con la siguiente expresión matemática:

F = (F-32)5/9
 */
package deber_2;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class Ejercicio_5 {
    public static void main(String[]arg){
    int numero;
    double fahre=0;
    double celci=0;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Obcion 1.De Celcius a Fahrenheit - 2.Fahrenheit a Celcius ");
    numero= entrada.nextInt();
    switch(numero){
        case 1:
            System.out.println("Ingrese los grados Celcius");
            celci=entrada.nextDouble();
            
            fahre=(9/5)*celci+32;
            
            System.out.printf("La combrecion de grados es:%.2f\n",fahre);
            break;
        case 2:
            System.out.println("Ingrese los grados Fahrenheit");
            fahre=entrada.nextDouble();
            
            
            celci = (fahre - 35)*5/9;
            
            System.out.printf("La combercion de grados es:%.2f\n",celci);
            
             break;
            
    }
 
    }
}
