/*
 *
 * @author Jorge Alcaraz Bravo
 * Ejercicio 44, Tema 5
 *
 *
 *
*/

import java.util.Scanner;

public class Ejercicio44 {
  public static void main (String[] args){
    Scanner s = new Scanner (System.in);
    System.out.print("Introduzca numero: ");
    int numero = Integer.parseInt(s.next());
    System.out.print("Introduzca la posición donde quiere insertar: ");
    int insertar = Integer.parseInt(s.next());
    System.out.print("Introduzca el dígito que quiere insertar: ");
    int numInsertar = Integer.parseInt(s.next());
    int parte1=0;
    //////////////////////////Damos la vuelta al número/////////////////////////////
    int oremun=0;
    while (numero%10>0) {
      oremun = oremun*10 + numero%10;
      numero = numero/10;
    }
    numero = oremun;
    /////////////////////////////////////////////////////////////////////////////////
    for (int i=0;i<insertar;i++) {
      parte1 = parte1*10+numero%10;
      numero /= 10;
    }
    parte1 = parte1*10+numInsertar;
    while (numero%10>0) {
      parte1=parte1*10+numero%10;
      numero /= 10;
    }
    System.out.printf("El nuevo número es: %d", parte1);
  }
}
