import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 03
 * 
*/ 
public class Ejercicio03Lagarto extends Ejercicio03Animal {
  // Atributos
  
  // Constructores
  public Ejercicio03Lagarto (String nombre, String color, int numPatas) {
    super(nombre, color, numPatas);
  }
  public Ejercicio03Lagarto () {
    super();
  }
  // Getters
  
  // Setters
  
  // Métodos
  public void seTumbaAlSol() {
    System.out.println("lagarto tumbaito");
  }
  public void seQuedaQuieto() {
    System.out.println("Aquí de tranquileo");  
  }
}
