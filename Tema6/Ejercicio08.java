/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 08
 * 
*/
public class Ejercicio08 {
  public static void main (String[] args) {
    int resultado=0;
    int columnas=3;
    /////////Se imprimen 3 columnas (j) con 14 lineas (i)
    for (int i=1; i<=14; i++) {
      if (i == 14) {
        columnas=1;
      }
      for (int j=0; j<columnas; j++) {
        /////Se genera numero aleatorio e imprime 1, x o 2
        resultado = (int)(Math.random()*6+1);
        switch(resultado) {
          case 1:
          case 2:
          case 3:
            System.out.print(" 1 |");
            break;
          case 4:
          case 5:
            System.out.print(" X |");
            break;
          case 6:
            System.out.print(" 2 |");
            break;
        }
      }
      System.out.println();
    }
  }
}
