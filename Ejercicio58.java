/* Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado. */

import java.util.Scanner;
public class Ejercicio58 {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Este programa te hace la media de los numeros de tu numero");
    System.out.println("Escribe el numero");
    int numero = sc.nextInt();
    int total = 0;
    int cont = 0;
    
    while(numero>0){
        total=total+numero%10;
        numero/=10;
        cont++;
    }
    System.out.print("La media de sus digitos es: "+total/cont);
    sc.close();
   } 
}
