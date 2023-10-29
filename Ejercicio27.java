/* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado. */
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int contador = 0 ;
        int suma = 0;
        System.out.print("Introduce un numero: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i<=n; i++){
            if (i%3==0) {
                System.out.println(i + " ");
                contador++;
                suma+=i;
            }
        }
        System.out.println("Desde 1 hasta " + n + " hay " + contador );
        System.out.println("La suma es de " + suma);
        sc.close();
    }
}
