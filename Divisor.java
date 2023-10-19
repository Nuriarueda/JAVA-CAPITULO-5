import java.util.Scanner;
public class Divisor {
    
    public static boolean esDivisor(int a, int b){
        return (b%a)==0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce 2 numeros: ");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if (esDivisor(a, b)){
            System.out.println(a + " es divisor de " + b);
        } else{
            System.out.println(a + " no es divisor de " + b);
        }

        sc.close();
    }
}
