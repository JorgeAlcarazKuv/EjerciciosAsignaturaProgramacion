import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Animal {
  // Atributos
  protected int numPatas;
  protected String color;
  protected String nombre;
  
  // Constructores
  public Ejercicio03Animal (String nombre, String color, int numPatas) {
    this.nombre = nombre;
    this.color = color;
    this.numPatas= numPatas;
  }
  public Ejercicio03Animal () {
    // vacio
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void salta() {
    System.out.println("El animal " + this.nombre + " salta.");
  }
  public void sePeleaCon (Ejercicio03Animal contrincante) {
    System.out.println(this.nombre + " ataca a " + contrincante.nombre);
  }
  public static void main (String[] args) {
    Ejercicio03Gato gatito = new Ejercicio03Gato("Mira", "rojo", 7);
    Ejercicio03Perro perrito = new Ejercicio03Perro("Macho", "azul", 12);
    gatito.sePeleaCon(perrito);
  }
}
