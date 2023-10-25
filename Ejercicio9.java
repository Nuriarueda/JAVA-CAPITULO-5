/* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numDigitos = 1, n, numIntroducido;
        System.out.print("Introduce un numero y te dire cuantos digitos tiene: ");
        numIntroducido = Integer.parseInt(sc.nextLine());
        n = numIntroducido;
        while (n>10){
            n/=10;
           numDigitos++;
        }

        System.out.println("El numero que has introducido tiene " + numDigitos + " digitos" );
                 
        sc.close();
    }
}
