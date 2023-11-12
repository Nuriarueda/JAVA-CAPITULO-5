import java.util.Scanner;
public class PruebaExamen2 {

    public static long voltea (long n){
        long numVoltea = 0;
        while(n>0){
          numVoltea = (n%10)+(numVoltea*10);
          n/=10;
        }
        return numVoltea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un numero el cual debe ser mayor que cero");
        System.out.print(">");
        long num = sc.nextLong();

        long numVoltea = voltea(num);
        long volt2 = numVoltea;
        long volt3 = numVoltea;
        int cont = 0;
        int numMayor = -1;


        while (volt3 > 0) {
          cont++;
          volt3/=10;
        }


        for (int i = 0; i < cont; i++) {
            System.out.print("- - -");
        }

        System.out.println();
        System.out.print("| ");
        for (int i = 0; i < cont; i++) {
            System.out.print(numVoltea%10+" | ");

            if((numVoltea%10) > numMayor){
                numMayor = (int)numVoltea%10;
            }
            numVoltea/=10;
        }

        System.out.println();
        for (int i = 0; i < cont; i++) {
          System.out.print("- - -");
        }


        System.out.println();

        numVoltea = voltea(num);
        for (int i = 1; i <= numMayor; i++) {
            volt2 = numVoltea;
            System.out.print("| ");
            for (int j = 0; j < cont; j++) {
                int digito = (int) (volt2 % 10);
                if (digito >= i) {
                    System.out.print("* | ");
                } else {
                    System.out.print("  | ");
                }
                volt2 /= 10;
            }

            System.out.println();
        }
    
        for (int i = 0; i < cont; i++) {
          System.out.print("- - -");
        }
        System.out.println();
            


        sc.close();
    }
}
