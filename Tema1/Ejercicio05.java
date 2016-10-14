/*
  Ejercicio 05 Tema 1
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
    System.out.printf("\033[31m%-10s \033[33m%-10s \033[34m%-10s \033[34m%-10s \033[35m%-10s\n", "SI", "LM", "Prog", "Prog", "BBDD");
    System.out.printf("\033[31m%-10s \033[33m%-10s \033[34m%-10s \033[34m%-10s \033[35m%-10s\n", "SI", "LM", "Prog", "Prog", "BBDD");
    System.out.printf("\033[31m%-10s \033[33m%-10s \033[34m%-10s \033[34m%-10s \033[35m%-10s\n", "SI", "LM", "Prog", "Prog", "BBDD");
    System.out.printf("\033[32m%-10s \033[37m%-10s \033[31m%-10s \033[33m%-10s\033[31m %-10s\n", "FoL", "ED", "SI", "LM", "SI");
    System.out.printf("\033[32m%-10s \033[37m%-10s \033[31m%-10s \033[37m%-10s\033[31m %-10s\n", "FoL", "ED", "SI", "ED", "SI");
    System.out.printf("\033[32m%-10s \033[37m%-10s \033[31m%-10s \033[37m%-10s\033[31m %-10s\033[37m\n", "FoL", "ED", "SI", "ED", "SI");
  }
}
