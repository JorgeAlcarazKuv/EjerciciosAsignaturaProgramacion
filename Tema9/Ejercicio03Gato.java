import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Gato extends Ejercicio03Mamifero {
  // Atributos
  
  // Constructores
  public Ejercicio03Gato (String nombre, String color, int numPatas) {
    super(nombre,color,numPatas);
  }
  public Ejercicio03Gato () {
    super();
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void seLame() {
    System.out.println("El gato " + this.nombre + " se lame.");
  }
  public void caeDePie() {
    System.out.println(this.nombre + " cae de pie.");  
  }
  @Override
  public void amamanta() {
    System.out.println(this.nombre + " dice: déjame de rollos.");  
  }
}
