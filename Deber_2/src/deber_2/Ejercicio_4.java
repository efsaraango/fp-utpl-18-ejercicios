/*
En una empresa dedicada a la venta de balones, si se compra uno se hace un descuento de 50%,
si se compra 2 descuento de 70%, se compra 3 o más se descuenta 80%.
Generar la solución que permita leer el número de balones a comprar, el precio de cada balón y el valor final a cancelar.
  */
package deber_2;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class Ejercicio_4 {
    public static void main(String[] arg){
        int cantidad=0;
        double descuento=0;
        double precio;
        double subtotal;
        double preciofi;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valones:");
        cantidad= entrada.nextInt();
        System.out.println("Precio c/balon:");
        precio = entrada.nextDouble();

        
        if(cantidad==1){
            descuento=cantidad*5;
        }else if(cantidad==2){
            descuento=cantidad*7;
        }else if(cantidad>=3){
            descuento=cantidad*8;
        }
        subtotal = cantidad * precio;
        preciofi =subtotal - descuento;
    System.out.printf("El numero de balones es:%d\n",cantidad);
    System.out.printf("Precio balon:%f\n",precio);
    System.out.printf("Subtotal a pagar:%f\n",subtotal);
    System.out.printf("Tatol a pagar:%.2f\n",preciofi);
    
    
    }
   
    
}
