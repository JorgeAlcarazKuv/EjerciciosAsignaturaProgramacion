import java.util.Scanner;
import librerias.Ejercicios01a14;

/*
 * @author Jorge Alcaraz Bravo
 * Tema 8 Ejercicio 17
 * 
*/ 
public class Ejercicio17 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.print("Introduce numero binario: ");
    int numBinario = t.nextInt();
    int numDigitos = librerias.Ejercicios01a14.digitos(numBinario);
    long suma = 0;
    for (int i=0; i < numDigitos; i++) {
      if (numBinario%10 == 1) {
        suma = suma + librerias.Ejercicios01a14.potencia(2, i);
      }
      numBinario = numBinario/10;
    }
    System.out.println(suma);
  }
}
