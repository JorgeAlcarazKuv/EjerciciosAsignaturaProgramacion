/**
 * Tema 7 Parte 2. Ejercicio 05
 * @author Jorge Alcaraz
 */
public class Ejercicio05 {

  public static void main(String[] args) {
    int[][] num = new int[6][10];
    int fila;
    int columna;
    int minimo = Integer.MAX_VALUE;
    int minFila = 0;
    int minColumna = 0;
    int maximo = Integer.MIN_VALUE;
    int maxFila = 0;
    int maxColumna = 0;
    for(fila = 0; fila < 6; fila++) {
      for(columna=0;columna<10;columna++) {
        num[fila][columna]=(int)(Math.random()*1001);
        System.out.printf("%5d ", num[fila][columna]);
        if (num[fila][columna] < minimo) {
          minimo= num[fila][columna];
          minFila= fila;
          minColumna= columna;
        }
        if (num[fila][columna] > maximo) {
          maximo= num[fila][columna];
          maxFila= fila;
          maxColumna= columna;
        }
      }
      System.out.println();
    }
    System.out.println("\nMaximo: " + maximo + ". Posición: " + maxFila + "," + maxColumna);
    System.out.println("Minimo: " + minimo + ". Posición: " + minFila + "," + minColumna);
  }
}
