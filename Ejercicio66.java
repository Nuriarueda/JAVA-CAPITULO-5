/* La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
no es un número impar mayor o igual que 3, el programa debe mostrar un
mensaje de error. */

import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("De que altura quieres la A,mayor que 2");
        int altura = sc.nextInt();
        int altura_1 = altura-1;
        System.out.println("Donde quieres el palo de la A,entre el 2 y el "+ altura_1);
        int altura_palo = sc.nextInt();
        if(altura<3 && altura_palo>altura-1 && altura_palo<2){
            for (int i = 1; i <= altura; i++) {
                for (int j = i; j <altura ; j++){
                    System.out.print(" "); 
                }
                
                if(i==altura_palo){
                    for(int j=1;j<=i*2-1;j++){
                        System.out.print("*");
                    }
                }else{
                    if(i!=1){
                        System.out.print("*");
                        }
                    for (int k = 1; k < (i-1)*2 ; k++){
                        System.out.print(" "); 
                    }
                    if(i!=altura_palo){
                    System.out.print("*");
                    }
                }
                System.out.println("");
            }
        }else{
            System.out.println("ERROR");
        }
        
        sc.close();
    }
}
