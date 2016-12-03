import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 07
 * 
*/ 
public class Ejercicio07 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] num = new int[100];
    int valorAntiguo=0;
    int valorNuevo=0;
    for(int i=0; i < num.length; i++) {
      num[i]= (int)(Math.random()*21);
      System.out.print(num[i] + " ");
    }
    System.out.println("\nIntroduce que valor quieres reemplazar: ");
    valorAntiguo=t.nextInt();
    System.out.println("Introduce por cual valor lo quieres cambiar: ");
    valorNuevo=t.nextInt();
    for (int i=0; i< num.length; i++) {
      if (num[i] == valorAntiguo) {
        num[i] = valorNuevo;
      }
    }
    for (int i=0; i<num.length; i++) {
      if (num[i] == valorNuevo) {
        System.out.print(valorNuevo + " ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
  }
}
