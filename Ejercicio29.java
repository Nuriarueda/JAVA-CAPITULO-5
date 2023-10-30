/* Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma. */
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numIntroducido = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce otro numero: ");
        int divisibles = Integer.parseInt(sc.nextLine());

        
        for (int i = numIntroducido; i > 2; i--){
            if (i%divisibles!=0) {
                System.out.print("Los numero que no son divisiblees entre " + divisibles + " son = " + i + " ");
            }
        }
        sc.close();
    }
}
