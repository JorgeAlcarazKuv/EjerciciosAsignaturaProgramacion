/*
  Ejercicio 10 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Introduce los Mb: ");
    int megaBits = Integer.parseInt(System.console().readLine());
    System.out.printf("%d Mb equivalen a %d Kb.", megaBits, megaBits*1024);
  }
}
