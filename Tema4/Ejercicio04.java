/*
  Ejercicio 04 Tema 4
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("Cuantas horas has trabajado esta semana: ");
    double horasTrabajadas = Double.parseDouble(System.console().readLine());
    
    if (horasTrabajadas <= 40) {
      System.out.printf("Vas a cobrar %.2f euros", horasTrabajadas*12);
    } else {
        System.out.printf("Vas a cobrar %.2f euros", (horasTrabajadas-40)*16+horasTrabajadas*12);
      }
  }
}
