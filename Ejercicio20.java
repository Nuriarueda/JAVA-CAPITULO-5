/* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca. */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce la altura de la piramide por teclado: ");
        int alt = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el caracter con el que se pintara la piramide: ");
        String caracter = sc.nextLine();

        sc.close();
    }
}
