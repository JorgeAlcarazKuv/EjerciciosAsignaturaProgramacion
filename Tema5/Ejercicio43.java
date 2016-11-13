/*
 *
 * @author Jorge Alcaraz Bravo
 * Ejercicio 43, Tema 5
 *
 *
 *
*/

import java.util.Scanner;

public class Ejercicio43 {
  public static void main (String[] args){
    Scanner s = new Scanner (System.in);
    System.out.print("Introduzca numero: ");
    int numero = Integer.parseInt(s.next());
    System.out.print("Introduzca la posición en la que quiere partir el número: ");
    int partir = Integer.parseInt(s.next());
    int parte1=0;
    int parte2=0;
    //////////////////////////Damos la vuelta al número/////////////////////////////
    int oremun=0;
    while (numero%10>0) {
      oremun = oremun*10 + numero%10;
      numero = numero/10;
    }
    numero = oremun;
    /////////////////////////////////////////////////////////////////////////////////
    for (int i=0;i<partir;i++) {
      parte1 = parte1*10+numero%10;
      numero /= 10;
    }
    while (numero%10>0) {
      parte2=parte2*10+numero%10;
      numero /= 10;
    }
    System.out.printf("Los números partidos son %d y %d", parte1, parte2);
  }
}
