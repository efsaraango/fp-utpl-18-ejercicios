/*
Ejercicio 1:

Elaborar un programa en lenguaje Java, que permita ingresar los valores de productos vendidos a un clinte, en un supermecado.

Los productos serán ingresados, hasta que el usuario lo decida.

Ejemplificar con los siguiente datos:


Información que necesita ingresar durante la ejecución del programa:

- Ingresar el nombre del cliente.
- Para cada artículo se debe ingresar:

	- Nombre del artículo.
	- Cantidad de artículos.
	- Precio unitario de cada artículo.

- Se debe generar el siguiente reporte
*/
package ciclo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre ;
        String nomarti;
        int cantidadart = 0;
        double preciarti = 0;
        double totalart = 0;
        double totalfin = 0;
        double iva = 0;
        double subtotal = 0;
        boolean bandera = true;
        String factu = "";
        factu = factu + String.format("%s\t%s\t%s\t%s\n", "Artículo", "Cantidad", "Precio Unitario", "Precio Total");
        System.out.println("Porfavor ingrese el nombre del cliente:");
        nombre = entrada.nextLine();
        while (bandera) {
            System.out.println("Ingrese el nombre del articulo que desea comprar:");
            nomarti = entrada.nextLine();
            System.out.println("Ingrese la cantidad de articulos que desea comprar:");
            cantidadart = entrada.nextInt();
            System.out.println("Ingrese el precio unitario de cada articulo:");
            preciarti = entrada.nextInt();

            totalart = cantidadart * preciarti;
            subtotal = subtotal +totalart;
            totalfin = totalfin + totalart;

            factu = factu + String.format("%s\t\t%d\t\t%.2f\t\t%.2f\n", nomarti, cantidadart, preciarti, totalart);
            entrada.nextLine();
            System.out.println("Ingrese si(salir)");

            String temporal = entrada.nextLine();

            if (temporal.equals("si")) {
                bandera = false;
            }

        }
        iva = totalart * 0.14;
       
        totalfin = totalfin + iva;
        System.out.printf("\tFACTURA\nSupermercado: Todo a menor precio\nNombre del cliente:%s\n%s\t\t\t\tSubtotal\t%.2f\n\t\t\t\tIva\t\t%.2f\n\t\t\t\tTOTAL\t\t%.2f\n", nombre, factu, subtotal, iva, totalfin);
        
        
        
        
    }
    
}
