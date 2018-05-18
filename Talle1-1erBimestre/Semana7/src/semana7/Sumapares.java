/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

/**
 *
 * @author SARANGO
 */
public class Sumapares {
    public static void main(String[] args) {
        int suma = 0;
        for(int contador=0; contador<20; contador =+2){
            if (contador / 2 ==0){
            suma = suma + contador;    
            
            System.out.printf("%d",suma);
            }
        }
        System.out.println();
    }
}
