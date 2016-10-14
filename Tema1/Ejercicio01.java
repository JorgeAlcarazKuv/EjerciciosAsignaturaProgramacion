/*
  Ejercicio 12 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Introduce la nota del primer examen: ");
    double primerExamen = Double.parseDouble(System.console().readLine());
    System.out.println("Qué nota quieres sacar este trismestre?: ");
    double notaDeseada = Double.parseDouble(System.console().readLine());
    System.out.printf("Para tener un %.2f este trimestre necesitas sacar un %.2f ", notaDeseada, 
    (notaDeseada-primerExamen*0.4)/0.6);   //primerExamen*0.4+segundoExamen*0.6=notaDeseada
  }
}
