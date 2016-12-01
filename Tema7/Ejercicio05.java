import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 05
 * 
*/
public class Ejercicio05 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] num = new int[10];
    int maximo=Integer.MIN_VALUE;
    int minimo=Integer.MAX_VALUE;
    for(int i=0; i < num.length; i++) {
      System.out.print("Introduce el numero de la posicion " + i + ": ");
      num[i]= t.nextInt();
      if (num[i] < minimo) {
        minimo = num[i];
      } else if (num[i] > maximo) {
        maximo = num[i];
      }
    }
    for(int i=0; i < num.length; i++) {
      if (num[i] == minimo) {
        System.out.println(num[i] + " es el minimo.");
      } else if (num[i] == maximo) {
        System.out.println(num[i] + " es el maximo.");
      } else {
        System.out.println(num[i]);
      }
    }
  }
} 
