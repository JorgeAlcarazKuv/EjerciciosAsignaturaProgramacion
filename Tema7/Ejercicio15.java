import java.util.Scanner;

/**
 * Ejercicio 15 Tema 7 parte 1
 * @author Jorge Alcaraz
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    // Variables
    Scanner teclado = new Scanner(System.in);
    int mesa[] = new int[10];
    int ocupantes = -1;
    boolean acoplada = false;

    // Bucle principal
    while (ocupantes != 0) {
      //preguntar número de clientes
      System.out.print("¿Cuántos son? (Introduzca 0 para salir): ");
      ocupantes = teclado.nextInt();
      if (ocupantes >= 1 && ocupantes <= 4) {
        acoplada=false;
        for (int i = 0; i < 10 && acoplada == false; i++) {  // Comprobamos mesas vacias
          if (mesa[i] == 0) {
            mesa[i] = ocupantes;
            System.out.println("Vayan a la mesa número " + (i+1));
            acoplada = true;
          }
        }
        if (acoplada == false) { // Si no hay mesas vacias, vemos en que mesa caben
          for (int i = 0; i < 10 && acoplada == false; i++) {
            if (mesa[i] + ocupantes <= 4) {
              mesa[i] += ocupantes;
              acoplada = true;
              System.out.println("Vais a tener que compartir mesa.");
              System.out.println("Vayan a la mesa número " + (i+1));
            }
          }
          if (acoplada == false) { // Si no hay mesas vacias
            System.out.println("No hay mesas, vete.");
          }
        }
      } else if (ocupantes > 4) { // Si el grupo es mayor de 4
        System.out.println("Haced grupos de 4 máximo.");
      }
      System.out.println("┌────────────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
      System.out.println("| Mesas:     | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|");
      System.out.println("├────────────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
      System.out.print("| Ocupantes: | ");
      for (int i=0; i < 10; i++) { //Imprimimos las mesas
        System.out.print(mesa[i] + " | ");
      }
      System.out.println();
      System.out.println("└────────────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
    }
  }
}
