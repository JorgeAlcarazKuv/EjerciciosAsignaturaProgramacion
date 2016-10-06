/*
  Probando  la sentencia condicional
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.print("Introduce el día de la semana: ");
    String dia = System.console().readLine().toUpperCase();
    if (dia.equals("LUNES")) {
      System.out.println("A primera hora hay Sistemas Informáticos.");
    } else if (dia.equals("MARTES")) {
      System.out.println("A primera hora hay Programación.");
    } else if (dia.equals("MIERCOLES")) {
      System.out.println("A primera hora hay Programación.");
    } else if (dia.equals("JUEVES")) {
      System.out.println("A primera hora hay BBDD.");
    } else if (dia.equals("VIERNES")) {
      System.out.println("A primera hora hay Lenguaje de Marcas.");
    } else if (dia.equals("SABADO") || dia.equals("DOMINGO")) {
      System.out.println("Ese día no hay clase.");
    } else {
      System.out.println("No has introducido el nombre correctamente.");
  }
  } 
}
