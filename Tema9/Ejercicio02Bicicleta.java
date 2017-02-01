/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 02
 * 
*/ 
public class Ejercicio02Bicicleta extends Ejercicio02Vehiculo {

  // Constructores
  Ejercicio02Bicicleta (int kilometrosRecorridos) {
    super(kilometrosRecorridos);
  }
  Ejercicio02Bicicleta () {
    super();
  }
  // Métodos
  public void andar() {
    System.out.println("La bici está andando.");
  }
  public void hacerCaballito() {
    System.out.println("La bici hace el caballito");
  }
}
