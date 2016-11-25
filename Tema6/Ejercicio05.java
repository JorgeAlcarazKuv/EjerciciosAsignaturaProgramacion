import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 05
 * 
*/
public class Ejercicio05 {
  public static void main (String[] args) {
    int maximo=100;
    int minimo=199;
    int sumatorioParaMedia=0;
    int numeroRandom=0;
    for (int i=0; i<50; i++) {
      numeroRandom=(int)(Math.random()*100+100);
      System.out.print(numeroRandom + " ");
      sumatorioParaMedia += numeroRandom;
      if (numeroRandom < minimo) {
        minimo=numeroRandom;
      }
      if (numeroRandom > maximo) {
        maximo=numeroRandom;
      }
    }
    System.out.println("\nMáximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + sumatorioParaMedia/50);
  }
} 


