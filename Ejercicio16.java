/* Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad. */
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i<n; i++){
            if (n%i==0) {
                esPrimo=false;
            }
        }

        if (esPrimo) {
            System.out.println("El numero introducido es primo");
        } else {
            System.out.println("El numero introducido no es primo");
        }

        System.out.println();
        
        sc.close();
    }
}
