/* Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos. */

import java.util.Scanner;
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("De cuantos escalones quiere la escalera");
        int escalones = sc.nextInt();
        System.out.println("De que grosor quiere los escalones");
        int grosor = sc.nextInt();
        for(int j=1;j<=escalones;j++){
            for(int i=1;i<=grosor;i++){
                for(int k=1;k<=j;k++){
                    System.out.print("****");
                }
                System.out.println("");
            }
        }
        
        sc.close();
    }
}
