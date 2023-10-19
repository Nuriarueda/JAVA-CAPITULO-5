import java.util.Scanner;

public class Primo {

    public static boolean esDivisor(int a, int b){
        return (b%a)==0;
    }
    
    public static boolean esPrimo(int a){
        if (a<2){
            return false;
        }
        
        boolean primo = true;
        for (int i = 2; i<=a/2 && primo; i++){
           if (esDivisor(i, a)) {
            primo = false;
           } 
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero del que quieras saber si es primo: ");
        int a = Integer.parseInt(sc.nextLine());
        if (esPrimo(a)){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
        sc.close();
    }
}
