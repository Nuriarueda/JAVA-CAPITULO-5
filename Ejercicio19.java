/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado. */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("De que altura quieres la piramide: ");
        int altura = sc.nextInt();
        
        System.out.print("Que caracter quieres utilizar para hacer la piramide: ");
        String caracter = sc.next();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = i; j <altura ; j++){
                System.out.print(" "); 
            }
            for (int k = 1; k < i*2 ; k++){
                System.out.print(caracter); 
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
