/* Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error. */

import java.util.Scanner;
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Diga la altura de la V ");
        int altura=sc.nextInt();
        for(int i=1;i<=altura;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.print("***");
            for(int j=i*2;j<=altura*2-2;j++){
                System.out.print(" ");
            }
            if(i!=altura){
            System.out.print(" ***");
            }else{
                System.out.print("***");
            }
            System.out.println("");
            
        }
        
        sc.close();
    }

}
