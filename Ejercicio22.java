/* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. */
public class Ejercicio22 {
    public static void main(String[] args) {

        boolean esPrimo = true;
        for (int i = 2; i<=100; i++){
            
            esPrimo = true;
            for (int a = 2; a<i; a++){
                if (i%a==0) {
                    esPrimo=false;
                }
            }

            if (esPrimo) {
                System.out.println(" " + i );
            }
        }
    }
}
