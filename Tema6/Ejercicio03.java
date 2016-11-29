/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 03
 * 
*/
public class Ejercicio03 {
  public static void main (String[] args) {
    String palo="";
    String carta="";
    int numPalo=(int)(Math.random()*4)+1;
    int numCarta=(int)(Math.random()*10)+1;
    switch(numPalo) {
      case 1:
        palo= "Oros";
        break;
      case 2:
        palo= "Bastos";
        break;
      case 3:
        palo= "Espadas";
        break;
      case 4:
        palo= "Copas";
        break;
    }
    switch(numCarta) {
      case 1:
        carta="AS";
        break;
      case 8:
        carta="Sota";
        break;
      case 9:
        carta="Caballo";
        break;
      case 10:
        carta="Rey";
        break;
      default:
        carta=String.valueOf(numCarta);
        break;
    }
    System.out.print(carta + " de " + palo);
  }
}
