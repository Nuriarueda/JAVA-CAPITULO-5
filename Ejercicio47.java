/* Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres. */
import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = Integer.parseInt(sc.nextLine());
        int alturaAux = (altura - 3) / 2;

        if ((altura % 2 != 0) && (altura >= 5)) {
            System.out.println("MMMMMM");

            for (int i = 0; i < alturaAux; i++) {
                System.out.println("M  M");
            }

            System.out.println("MMMMMM");

            for (int i = 0; i < alturaAux; i++) {
                System.out.println("M  M");
            }   

            System.out.println("MMMMMM");
            
        } else {
        System.out.println("La altura introducida no es correcta.");
        }        
        sc.close();
    }
}
