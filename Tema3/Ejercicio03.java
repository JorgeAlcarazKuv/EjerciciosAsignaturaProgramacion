/*
  Ejercicio 3 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio03 {  //es readLine en realidad, y probando deberia ser mayus
  public static void main(String[] args) {
    double factorConversion = 166.386;
    System.out.println("Introduce las pesetas a convertir: ");
    int pesetas = Integer.parseInt(System.console().readLine());
    System.out.printf("%d pesetas son %.2f euros", pesetas, pesetas/factorConversion);
  }
}
