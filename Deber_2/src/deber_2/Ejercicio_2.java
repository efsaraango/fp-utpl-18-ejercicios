/*
Una empresa dedicada a vender teléfonos celulares, en base a las siguientes consideraciones:

	- Si el cliente es de tipo 1 se le descuenta 10%
	- Si el cliente es de tipo 2 se le descuenta 20%
	- Si el cliente es de tipo 3 se le descuenta 30%

La solución debe imprimir el siguiente reporte:

	Nombre: Luis Alvarez
	Tipo de Cliente: 1
	Cantidad de Celulares: 20
	Precio por cada celular: 300
	Subtotal a pagar: cantidad de celulares * precio c/celular
	Descuento: (se debe obtener el descuento)
	Valor final a pagar: Subtotal - Descuento.
 */
package deber_2;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class Ejercicio_2 {
     public static void main(String[] args) {
      
          
         String nombre;
          int tipocli;
          int canticel;
          double preci;
          double subtotal=0 ;
          double descuento=0;
          double precifi=0;
          
          Scanner entrada = new Scanner(System.in);
          System.out.println("Ingrese el nombre del cliente:");
           nombre = entrada.nextLine();
          System.out.println("Igrese cantidad de celulares:");
           canticel = entrada.nextInt();
          System.out.println("ingrese precio:");
            preci= entrada.nextDouble();
          System.out.println("Ingrse el tipo de cliente(1-3)");
           tipocli = entrada.nextInt();

          // creacion de switch
           switch(tipocli){
                case 1:
                    subtotal=canticel*preci;
                    descuento=subtotal*0.10;
                    precifi=subtotal-descuento;
                break;
                case 2:
                    subtotal=canticel*preci;
                    descuento=subtotal*0.20;
                    precifi=subtotal-descuento;
                break;
                case 3:
                    subtotal=canticel*preci;
                    descuento=subtotal*0.30;
                    precifi=subtotal-descuento;
                break;
            }
           
           
           System.out.printf("----Detalle informe----\nNombre:%s\n",nombre);
           System.out.printf("Tipocliente:%d\n",tipocli);
           System.out.printf("Cantidad de celulares:%d\n",canticel);
           System.out.printf("Precio celulares:%.2f\n",preci);
           System.out.printf("Subtotal a pagar:%.2f\n",subtotal);
           System.out.printf("Subtotal a pagar:%.2f\n",descuento);
           System.out.printf("Subtotal a pagar:%.2f\n",precifi);
          
     }
  
    
}
