/* Muestra la tabla de multiplicar de un número introducido por teclado. */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el numero del que quieras saber la tabla de multiplicar: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int a = 0; a <= 10; a++){
            int multiplicar = n*a;
            System.out.println(n + " * " + a + " = " + multiplicar);
        }
        sc.close();
    }
}
