/*
  Ejercicio 2 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio02 {  //es readLine en realidad, y probando deberia ser mayus
  public static void main(String[] args) {
    double factorConversion = 166.386;
    System.out.println("Introduce los euros a convertir: ");
    double euros = Double.parseDouble(System.console().readLine());
    System.out.printf("%.2f euros son %.0f pesetas", euros, (int)euros*factorConversion);
  }
}

//Casting de Double a int:
//int variable = (int)(Integer.parseInt(euros*factorconversion);
