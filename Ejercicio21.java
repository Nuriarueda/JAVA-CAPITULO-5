/* Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo. */
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double suma = 0;
        int num = 0;
        int numeroIntroducido = 0;

        System.out.println("Vaya introduciendo numeros y cuando quiera parar introduzca uno negativo");
        System.out.println(">");
        
        while (numeroIntroducido>=0) {
            numeroIntroducido = Integer.parseInt(sc.nextLine());
            num ++;
        }
        System.out.println("Has introducido " + (num-1) + " numeros");

        if ((numeroIntroducido%2)==1) {
        } else {
            
        }

        sc.close();
    }
}
