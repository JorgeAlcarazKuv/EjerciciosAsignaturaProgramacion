import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 04
 * 
*/
public class Ejercicio04 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];  
    //// Relleno los 3 arrays
    for(int i=0; i < numero.length; i++) {
      numero[i]= (int)(Math.random()*101);
    }
    for(int i=0; i < cuadrado.length; i++) {
      cuadrado[i] = numero[i]*numero[i];
    }
    for(int i=0; i < cubo.length; i++) {
      cubo[i] = numero[i]*numero[i]*numero[i];
    }
    //// Muestro los 3 arrays
    for(int i=0; i < numero.length; i++) {
      System.out.printf("%10d   %10d   %10d\n", numero[i],cuadrado[i],cubo[i]);
    }
  }
} 
