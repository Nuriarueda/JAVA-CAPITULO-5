/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual. */
import java.util.Scanner;
public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Con este programa moveremos un numero de un numero introducido por teclado ");
        System.out.println("Diga el numero");
        int numero=sc.nextInt();
        int volteado=numero;  
        int contador=0;//con este contador sabremos cuantos  digitos tiene
        int primero=0;
        
        while(numero>0){
            volteado=(volteado*10)+numero%10;
            numero/=10;
            contador++;
        }
        int volteado2=volteado;
        
        for(int i=0;i<contador;i++){
            
            if(i==0){
                primero=volteado%10;
            }
            volteado/=10;
        }
        
        for(int i=1;i<=contador;i++){
            volteado2/=10;
            if(contador!=i){
                if(volteado2%10!=0){
                System.out.print(volteado2%10);
                }
            }
        }      
        System.out.print(primero);
        
        sc.close();
    }
}
