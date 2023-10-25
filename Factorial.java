import java.util.Scanner;
public class Factorial {
    
    public static long factorial(int num){
        long f = 1;
        for (int i = 1; i<=num; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();

        System.out.println("El factorial de " + num + " es " + factorial(num));
        sc.close();
    }



}
