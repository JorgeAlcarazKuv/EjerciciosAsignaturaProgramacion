/*
  Ejercicio 06 Tema 4
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.print("Introduce la altura: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    if (altura <= 0) {
      System.out.println("Hay que introducir una altura positiva: ");
    } else {
    System.out.printf("El objeto tardará en caer : %f segundos", Math.sqrt((2*altura)/9.81));
    }
  }
}
