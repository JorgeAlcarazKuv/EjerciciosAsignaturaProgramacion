/* 
 * Ejercicio 02 Tema 7 Parte 2
 * @author Jorge Alcaraz
 * 
*/



public class Ejercicio02 {
  public static void main(String[] args) {
    int tabla[][] = new int[5][6];
    //// Lleno la tabla
    for (int i=0; i<5; i++) {
      for (int j=0; j<6; j++) {
        if (i != 4 && j != 5) {
        tabla[i][j]=(int) (Math.random()*9);
        }
      }
    }
    //// Sumatorios
    for (int i=0;i < 5; i++) {
      for (int j=0; j < 6; j++) {
        if (j != 5) {
          tabla[i][5] += tabla[i][j];  // Se suma a la ultima posicion si no estamos ahi
        } 
        if (i != 4 && j!=5) {
          tabla[4][j] += tabla[i][j];
        }
      }
    }
    //// Imprimir tabla
    for (int i=0; i<5; i++) {
      for (int j=0; j<6; j++) {
        System.out.printf("%10d", tabla[i][j]);
      }
      System.out.println("");
    }
  }
}
