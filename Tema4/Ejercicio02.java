/*
  Probando  la sentencia condicional
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("¿Qué hora es?: ");
    int hora = Integer.parseInt(System.console().readLine());
  
    if (hora >= 6 && hora <= 12) { 
      System.out.println("Buenos dias");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("Buenas tardes");
    } else if ((hora >= 21 && hora <= 24) || (hora >= 1 && hora <= 5)) {
      System.out.println("Buenas noches");
    }
  }
}
