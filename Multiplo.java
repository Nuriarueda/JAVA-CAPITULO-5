import java.util.Scanner;
public class Multiplo {
    
    public static boolean esMultiplo(int a, int b){
        return(a%b)==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce 1 numeros: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce 1 numeros: ");
        int b = Integer.parseInt(sc.nextLine());

        if (esMultiplo(a, b)){
            System.out.println(a + " es multiplo de " + b);
        } else{
            System.out.println(a + " no es multiplo de " + b);
        }

        sc.close();
    }
}
