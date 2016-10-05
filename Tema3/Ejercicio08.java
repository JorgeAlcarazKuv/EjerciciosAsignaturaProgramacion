/*
  Ejercicio 8 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Cuantas horas trabajas esta semana?: ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());
    System.out.printf("Esta semana ganas %.2f euros.", horasTrabajadas*12);
  }
}
