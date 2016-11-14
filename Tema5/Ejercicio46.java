/*
 * 
 * @author Jorge Alcaraz Bravo
 * Ejercicio 46, Tema 5
 * 
 * 
 * 
*/

import java.util.Scanner;

public class Ejercicio46 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura del rectángulo: ");
    int altura = Integer.parseInt(s.next());
    System.out.print("Por favor, introduzca la anchura del rectángulo: ");
    int anchura = Integer.parseInt(s.next());
    if (anchura > 2 && altura > 2) {
      for(int j=1; j<=altura;j++) {
        if (j==1 || j==altura) {
          for(int i=1; i<=anchura;i++) {
            System.out.print("* ");
          }
        } else {
          for(int z=1;z<=anchura;z++) {
            if (z==1 || z==anchura) {
              System.out.print("* ");
            } else {
              System.out.print("  ");
            }
          }
        }
        System.out.println();
      }
    } else {
      System.out.print("Datos incorrectos");
    }
  }
}
