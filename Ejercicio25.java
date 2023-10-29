/* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */
import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero entero: ");
        int numeroIntroducido = Integer.parseInt(sc.nextLine());
        int n  = numeroIntroducido;
        int vuelta = 0;

        while (n > 0) {
            vuelta = (vuelta * 10) + (n % 10);
            n /= 10;
        }

        System.out.println("El numero dado la vuelta es: " + vuelta);


        sc.close();
    }
}
