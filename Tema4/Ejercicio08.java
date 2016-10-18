/*
  Ejercicio 08 Tema 4
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio08  {
  public static void main(String[] args) {
    System.out.print("Introduce la primera nota: ");
    double primeraNota = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota: ");
    double segundaNota = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la tercera nota: ");
    double terceraNota = Double.parseDouble(System.console().readLine());
    
    if (primeraNota < 0 || primeraNota > 10) {
      System.out.println("La primera nota introducida no es correcta.");
    } else if (segundaNota < 0 || segundaNota > 10) { 
        System.out.println("La segunda nota introducida no es correcta.");
    } else if (terceraNota < 0 || terceraNota > 10) { 
        System.out.println("La tercera nota introducida no es correcta.");
    } else if (((primeraNota+segundaNota+terceraNota)/3) >= 9){
        System.out.printf("La media es %f: Sobresaliente", (primeraNota+segundaNota+terceraNota)/3);
    } else if (((primeraNota+segundaNota+terceraNota)/3) >= 7){
        System.out.printf("La media es %f: Notable", (primeraNota+segundaNota+terceraNota)/3);
    } else if (((primeraNota+segundaNota+terceraNota)/3) >= 6){
        System.out.printf("La media es %f: Bien", (primeraNota+segundaNota+terceraNota)/3);
    } else if (((primeraNota+segundaNota+terceraNota)/3) >= 5){
        System.out.printf("La media es %f: Suficiente", (primeraNota+segundaNota+terceraNota)/3);
    } else {
        System.out.printf("La media es %f: Insuficiente", (primeraNota+segundaNota+terceraNota)/3);
    }
  }
}
