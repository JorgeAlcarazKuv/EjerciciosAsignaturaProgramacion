import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 17
 * 
*/ 
public class Ejercicio17 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] num = new int[10];
    // Creamos array
    System.out.println("Array sin rotar: ");
    for(int i=0; i < num.length; i++) {
      num[i]= (int)(Math.random()*101);
      System.out.print(num[i] + " ");
    }
    System.out.println();
    boolean existeNumero = false;
    int numIntroducido= -1;
    // Comprobamos que el número está en el array
    while (!existeNumero) {
      System.out.print("Introduzca un número: ");
      numIntroducido = t.nextInt();
      for (int i=0;i < num.length; i++) {
        if (num[i] == numIntroducido) {
          existeNumero = true;
        }
      }
    }
    // Algoritmo de rotación
    int aux2;
    while (num[0] != numIntroducido) {
      int aux=num[0];
      for(int i=0; i < num.length; i++) {
        if (i == num.length-1) {
          num[0] = aux;
        } else {
        aux2 = aux;
        aux = num[i+1];
        num[i+1] = aux2;
        }
      }
    }
    // Mostrar array rotado
    for (int i=0;i < num.length; i++) {
        System.out.print(num[i] + " ");
      }
  }
}
