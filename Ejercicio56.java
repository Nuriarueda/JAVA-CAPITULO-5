/* Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. */
import java.util.Scanner;
public class Ejercicio56 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce la altura del triangulo: ");

        System.out.println("Con este programa haremos un triangulo ");
        System.out.println("Diga la altura ");
        int altura = sc.nextInt();
        int j=altura;
        for(int i=1;i<=altura;i++){
            j=altura-i+1;
            while(j>=1){
                System.out.print("*");
                j--;
            }
            System.out.println("");
        } 
        
        sc.close();
    }

}
