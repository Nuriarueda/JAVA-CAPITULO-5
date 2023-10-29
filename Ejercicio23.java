/* Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double n = 0;
        double numeroIntroducido;
        double suma = 0;
        
        System.out.print("Vaya introduciendo números:");

        do {
            numeroIntroducido = Integer.parseInt(sc.nextLine());
            suma+=numeroIntroducido;
            n++;
        } while (suma <=10000);
    
            
        System.out.print("Has introducido un total de " + n + " numeros");
        System.out.println("La suma es de " + suma);
        System.out.println("La media es de " + (suma/numeroIntroducido));

        sc.close();
    }
}
