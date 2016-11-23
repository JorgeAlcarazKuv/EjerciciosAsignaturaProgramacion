import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 01
 * 
*/
public class Ejercicio02 {
  public static void main (String[] args) {
    String palo="";
    String carta="";
    int numPalo=(int)(Math.random()*4)+1;
    int numCarta=(int)(Math.random()*13)+1;
    switch(numPalo) {
      case 1:
        palo= "Picas";
        break;
      case 2:
        palo= "Corazones";
        break;
      case 3:
        palo= "Diamantes";
        break;
      case 4:
        palo= "Tréboles";
        break;
    }
    switch(numCarta) {
      case 1:
        carta="A";
        break;
      case 11:
        carta="J";
        break;
      case 12:
        carta="Q";
        break;
      case 13:
        carta="K";
        break;
      default:
        carta=String.valueOf(numCarta);
        break;
    }
    System.out.print(carta + " de " + palo);
  }
}
