import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Perro extends Ejercicio03Mamifero {
  // Atributos
  
  // Constructores
  public Ejercicio03Perro (String nombre, String color, int numPatas) {
    super(nombre,color,numPatas);
  }
  public Ejercicio03Perro () {
    super();
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void ladra() {
    System.out.println("El perro " + this.nombre + " ladra.");
  }
  public void meaEnLaEsquina() {
    System.out.println(this.nombre + " se mea en la esquina.");  
  }
  public void muerde() {
    System.out.println(this.nombre + " dice: grrrrrrrrrr");  
  }
}
