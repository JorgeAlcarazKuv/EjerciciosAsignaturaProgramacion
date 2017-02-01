import java.util.Scanner;

/*
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 02
 * 
*/ 
public class Ejercicio02Prueba {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    Ejercicio02Bicicleta bici1 = new Ejercicio02Bicicleta(20);
    Ejercicio02Coche coche1 = new Ejercicio02Coche(52);
    coche1.setKilometrosRecorridos(12);
    System.out.println("1.- Anda con la bicicleta");
    System.out.println("2.- Haz el caballito con la bicicleta");
    System.out.println("3.- Anda con el coche");
    System.out.println("4.- Quema rueda con el coche");
    System.out.println("5.- Ver kilometraje de la bicicleta");
    System.out.println("6.- Ver kilometraje del coche");
    System.out.println("7.- Ver kilometraje total");
    System.out.println("8.- Salir");
    int eleccion = 0;
    while (eleccion != 8) {
      System.out.print("Introduce un número: ");
      eleccion = t.nextInt();
      switch (eleccion) {
        case 1:
          bici1.andar();
          break;
        case 2:
          bici1.hacerCaballito();
          break;
        case 3:
          coche1.andar();
          break;
        case 4: 
          coche1.quemarRueda();
          break;
        case 5: 
          System.out.println(bici1.getKilometrosRecorridos());
          break;
        case 6:
          System.out.println(coche1.getKilometrosRecorridos());
          break;
        case 7:
          System.out.println(Ejercicio02Vehiculo.getKilometrosTotales());
          break;
        default:
      }
    }
  }
}
