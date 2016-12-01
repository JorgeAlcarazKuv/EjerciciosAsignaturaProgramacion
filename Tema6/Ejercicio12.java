
/*
 * @author Jorge Alcaraz Bravo
 * Tema 6 Ejercicio 12
 * 
*/   
public class Ejercicio12 {
  public static void main (String[] args) {
    int numCaracteresColumnaMax;
    int tieneCaracteres = 0;
    String primeraFila = "";
    String siguienteFila = ""; 
      while (true) {  /////// Se repite indefinidamente
      primeraFila = ""; 
      ////// Creamos una primera fila con caracteres aleatorios o espacios
      for (int posFila = 0; posFila < 80; posFila++) {
        tieneCaracteres = (int)(Math.random()*2);
        switch (tieneCaracteres) {
          case 0:
            primeraFila=primeraFila + " ";
            break;
          case 1:
            primeraFila=primeraFila + ((char)(Math.random()*92+33));
            break;
        }
      }
      System.out.println("\033[32m" + primeraFila); ///Mostramos la primera fila
      numCaracteresColumnaMax = (int) (Math.random()*10+5);
      //// Saltos de linea para que se creen "columnas" de caracteres o espacios
      for (int linea = 0; linea < numCaracteresColumnaMax; linea++) {
        siguienteFila = "";
        ////Creamos el resto de filas fijandonos en los espacios o caracteres de la primera
        for (int posFila = 0; posFila < 80; posFila++) {
          if ((primeraFila.charAt(posFila) >= '!') && (primeraFila.charAt(posFila) <= '}')) {
            siguienteFila = siguienteFila + (char)(Math.random()*92+33);
          } else {
            siguienteFila = siguienteFila + " ";
          }
        } try {
          Thread.sleep(100);
        }
        catch (InterruptedException e) {
        }
        System.out.println(siguienteFila);
      }
    }
  }
} 
