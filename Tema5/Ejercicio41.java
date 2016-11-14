/*
 * 
 * @author Jorge Alcaraz Bravo
 * Ejercicio 41, Tema 5
 * 
 * 
 * 
*/

import java.util.Scanner;

public class Ejercicio41 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para saber sus pares e impares: ");
    long numero = Long.parseLong(s.next());
    int contadorPares=0;
    int contadorImpares=0;
    while (numero%10 > 0) {
      if ((numero%10)%2 == 0) {
        contadorPares++;
      } else {
        contadorImpares++;
      }
      numero /= 10;
    }
    System.out.print("Pares: " + contadorPares + " Impares: " + contadorImpares);
  }
}
