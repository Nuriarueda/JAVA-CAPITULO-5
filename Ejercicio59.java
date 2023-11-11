/* Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4. */
import java.util.Scanner;
public class Ejercicio59 {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("De que altura quieres la piramide");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura-3; i++) {
            for (int j = i; j <altura-2 ; j++){
                System.out.print(" "); 
            }
            if(i!=1){
            System.out.print("^");
            }else{
                System.out.println("*");
                for(int j=1;j<altura-2;j++){
                    System.out.print(" ");
                }
            }
            for (int k = 1; k < (i-1)*2 ; k++){
                System.out.print(" "); 
            }
            System.out.print("^");
            System.out.println("");
        }
        for(int i=1;i<=(altura-2)*2-1;i++){
            System.out.print("^");
        }
        System.out.println("");
        for(int j=1;j<altura-2;j++){
            System.out.print(" ");
        }
        System.out.print("Y");
        
        sc.close();
    } 

}
