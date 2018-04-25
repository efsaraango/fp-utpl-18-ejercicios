/*
Solución que permita calcular y presentar los valores de X y Y, teniendo como dato de entrada el valor de X y obtener el de Y en base a las siguientes restricciones:

Si X<0 entonces Y=3*X+10
Si X>0 entonces Y=X**2+6
Si X==0 entonces Y=1
 */
package deber_2;

import java.util.Scanner;

/**
 *
 * @author SARANGO
 */
public class Ejercicio_3 {

    public static void main(String[] args) {

        int x;
        int y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de X :");
        x = entrada.nextInt();

        if (x < 0) {
            y = 3 * x + 10;
        } else if (x > 0) {
            y = (x) * (x) + 6;
        } else {
            y = 1;
        }
        System.out.printf("x = %d\ny = %d\n",x,y);
    }
}
