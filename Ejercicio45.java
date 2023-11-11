/* Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos. */
import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Con este programa cambiaremos un digito de un numero de teclado ");
        System.out.println("Diga el numero ");
        long numero = sc.nextLong();
        long volteado=0;
        System.out.println("Diga donde lo quiere insertar ");
        int insertar = sc.nextInt();
        System.out.println("Diga por cual lo quiere cambiar ");
        int cambio = sc.nextInt();
        int longitud=1;
        while(numero>=1){
			volteado=(volteado*10)+numero%10;
			numero /=10;
		}
        System.out.print("El numero resultado es ");

        while(volteado>0){

            if(longitud==insertar){
                System.out.print(cambio);
            }else{
            System.out.print((volteado%10));
            }
            volteado/=10;
            longitud++;
        }
        
        sc.close();
    }
}
