/* Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. */

import java.util.Scanner;
public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Con este programa haremos un triangulo hueco ");
        System.out.println("Diga la altura");
        int altura=sc.nextInt();
        int espacios=altura-2;
        for(int i=1;i<=altura;i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=1;i<=espacios;i++){
            System.out.print("*");
            for(int j=espacios;i<j;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        System.out.print("*");

        sc.close();
    }
}
