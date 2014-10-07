/*area cuadrado*/
package boletin2.pkg2;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin22 {

    public static void main(String[] args) {
float lado1,lado2;
 System.out.println("lado1 : ");
Scanner dato = new Scanner(System.in);
lado1=dato.nextFloat();
System.out.println("lado2 : ");
lado2=dato.nextFloat();
System.out.println("Area de cuadrado de lado "+lado1+" e lado "+lado2+" e: " +(lado1*lado2));

    }
    
}
