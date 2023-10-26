/* Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7. */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce un numero: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el segundo numero: ");
        int num2 = Integer.parseInt(sc.nextLine());


        if (num1==num2) {
            System.out.println("Tienen que ser numeros distintos");
        } else if ( num2<num1){
            int n = num1;
            num1=num2;
            num2=n;
            for (int i = num1; i<n; i+=7){
                System.out.print(" " + i);
            }
        } else {
            for (int i = num1; i<num2; i+=7){
                System.out.print(" " + i);
            }
        }


        sc.close();
    }
}
