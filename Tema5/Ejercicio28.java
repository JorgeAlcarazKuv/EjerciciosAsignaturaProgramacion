/*
 * 
 * @author Jorge Alcaraz Bravo
 * Ejercicio 28, Tema 5
 * 
 * 
 * 
*/

import java.util.Scanner;

public class Ejercicio28 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int numero = Integer.parseInt(s.next());
    long factorial= 1;
    for (int i=1;i<=numero;i++) {
      factorial = factorial*i;
    }
    System.out.print(factorial);
  }
}
