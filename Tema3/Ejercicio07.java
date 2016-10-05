/*
  Ejercicio 7 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Introduce el precio sin iva: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el porcentaje de iva: ");
    double iva = Double.parseDouble(System.console().readLine());
    System.out.printf("El precio con iva es %.2f", baseImponible+(baseImponible*iva)/100);
  }
}
