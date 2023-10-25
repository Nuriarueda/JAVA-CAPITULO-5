/* Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia. */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int potencia = 1;
        System.out.print("Introduce una base: ");
        int base = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce un exponente: ");
        int exponente = Integer.parseInt(sc.nextLine());

        if (exponente==0) {
            System.out.println("La potencia es 1");
        }

        if (exponente==1) {
            System.out.println("La potencia es " + base);
        }

        if (exponente>1) {
            for (int i = 1; i <= exponente; i++){
                potencia = potencia*base;
            }

            System.out.println("La potencia es " + potencia);

        }


        sc.close();
    }
}
