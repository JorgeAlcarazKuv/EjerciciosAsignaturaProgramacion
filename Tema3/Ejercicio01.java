/*
  Ejercicio 1 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio01 {  //es readLine en realidad, y probando deberia ser mayus
  public static void main(String[] args) {
    System.out.println("Introduce el primer número: ");
    Double numero1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el segundo número: ");
    Double numero2 = Double.parseDouble(System.console().readLine());
    System.out.printf("El resultado de %.2f * %.2f es %.2f", numero1, numero2, numero1*numero2);
  }
}
