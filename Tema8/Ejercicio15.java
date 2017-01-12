import librerias.Ejercicios01a14;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 8 Ejercicio 15
 * 
*/ 
public class Ejercicio15 {
  public static void main (String[] args) {
    for (int i=0; i < 1000; i++) {
      if (librerias.Ejercicios01a14.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
