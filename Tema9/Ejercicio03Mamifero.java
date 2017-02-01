import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Mamifero extends Ejercicio03Animal {
  // Atributos
  
  // Constructores
  public Ejercicio03Mamifero (String nombre, String color, int numPatas) {
    super(nombre,color,numPatas);
  }
  public Ejercicio03Mamifero () {
    super();
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void amamanta() {
    System.out.println("El mamífero " + this.nombre + " está amamantando");
  }
  public void pare() {
    System.out.println(this.nombre + " está pariendo.");  
  }
}
