import java.util.Scanner;
/**
 * @author Jorge Alcaraz Bravo
 * Tema 9 Ejercicio 01
 * 
*/ 
public class Ejercicio01Caballo {
  // Atributos
  private String nombre;
  private int altura;
  private double peso;
  private String color;
  
  // Constructores
  Ejercicio01Caballo (String nombre, int alt, double peso, String color) {
    this.altura = alt;
    this.peso = peso;
    this.color = color;
  }
  Ejercicio01Caballo () {
    // vacio
  }
  
  // Getters
  public String getColor() {
    return this.color;
  }
  // Setters
  public void setColor(String c) {
    this.color = c;
  }
  // Métodos
  public void cabalga() {
    System.out.println("El caballo " + this.nombre + " está cabalgando.");
  }
  public void trotar() {
    System.out.println("El caballo " + this.nombre + " está trotando.");
  }
  public void pararse() {
    System.out.println("El caballo " + this.nombre + " está trotando.");
  }
}


