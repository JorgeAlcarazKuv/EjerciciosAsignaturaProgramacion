import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 7 Ejercicio 16
 * 
*/ 
public class Ejercicio16 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int[] num = new int[20];
    for(int i=0; i < num.length; i++) {
      num[i]= (int)(Math.random()*401);
    }
    System.out.print("¿Resaltar múltiplos de 5 o de 7?: ");
    int valorResaltado = t.nextInt();
    for (int i=0; i<num.length; i++) {
      if (num[i]%valorResaltado == 0) {
        System.out.print("[" + num[i] + "] ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
  }
}
