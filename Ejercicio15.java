/* Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2^1, 2^2,2^3, 3^4, 2^5 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int potencia = 1;
        System.out.print("Introduce una base: ");
        int base = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce un exponente: ");
        int exponente = Integer.parseInt(sc.nextLine());

        for (int i=1; i<=exponente; i++){
            potencia = potencia*base;
            System.out.println(base + "^" + i + " = " + potencia);
        }
        sc.close();
    }
}
