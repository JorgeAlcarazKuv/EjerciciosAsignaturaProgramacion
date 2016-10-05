/*
  Ejercicio 6 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Introduce la altura del triángulo: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la base del triángulo: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.printf("El área del triángulo es: %.2f", (base*altura)/2);
  }
}
