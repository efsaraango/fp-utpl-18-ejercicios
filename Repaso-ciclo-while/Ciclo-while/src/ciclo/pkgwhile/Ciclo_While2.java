/*
 Ejercicio 2:
Se necesita generar una solución que permita ingresa los datos de varios autos importados,
el número de autos a ingresar se debe solicitar al usuario de manera previa. 
Por cada automóvil, se tiene que ingresar: marca, origen y costo. 

Información para los cálculos:

- Se genera un impuesto en función del país de origen, en función del costo del automóvil:

	- Si es Argentina el impuesto es del 20%
	- Si es Colombia el impuesto es del 25%
	- Si es Chile el impuesto es del 30%
	- Cualquier otro país, el impuesto es de 40%

- El precio de venta es igual a la suma del costo del automóvil más el impuesto
- Se debe imprimir el total de autos importados.
- Se debe imprimir  el total de impuestos generados.
- Se debe imprimit el total de los precios de venta de los autos.
- Se debe generar e imprimir el total de autos de los países de origen:

 */
package ciclo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class Ciclo_While2 {
    
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int numauto;
        String marca;
        String origen;
        String reporte = "";
        double costo;
        double impu;
        double totalcos;
        double totalimpu = 0;
        double totalvent = 0;
        int contador = 1;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

        reporte = reporte + String.format("\n%35s\n\n%-15s%-15s%-15s%-15s%-15s\n", "Reporte de autos importados\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
        System.out.println("Ingrese el numero autos");
        numauto = entrada.nextInt();
        entrada.nextLine();
        while (contador <= numauto) {
            System.out.println("Ingrese la marca de auto:");
            marca = entrada.nextLine();
            System.out.println("Ingrese Origen de auto:");
            origen = entrada.nextLine();
            System.out.println("Ingrese Costo de auto:");
            costo = entrada.nextDouble();

            entrada.nextLine();

            if (origen.equalsIgnoreCase("argentina")) {
                impu = costo * 0.2;
                cont1 = cont1 + 1;
            } else if (origen.equalsIgnoreCase("colombia")) {
                impu = costo * 0.25;
                cont2 = cont2 + 1;
            } else if (origen.equalsIgnoreCase("chile")) {
                impu = costo * 0.3;
                cont3 = cont3 + 1;
            } else {
                impu = costo * 0.4;
                cont4 = cont4 + 1;
            }

            totalcos = costo + impu;

            reporte = String.format("%s%-14s%-14s%-14.2f%-14.2f%14.2f\n",reporte, marca, origen, costo, impu, totalcos);

            totalimpu = totalimpu + impu;

            totalvent = totalvent + totalcos;

            contador = contador + 1;
        }
        
        reporte = String.format("%s\n%s\t%d\t%s\t%.2f\t%s\t%.2f\n%s\t%d\n%s\t%d\n%s\t%d\n%s\t%d\n", reporte, "Total Autos", numauto, "Tot. Imps",totalimpu, "Tot. PV", totalvent, "argentina", cont1, "chile", cont2, "colombia", cont3, "Resto de paises", cont4);

        System.out.println(reporte);

        
    }
}

 
