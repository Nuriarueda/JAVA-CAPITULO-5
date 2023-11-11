/* Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
orientación, los valores de anchura y altura se intercambian. El valor mínimo
de la altura o la anchura es 2. */

import java.util.Scanner;
public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Con este programa podremos cambiar el tamaño de un cubo");
        System.out.println("******");
        System.out.println("*    *");
        System.out.println("******");
        boolean salir=true;
        int agrandar=1;
        do{ 
            
            System.out.println("1.Agrandarlo");
            System.out.println("2.Achicarlo");
            System.out.println("3.Girarlo");
            System.out.println("4.Salir");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    agrandar++;
                    System.out.println("******");
                    for(int i=1;i<=agrandar;i++){
                        System.out.println("*    *");
                    }
                    System.out.println("******");
                    break;
            
                case 2:
                    agrandar--;
                    System.out.println("******");
                    for(int i=1;i<=agrandar;i++){
                        System.out.println("*    *");
                    }
                    System.out.println("******");
                    break;
                    
                    case 3:
                    for(int j=1;j<=6;j++){
                        System.out.print("*");
                        
                        for(int k=1;k<=agrandar;k++){
                            if(j==1 || j==6){
                                    System.out.print("*");
                                }else{
                                    System.out.print(" ");
                                }
                            }
                        
                        System.out.println("*");
                    }
                    break;

                case 4:
                    salir=false;
                    break;
            }
        }while(salir);

        
        sc.close();
    }
}
