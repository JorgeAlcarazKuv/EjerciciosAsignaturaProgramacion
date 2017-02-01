import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Pinguino extends Ejercicio03Ave {
  // Atributos
  
  // Constructores
  public Ejercicio03Pinguino (String nombre, String color, int numPatas) {
    super(nombre,color,numPatas);
  }
  public Ejercicio03Pinguino () {
    super();
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void canta() {
    System.out.println("Los pinguinos no cantan.");
  }
  public void piopio() {
    System.out.println(this.nombre + " dice: meeeeeeeeec meeeeeeeeeeeeeeeeeec");  
  }
  @Override
  public void vuela() {
    System.out.println(this.nombre + " dice: no puedo volar, has herido mis sentimientos.");  
  }
}
