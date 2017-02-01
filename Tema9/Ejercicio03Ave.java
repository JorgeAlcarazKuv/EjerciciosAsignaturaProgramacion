import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Ave extends Ejercicio03Animal {
  // Atributos
  
  // Constructores
  public Ejercicio03Ave (String nombre, String color, int numPatas) {
    super(nombre,color,numPatas);
  }
  public Ejercicio03Ave () {
    super();
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void vuela() {
    System.out.println("El ave " + this.nombre + " está volando.");
  }
  public void aterriza() {
    System.out.println(this.nombre + " aterriza en el suelo.");  
  }
  public void picotea() {
    System.out.println(this.nombre + " picotea.");  
  }
}
