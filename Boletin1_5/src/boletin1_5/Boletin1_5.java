package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin1_5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
     float millasMarinas = 0, conversionM = 1852 ,conversor=0;
     System.out.println("Introduzca las millas marinas: ");
     millasMarinas = leer.nextFloat();
     conversor=millasMarinas*conversionM;
     System.out.println(+millasMarinas+" Millas marinas son " +conversor+ " metros");
        
    }
    
}
