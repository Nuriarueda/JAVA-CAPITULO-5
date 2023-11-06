/* Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error. */
import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce la altura del rombo: ");
        int altura = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= altura; j++){
                
            }
        }

        sc.close();
    }
}
