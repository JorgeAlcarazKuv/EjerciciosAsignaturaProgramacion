/*
 * 
 * @author Jorge Alcaraz Bravo
 * Ejercicio 29, Tema 5
 * 
 * 
 * 
*/

import java.util.Scanner;

public class Ejercicio29 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    System.out.print("Números menores a: ");
    int numero = Integer.parseInt(s.next());
    System.out.print("Que no sean divisibles por: ");
    int noDivisiblePor = Integer.parseInt(s.next());
    
    for (int i=1;i<=numero;i++) {
      if (i % noDivisiblePor != 0)
      System.out.print(i + " ");
    }
  }
}
