/* muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no. */
import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero: ");
        int num = Integer.parseInt(sc.nextLine());
        boolean esPrimo;

        for (int i = num; i<=num+5; i++){

            esPrimo = true;
            for (int j = 2; j < i; j++){
                if (i%j==0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.println( i + " es primo");
            } else {
                System.out.println( i + " no es primo");
            }
        }
        sc.close();
    }
}
