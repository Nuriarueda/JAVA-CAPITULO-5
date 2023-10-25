/* Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado. */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero: ");
        int numeroIntroducido = Integer.parseInt(sc.nextLine());

        for (int i = numeroIntroducido; i < numeroIntroducido+5; i++){
            int cuadrado = i*i;
            int cubo = i*i*i;

            System.out.printf("%10d%10d%10d\n", i, cuadrado, cubo);
        }

        sc.close();
    }
}
