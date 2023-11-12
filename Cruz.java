import java.util.Scanner;
public class Cruz {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el tamaño de la x");
        int tamaño = Integer.parseInt(sc.nextLine());
        int tamaño2;
        if (tamaño%2!=0) {
            tamaño2 = tamaño+1;
            for (int i = 0; i < tamaño2; i++) {
                for (int j = 0; j < tamaño2; j++) {
                    if (i == j || j == (tamaño2 - i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }

        } else {
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if (i == j || j == (tamaño - i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
    sc.close();
    }
}
