/* El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo. */
import java.util.Scanner;
public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Hay un gusano que se comera los numeros 8 y 0 ");
        System.out.println("Diga el numero ");
        long numero = sc.nextLong();
        long volteado =0;
        int contador=0;
        while(numero>0){
            volteado=(volteado*10)+numero%10;
            numero/=10;
            contador++;
        }
        System.out.print("Después de haber sido comido por el gusano numérico se queda en ");
        for(int i=1;i<=contador;i++){
            if(volteado%10!=0 && volteado%10!=8){
                System.out.print(volteado%10);
            }
            volteado/=10;
        }
        
        sc.close();
    }
}
