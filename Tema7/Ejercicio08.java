import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 08
 * 
*/ 
public class Ejercicio08 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int [] num = new int [12];
    
    for(int i=0; i < num.length; i++) {
      System.out.println("Introduce la temperatura media del mes " + (i+1) +  ": ");
      num[i] = t.nextInt();
    }
    for(int j=0; j < num.length; j++) {
      for(int i=0; i < num[j]; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
