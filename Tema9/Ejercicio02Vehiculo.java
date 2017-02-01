import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 02
 * 
*/ 
abstract class Ejercicio02Vehiculo {
  // Atributos
  private static int vehiculosCreados;
  private static int kilometrosTotales;

  protected int kilometrosRecorridos;
  
  // Constructores
  Ejercicio02Vehiculo (int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
    kilometrosTotales += this.kilometrosRecorridos;
  }
  Ejercicio02Vehiculo () {
    this.kilometrosRecorridos = 0;
  }
  // Getters
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }
  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }
  // Setters
  public void setKilometrosRecorridos(int kR) {
    kilometrosTotales -= this.kilometrosRecorridos;
    this.kilometrosRecorridos = kR;
    kilometrosTotales += this.kilometrosRecorridos;
  }
}
