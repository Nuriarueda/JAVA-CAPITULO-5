/* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. */
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero: ");
        long num = Long.parseLong(sc.nextLine());

        for (int i = 0; i <= num; i++){
            
        }
        sc.close();
    }
}
