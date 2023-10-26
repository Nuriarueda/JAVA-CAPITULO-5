/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado. */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce la altura de la piramide por teclado: ");
        int alt = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el caracter con el que se pintara la piramide: ");
        String caracter = sc.nextLine();

        
        sc.close();
    }
}
