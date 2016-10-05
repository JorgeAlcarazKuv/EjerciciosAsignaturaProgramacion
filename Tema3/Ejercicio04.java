/*
  Ejercicio 4 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Introduce el primer número: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el segundo número: ");
    double numero2 = Double.parseDouble(System.console().readLine());
    System.out.printf("Suma: %.2f\n", numero1+numero2);
    System.out.printf("Resta: %.2f\n", numero1-numero2);
    System.out.printf("Multiplicación: %.2f\n", numero1*numero2);
    System.out.printf("División: %.2f\n", numero1/numero2);

  }
}
