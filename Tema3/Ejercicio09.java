/*
  Ejercicio 9 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Introduce la altura del cono: ");
    double alturaCono = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el radio de la base del cono: ");
    double radioCono = Double.parseDouble(System.console().readLine());
    System.out.printf("El volumen del cono es %.4f", (Math.PI*(radioCono*radioCono)*alturaCono)/3);
  }
}
