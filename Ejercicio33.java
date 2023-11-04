/* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores. */
import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca la altura de la U: ");
        int altura = Integer.parseInt(sc.nextLine());

        for (int i = 1; i < altura; i++) {
            System.out.print("* ");
            for (int j = 2; j < altura; j++) {
                System.out.print(" ");
            }
        }
        
        sc.close();
    }
}
