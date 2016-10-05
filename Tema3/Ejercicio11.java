/*
  Ejercicio 11 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Introduce los Kb: ");
    double kiloBits = Double.parseDouble(System.console().readLine());
    System.out.printf("%.0f Kb equivalen a %.3f Mb.", kiloBits, kiloBits/1024);
  }
}
