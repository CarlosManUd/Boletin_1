package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin1_4 {


    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        float num1= 0, num2= 0;
         System.out.println("Introduzca el numero 1: ");
        num1 = leer.nextFloat();
         System.out.println("Introduzca el numero 2: ");
        num2 = leer.nextFloat();
        
        float suma = num1 + num2;
        float restar = num1 - num2;
        float multiplicar = num1 * num2;
        float division = num1/num2;
        
        System.out.println(suma);
        System.out.println(restar);
        System.out.println(multiplicar);
        System.out.println(division);
    }
    
}
