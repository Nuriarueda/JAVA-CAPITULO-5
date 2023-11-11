/* Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no. */

import java.util.Scanner;
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Con este programa te dire si tu numero es de la suerte o no ");
        System.out.println("Diga un numero");
        int numero=sc.nextInt();
        int malasuerte=0;
        int suerte=0;

        while(numero>0){
            if(numero%10==3 || numero%10==7|| numero%10==8||numero%10==9){
                suerte++;
            }else{
                malasuerte++;
            }
            numero/=10;
        }
        if(malasuerte>suerte){
        System.out.print("Tu numero no es afortunado");
        }else{
            System.out.print("Tu numero es afortunado");
        }

    
        sc.close();
    }
}
