/* Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error. */

import java.util.Scanner;
public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("De que altura quieres la figura,numero mpar solo");
        int altura = sc.nextInt();
        int media_altura = altura/2;
        if(altura%2!=0){
            for(int i=1;i<=media_altura+1;i++){
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }
            for(int i=1;i<=media_altura;i++){
                for(int j=media_altura;j>i;j--){
                    System.out.print(" ");
                }
                System.out.println("*    *");
            }
        }else{
            System.out.print("NUMEROS IMPARES SOLO");
        }
        
        sc.close();
    }
}
