import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 01
 * 
*/
public class Ejercicio01 {
  public static void main (String[] args) {
    int dado=0;
    int suma=0;
    for (int i=0; i<3; i++) {
      dado = (int)(Math.random()*6)+1;
      System.out.println("Tirada de dado: " + dado);
      suma = suma+dado;
    }
    System.out.print("Suma: " + suma);
  } 
}

