/* Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos. */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce 10 numeros");

        int positivos = 0;
        int negativos = 0;

        for (int i=0; i<=10; i++){
            System.out.print("Introduce numero: ");
            int num = Integer.parseInt(sc.nextLine());

            if (num>=0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.println("Tienes " + positivos + " positivos y " + negativos + " negativos");


        sc.close();
    }
}
