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
public class Deber_2 {

    
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String descT = "";
        
        int tCliente;
        int cantidad;
        
        double precio;
        double subtotal;
        double descV = 0;
        double desc;
        double total;
        
        System.out.println("Nombre del cliente:");
        nombre = entrada.nextLine();
        
        System.out.println("Cantidad de celulares");
        cantidad = entrada.nextInt();
        
        System.out.println("Precio c/celular:");
        precio = entrada.nextDouble();
        
        System.out.println("Tipo de cliente (1 - 3):");
        tCliente = entrada.nextInt();
        
        switch(tCliente) {
            
            case 1:
                descV = 0.1;
                descT = "(10%)";
                break;
            case 2:
                descV = 0.2;
                descT = "(20%)";
                break;
            case 3:
                descV = 0.3;
                descT = "(30%)";
                break;
        }
        
        subtotal = cantidad * precio;
        desc = subtotal * descV;
        total = subtotal - desc;
        
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Tipo de Cliente: %d\n", tCliente);
        System.out.printf("Cantidad de celulares: %d\n", cantidad);
        System.out.printf("Precio por cada celular: $%.2f\n", precio);
        System.out.printf("Subtotal a pagar: $%.2f\n", subtotal);
        System.out.printf("Descuento %s: $%.2f\n", descT, desc);
        System.out.printf("Valor final a pagar: $%.2f\n", total);
        
    }
    
}
        
    
    

