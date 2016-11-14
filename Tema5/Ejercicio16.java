/*
 * 
 * @author Jorge Alcaraz Bravo
 * Ejercicio 16, Tema 5
 * 
 * 
 * 
*/

import java.util.Scanner;

public class Ejercicio16 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para saber si es primo: ");
    int numero = Integer.parseInt(s.next());
    boolean esPrimo=true;
    int i=2;
      while (esPrimo==true && i<=numero-1) {
      if (numero%i == 0) {
        esPrimo = false;
      } else esPrimo = true;
      i++;
    }
    if (esPrimo) {
      System.out.print("Sí es primo.");
    } else {
      System.out.print("No es primo.");
    }
  }
}
