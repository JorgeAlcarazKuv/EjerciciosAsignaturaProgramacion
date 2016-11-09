/*
 * @author Jorge Alcaraz
 * Ejercicio 12 tema 5
*/


import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero=0;
    int numero1=0;
    int numero2=1;
    int contador=0;
    
    System.out.println("Introduzca la cantidad de números a mostrar");
    contador = teclado.nextInt();
    for (int i=0;i<contador;i++) {
      System.out.print(numero1 +" ");
      numero = numero1 + numero2;
      numero1 = numero2;
      numero2 = numero;
    }
  }
}
