import java.util.Scanner;
import librerias.Ejercicios01a14;

/*
 * @author Jorge Alcaraz Bravo
 * Tema 8 Ejercicio 18
 * 
*/ 
public class Ejercicio18 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.print("Introduce numero decimal: ");
    int numDecimal = t.nextInt();
    String numBinarioS = "";
    while (numDecimal >=1) {
      if (numDecimal%2 == 0) {
        numBinarioS = 0 + numBinarioS;
      } else {
        numBinarioS = 1 + numBinarioS;
      }
      numDecimal /= 2;
    }
    int numBinario = Integer.parseInt(numBinarioS);
    System.out.print(numBinario);
  }
}
