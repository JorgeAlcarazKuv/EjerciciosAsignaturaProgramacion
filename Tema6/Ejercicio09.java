/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 09
 * 
*/
public class Ejercicio09 {
  public static void main (String[] args) {
    int numero=0;
    int contador=0;
    while (numero != 24) {
      numero=(int)(Math.random()*51)*2;
      System.out.print(numero + " ");
      contador++;
    }
    System.out.print("\nHan sido necesarios " + contador + " numeros aleatorios.");
  }
} 


