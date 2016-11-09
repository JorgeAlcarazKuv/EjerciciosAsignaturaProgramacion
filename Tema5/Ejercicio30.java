/*
 * 
 * @author Jorge Alcaraz Bravo
 * Ejercicio 29, Tema 5
 * 
 * 
 * 
*/
import java.util.Scanner;

public class Ejercicio30 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int horasTranscurridas = 0;
    
    System.out.print("Introduce la primera hora: ");
    int primeraHora = Integer.parseInt(s.next());
    System.out.print("Introduce el primer dia: ");
    int primerDia = Integer.parseInt(s.next());
    System.out.print("Introduce la segunda hora: ");
    int segundaHora = Integer.parseInt(s.next());
    System.out.print("Introduce el segundo dia: ");
    int segundoDia = Integer.parseInt(s.next());
    if ((primerDia <= segundoDia) && (primerDia>=1 && primerDia<=7) && (segundoDia>=1 && segundoDia<=7)
        && (primeraHora>=0) && (primeraHora <=23) && (segundaHora>=0) && (segundaHora <=23)) {
      for (int j = primerDia; j<segundoDia; j++ ) {
        for(int i = primeraHora;i < 24;i++) {
          horasTranscurridas++;
        }
        primeraHora=0;
      }
      horasTranscurridas = horasTranscurridas + segundaHora;
      System.out.print(horasTranscurridas);
    } else {
    System.out.print("Datos no introducidos correctamente");
    }
  }
}
