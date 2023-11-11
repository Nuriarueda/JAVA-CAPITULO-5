/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual. */
import java.util.Scanner;
public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Con este programa desplazaremos un digito de tu numero ");
        System.out.println("Diga el numero");
        int numero=sc.nextInt();
        int volteado=0;
        int contador=0;
        while(numero>0){
            volteado=(volteado*10)+numero%10;
            numero/=10;
            contador++;
        }
        int volteado2=volteado;
        for(int i=1;i<=contador;i++){
            if(i==contador){
                System.out.print(volteado%10);
            }
            volteado/=10;
        }
        for(int i=1;i<=contador;i++){
            if(i!=contador){
                System.out.print(volteado2%10);
            }
            volteado2/=10;
        }
        sc.close();
    }
}
