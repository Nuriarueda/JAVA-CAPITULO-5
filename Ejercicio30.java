/* Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero. */
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca la primera hora.");
        System.out.print("Dia: ");
        System.out.print("Hora: ");

        System.out.println("Por favor, introduzca la segunda hora.");
        System.out.print("Dia: ");
        System.out.print("Hora: ");


        sc.close();
    }
}
