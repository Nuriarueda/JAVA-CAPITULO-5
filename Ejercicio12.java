/* Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado. */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Cuantos numeros quieres mostrar de la serie de Fibonacci: ");
        int n1 = 0; 
        int n2 = 1;
        int suma = 0;
        int tope = Integer.parseInt(sc.nextLine());
        for (int i=0; i<=tope; i++){
            System.out.print(suma + " ");
            n1 = n2;
            n2 = suma;
            suma = n1 + n2;
        }
        sc.close();
    }
}
