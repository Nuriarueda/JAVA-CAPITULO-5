import java.util.Scanner;
public class Cuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Por favor introduza el tamaño del cuadrado: ");
        int tamaño = Integer.parseInt(sc.nextLine());

    
        for(int i = 0; i < tamaño; i++) {
            System.out.print("* ");
        }
        System.out.println();
       
        for(int i = 0; i < tamaño-2; i++) {
            System.out.print("* ");
            for(int j = 0; j < tamaño-2; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
       
        for(int i = 0; i < tamaño; i++) {
            System.out.print("* ");
        }
        
        sc.close();
    }
}
