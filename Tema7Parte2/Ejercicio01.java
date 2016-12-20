/*
 * Tema 7 Parte 2. Ejercicio 01
 * @author Jorge Alcaraz Bravo
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int[][] numero = new int[3][6];
    int fila;
    int columna;
    numero[0][0] = 0;
    numero[0][1] = 30;
    numero[0][2] = 2;
    numero[0][5] = 7;
    numero[1][0] = 75;
    numero[1][4] = 0;
    numero[2][2] = -2;
    numero[2][3] = 9;
    numero[2][5] = 11;

    for(fila = 0; fila < 3; fila++) {
      for(columna = 0; columna < 6; columna++) {
        System.out.printf("%6d   ", numero[fila][columna]);
      }
      System.out.println();
    }
  }
}
