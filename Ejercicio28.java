/* Escribe un programa que calcule el factorial de un número entero leído por
teclado. */
import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del que quieras saber el factorial: ");
        int num = Integer.parseInt(sc.nextLine());
        int fact = num;

        for(int i = 1; i < num; i++ ){
            fact *= i;
        }

        System.out.println(num + "! = " + fact);
        sc.close();
    }
}
