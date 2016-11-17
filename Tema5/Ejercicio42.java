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
  /*boolean esPrimo=true;                      ////////Sin funciones
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
  }*/
    for (int j=numero; j<numero+5; j++) {             /// Usando funciones ///
      if (esPrimo(j)) {
        System.out.println(j + " Sí es primo.");
      } else {
        System.out.println(j + " No es primo.");
      }
    }
  }
  ////////////////////Funciones////////////////////////
  
  public static boolean esPrimo(int num) {
    for (int i=2; i <= num-1; i++) {
      if ((num%i) == 0) {
        return false;
      }
    }
  return true;
  }
}
