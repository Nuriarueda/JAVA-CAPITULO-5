/* Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos. */
import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca un número entero: ");
        long numero = Long.parseLong(sc.nextLine());
        long aux;
        boolean encontrado;

        System.out.print("Numeros que aparecen: ");
        for (int i = 0; i < 10; i++) {
            encontrado = false;
            aux = numero;

            while (aux > 0) {
                if (aux % 10 == i) {
                    encontrado = true;
                }
                aux /= 10;
            } 

            if (encontrado) {
                System.out.print(i + " ");
            }

        }

        System.out.print("\nDígitos que no aparecen: ");
        
        for (int i = 0; i < 10; i++) {
            encontrado = false;
            aux = numero;

            while (aux > 0) {
                if (aux % 10 == i) {
                    encontrado = true;
                }
                aux /= 10;
            }
            
            if (!encontrado) {
                System.out.print(i + " ");
            }
        }        
            
        sc.close();
    }
}
