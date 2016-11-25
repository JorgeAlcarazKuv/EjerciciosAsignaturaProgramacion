import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 06
 *
*/
public class Ejercicio06 {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int numeroIntroducido=0;
    int intentos=5;
    int numeroOculto = (int)(Math.random()*100);

    
    while (numeroIntroducido != numeroOculto && intentos != 0) {
      System.out.print("Adivina el número oculto: ");
      numeroIntroducido = t.nextInt();
      if (numeroIntroducido < numeroOculto) {
        System.out.println("El número oculto es mayor que " + numeroIntroducido);
        intentos--;
        System.out.println("Te quedan " + intentos + " intentos.");
      } else if (numeroIntroducido > numeroOculto) {
        System.out.println("El número oculto es menor que " + numeroIntroducido);
        intentos--;
        System.out.println("Te quedan " + intentos + " intentos.");
      }
    }
    if (intentos == 0) {
      System.out.println("Perdiste! El número era " + numeroOculto);
    } else {
      System.out.println("Correcto, el número era " + numeroOculto);
    }
  }
}

