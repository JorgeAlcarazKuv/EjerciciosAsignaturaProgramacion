import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 03
 * 
*/
public class Ejercicio03 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] num = new int[10];
    for(int i=0; i < num.length; i++) {
      System.out.print("Introduce el numero de la posicion " + i + ": ");
      num[i]= t.nextInt();
    }
    for(int i=9; i >= 0; i--) {
      System.out.print(num[i] + " ");
    }
  }
} 
