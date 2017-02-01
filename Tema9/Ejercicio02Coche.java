/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 02
 * 
*/ 
public class Ejercicio02Coche extends Ejercicio02Vehiculo {

  // Constructores
  Ejercicio02Coche (int kilometrosRecorridos) {
    super(kilometrosRecorridos);
  }
  Ejercicio02Coche () {
    super();
  }
  // Métodos
  public void andar() {
    System.out.println("El coche está andando.");
  }
  public void quemarRueda() {
    System.out.println("El coche quema rueda.");
  }
}
