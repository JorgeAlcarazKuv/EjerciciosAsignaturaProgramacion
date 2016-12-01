/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 02
 * 
*/
public class Ejercicio02 {
  public static void main (String[] args) {
    char[] simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'a';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    for(int i=0; i < simbolo.length; i++) {
      System.out.print(simbolo[i] + " ");
    }
  }
} 
