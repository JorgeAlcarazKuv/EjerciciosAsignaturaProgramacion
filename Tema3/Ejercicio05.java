/*
  Ejercicio 5 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Introduce la altura del rectángulo: ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la base del rectánculo: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.printf("El área del rectángulo es: %.2f", base*altura);
  }
}
