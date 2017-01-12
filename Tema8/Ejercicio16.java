import librerias.Ejercicios01a14;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 8 Ejercicio 16
 * 
*/ 
public class Ejercicio16 {
  public static void main (String[] args) {
    for (int i=0; i < 99999; i++) {
      if (librerias.Ejercicios01a14.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
