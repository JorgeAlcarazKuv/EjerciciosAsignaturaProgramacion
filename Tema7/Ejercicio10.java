import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 10
 * 
*/ 
public class Ejercicio10 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] num = new int[20];
    // Muestro array inicial
    for(int i=0; i < num.length; i++) {
      num[i]= (int)(Math.random()*101);
      System.out.print(num[i] + " ");
    }
    // Cuento el numero de pares en el array
    int numPares=0;
    for(int i=0; i<num.length; i++) {
      if (num[i]%2 == 0) {
        numPares++;
      }
    }
    // Ordenamos array
    int aux = 0;
    int i=0;
    while (i < numPares) { // Repetimos el algoritmo numPares veces
      // Si es impar el número, lo guarda en aux, rota a la izq los siguientes números, y pone aux al final
      if (num[i]%2 != 0) {
        aux = num[i];
        for (int j =   i; j < num.length-1; j++) {
          num[j] = num[j+1];
        }
        num[num.length-1] = aux;
      } else {
        i++;
      }
    }
    System.out.println("\nArray ordenado par-impar: ");
    for(int j=0; j < num.length; j++) {
      System.out.print(num[j] + " ");
    }
  }
}
