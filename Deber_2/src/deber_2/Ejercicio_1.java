/*
 Una solución que permia leer el número de día (un valor entre 1 y 7) e imprima Lunes si es 1, Martes si es 2, ... , Domingo si es 7.
(usar instrucción switch)
 */
package deber_2;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        int numero ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        
        numero=entrada.nextInt(); 
        
        switch(numero){
            case 1:
                System.out.println("1--Lunes");
                break;
                
            case 2:
                System.out.println("2--Martes");
                break;
            case 3:
                System.out.println("3--Miercoles");
                break;
            case 4:
                System.out.println("4--Jueves");
                break;
            case 5:
                System.out.println("5--Viernes");
                break;
            case 6:
                System.out.println("6--Sabado");
                break;
            case 7:
                System.out.println("7--Domingo");
                break;
            
        }
                
        
        
    }
    
}
