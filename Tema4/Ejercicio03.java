/*
  Ejercicio 12 Tema 3
  @author Jorge Alcaraz Bravo
*/


public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Mostrar día de la semana: ");
    int diaSemana = Integer.parseInt(System.console().readLine());
    
    String dia;
    
    switch (diaSemana) {
      case 1:
        dia = "Lunes";
        break;
      case 2:
        dia = "Martes";
        break;
      case 3:
        dia = "Miercoles";
        break;
      case 4:
        dia = "Jueves";
        break;
      case 5:
        dia = "Viernes";
        break;
      case 6:
        dia = "Sábado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "No existe ese dia";
    }
    System.out.println("El día " + diaSemana + " es " + dia);
  }
}
