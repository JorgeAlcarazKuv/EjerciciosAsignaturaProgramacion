/**
 * Tema 7 Parte 2. Ejercicio 03
 * @author Jorge Alcaraz Bravo
 */
public class Ejercicio04 {
  public static void main(String[] args) throws InterruptedException {
    int[][] num = new int[4][5];
    int fila;
    int columna;
    int columnaTotal;
    int sumaTotal= 0;
    int filaTotal;
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        num[fila][columna] = (int)(Math.random()*900)+100;
      }
    }
    for(fila = 0; fila < 4; fila++) {
      filaTotal = 0;  
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%5d    ", num[fila][columna]);
        filaTotal += num[fila][columna];
      } 
      Thread.sleep(1000); 
      System.out.printf("%5d\n", filaTotal);
    }
    for(columna = 0; columna < 5; columna++) {
      columnaTotal = 0;
      for(fila = 0; fila < 4; fila++) {
        columnaTotal += num[fila][columna];
      }
      sumaTotal += columnaTotal;
      System.out.printf("%5d    ", columnaTotal);
      Thread.sleep(1000);
    }
    System.out.printf("%5d    ", sumaTotal);
  }
}
