/*
  Ejercicio 05 Tema 4
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.print("Introduce a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.println(a + "x + " + b + " = 0");
    System.out.print("x = " + a/(-b));
  }
}
