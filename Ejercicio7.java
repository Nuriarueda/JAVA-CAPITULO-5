/* Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte. */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        int intentos = 4;
        boolean acertado = true;

        do {
            System.out.print("Introduzca un valor de 4 digitos para abrir la caja fuerte: ");
            int contraseña = Integer.parseInt(sc.nextLine());

            if (contraseña==1234) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }
            intentos--;

        } while ((intentos > 0) && (!acertado));

        if (acertado) {
            System.out.print("Ha abierto la caja fuerte");
        } else {
            System.out.println("Lo siento ha agotado las 4 oportunidades");
        }
        sc.close();
    }
}
