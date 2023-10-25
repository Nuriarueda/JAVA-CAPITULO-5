import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i<0; i++){
            System.out.println("Introduce tu nota: ");
        }

        double nota = Double.parseDouble(sc.nextLine());
        double suma = nota+nota;
        double media = suma/i;
        System.out.println("La media es " + media);
        sc.close();

    }
}
