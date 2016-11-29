/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 07
 * 
*/
public class Ejercicio07 {
  public static void main (String[] args) {
    int resultado=0;
    /////////Se imprimen 3 columnas (j) con 14 lineas (i)
    for (int i=0; i<14; i++) {
      for (int j=0; j<3; j++) {
        /////Se genera numero aleatorio e imprime 1, x o 2
        resultado = (int)(Math.random()*3+1);
        if (resultado == 3) {
          System.out.print("x");
        } else {
          System.out.print(resultado);
        }
        System.out.print("  ");
      }
      System.out.println();
    }
    ////////Se imprime ultima linea del pleno al quince
    resultado = (int)(Math.random()*3+1);
    if (resultado == 3) {
      System.out.print("x");
    } else {
      System.out.print(resultado);
    }
  }
}
