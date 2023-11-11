/* Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos. */

import java.util.Scanner;
public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Di un numero y lo dislocaremos");
        long numero = sc.nextLong();
        long volteado=0;
        System.out.println("El numero dislocado es:");
        while(numero>0){
            volteado=(volteado*10)+numero%10;
            numero/=10;
        }
        while(volteado>0){
            if((volteado%10)%2!=0){
                System.out.print(volteado%10-1);
            }else{
                System.out.print(volteado%10+1);
            }
            volteado/=10;
        }
        
        sc.close();
    }
}
