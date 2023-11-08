/* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error. */
import java.util.Scanner;
public class Ejercicio46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner  (System.in);

    System.out.print("Introduzca la anchura del rectángulo (como mínimo 2): ");
    int anchura = Integer.parseInt(sc.nextLine());

    System.out.print("Ahora la altura (como mínimo 2): ");
    int altura = Integer.parseInt(sc.nextLine());

    if ((anchura < 2) || (altura < 2)) {

      System.out.print("Lo siento tienes que meter como minimo 2 tanto del atura como de anchura");
    } else {

      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }

      for (int i = 2; i < altura; i ++) {

        System.out.print("\n*");
        
        for (int espacios = 2; espacios < anchura; espacios++) {
          System.out.print(" ");
        }

        System.out.print("*");
      }

      System.out.println();

      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
    } 
      
    sc.close();
  }  
}
