/*
 *
 * @author Jorge Alcaraz Bravo
 * Ejercicio 45, Tema 5
 *
 *
 *
*/

import java.util.Scanner;

public class Ejercicio45 {
  public static void main (String[] args){
    Scanner s = new Scanner (System.in);
    System.out.print("Introduzca numero: ");
    long numero = Long.parseLong(s.next());
    System.out.print("Introduzca la posición donde quiere sustituir: ");
    long sustituir = Long.parseLong(s.next());
    System.out.print("Introduzca el dígito que quiere insertar: ");
    long numInsertar = Long.parseLong(s.next());
    long parte1=0;
    //////////////////////////Damos la vuelta al número/////////////////////////////
    long oremun=0;
    while (numero%10>0) {
      oremun = oremun*10 + numero%10;
      numero = numero/10;
    }
    numero = oremun;
    /////////////////////////////////////////////////////////////////////////////////
    for (long i=1;i<sustituir;i++) {
      parte1 = parte1*10+numero%10;
      numero /= 10;
    }
    numero /=10;
    parte1 = parte1*10+numInsertar;
    while (numero%10>0) {
      parte1=parte1*10+numero%10;
      numero /= 10;
    }
    System.out.printf("El nuevo número es: %d", parte1);
  }
}
