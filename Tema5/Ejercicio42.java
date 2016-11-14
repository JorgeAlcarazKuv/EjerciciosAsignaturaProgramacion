/*
 * 
 * @author Jorge Alcaraz Bravo
 * Ejercicio 42, Tema 5
 * 
 * 
 * 
*/

import java.util.Scanner;

public class Ejercicio42 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(s.next());
    boolean esPrimo=true;
    int i=2;
    for (int j=numero; j<numero+5; j++) {
      esPrimo=true; //Reinicio
      i=2;          //las variables
      while (esPrimo==true && i<=j-1) {
        if (j%i == 0) {
          esPrimo = false;
        } else esPrimo = true;
      i++;
      }
      if (esPrimo) {
        System.out.println(j + " Sí es primo.");
      } else {
        System.out.println(j + " No es primo.");
      }
    }
  }
}
