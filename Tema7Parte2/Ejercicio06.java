/**
 * Tema 7 Parte 2. Ejercicio 06
 * @author Jorge Alcaraz
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    int[][] num = new int[6][10];
    int minimo = Integer.MAX_VALUE;
    int minFila = 0;
    int minColumna = 0;
    int maximo = Integer.MIN_VALUE;
    int maxFila = 0;
    int maxColumna = 0;
    boolean repetido;
    for(int fila = 0; fila < 6; fila++) {
      for(int columna = 0; columna < 10; columna++) {
        repetido = true;
        while (repetido) {
          num[fila][columna] = (int)(Math.random() * 1001);
          repetido = false;
          for (int i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
        }
      }
    }
    for(int fila = 0; fila < 6; fila++) {
      for(int columna=0;columna<10;columna++) {
        System.out.printf("%5d ", num[fila][columna]);
        if (num[fila][columna] < minimo) {
          minimo= num[fila][columna];
          minFila= fila;
          minColumna= columna;
        }
        if (num[fila][columna] > maximo) {
          maximo= num[fila][columna];
          maxColumna= columna;
          maxFila= fila;
        }
      }
      System.out.println();
    }
    System.out.println("\nMaximo: " + maximo + ". Posición: " + maxFila + "," + maxColumna);
    System.out.println("Minimo: " + minimo + ". Posición: " + minFila + "," + minColumna);
  }
}
