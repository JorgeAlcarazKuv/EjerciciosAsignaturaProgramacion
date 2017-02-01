import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Canario extends Ejercicio03Ave {
  // Atributos
  
  // Constructores
  public Ejercicio03Canario (String nombre, String color, int numPatas) {
    super(nombre,color,numPatas);
  }
  public Ejercicio03Canario () {
    super();
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void canta() {
    System.out.println("El canario " + this.nombre + " canta.");
  }
  public void piopio() {
    System.out.println(this.nombre + " hace piopio");  
  }
  @Override
  public void picotea() {
    System.out.println(this.nombre + " dice: yo no picoteo, muyayo.");  
  }
}
