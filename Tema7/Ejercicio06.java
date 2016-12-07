import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 06
 * 
*/
public class Ejercicio06 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] num = new int[15];
    int aux2= 0;
    for(int i=0; i < num.length; i++) {
      System.out.print("Introduce el numero de la posicion " + i + ": ");
      num[i]= t.nextInt();
    }
    int aux=num[0];
    for(int i=0; i < 15; i++) {
      if (i == 14) {
        num[0] = aux;
      } else {
      aux2 = aux;
      aux = num[i+1];
      num[i+1] = aux2;
      }
    }
    for(int i=0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
  }
}
