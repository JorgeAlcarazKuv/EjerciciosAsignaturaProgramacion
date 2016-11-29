import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 10
 * 
*/
public class Ejercicio10 {
  public static void main (String[] args) {
    for (int linea=1; linea <= 10; linea++) {
      int numCaracteres=(int)(Math.random()*40+1);
      int tipoCaracter=(int)(Math.random()*6+1);
      for (int i=1; i<=numCaracteres; i++) {
        switch(tipoCaracter) {
          case 1:
            System.out.print("*");
            break;
          case 2:
            System.out.print("-");
            break;
          case 3:
            System.out.print("=");
            break;
          case 4:
            System.out.print(".");
            break;
          case 5:
            System.out.print("|");
            break;
          case 6:
            System.out.print("@");
            break;
        }
      }
      System.out.println();
    }
  }
} 
