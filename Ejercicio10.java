/* Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo. */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double numeros = 0;
        double numeroIntroducido = 0;
        double suma = 0;
        
        System.out.print("Vaya introduciendo números:");
    
        while (numeroIntroducido >= 0) {
          numeroIntroducido = Double.parseDouble(sc.nextLine());
          numeros++;
          suma += numeroIntroducido;
        }
            
        System.out.print("La media de los números positivos introducidos es ");
        System.out.println((suma - numeroIntroducido) / (numeros - 1));
          
        sc.close();
    }
}
