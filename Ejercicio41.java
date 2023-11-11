/* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. */
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero: ");
        long num = Long.parseLong(sc.nextLine());

        long num2 = num;
        int nImpares = 0;
        int nPares = 0;
        
        while (num > 0) {
            if ((num%10)%2==0) {
                nPares++;
            } else {
                nImpares++;
            }

            num/=10;
        }

        System.out.println("El " + num2 + " tiene " + nPares + " numeros pares y " + nImpares + " impares");
        sc.close();
    }
}
