/* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca. */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce la altura de la piramide por teclado: ");
        int alt = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el caracter con el que se pintara la piramide: ");
        String caracter = sc.nextLine();

        for (int i = alt; i >= 1; i --){
            for (int j = i; j < alt; j++){
                System.out.print(" ");
            }

            for (int k = 1; k < i*2; k++){
                System.out.print(caracter);
            }

            System.out.println(" ");
        }

        sc.close();
    }
}
