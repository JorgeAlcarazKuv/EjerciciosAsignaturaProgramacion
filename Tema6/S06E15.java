/**
* Realiza un generador de melodía con las siguientes condiciones:
* a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
* sol, la y si.
* b) Una melodía está formada por un número aleatorio de notas mayor o igual
* a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12...).
* c) Cada grupo de 4 notas será un compás y estará separado del siguiente
* compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
* con dos barras.
* d) La última nota de la melodía debe coincidir con la primera.
* Ejemplo 1:
* do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
* Ejemplo 2:
* la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
*
* @author Luis José Sánchez
*/


public class S06E15 {

  public static void main(String[] args) {

    int limiteNotas = 4;
    int contadorNotas = 4;
    int notas;
    String nombreNotas = "";

    if (contadorNotas % 2 == 0){
      do{
        notas = (int)(Math.random()* 7 + 1);
        switch (notas){
          case 1:
          nombreNotas = "do";
          break;

          case 2:
          nombreNotas = "re";
          break;

          case 3:
          nombreNotas = "mi";
          break;

          case 4:
          nombreNotas = "fa";
          break;

          case 5:
          nombreNotas = "sol";
          break;

          case 6:
          nombreNotas = "la";
          break;

          case 7:
          nombreNotas = "si";
          break;
          default:
        }
        System.out.print(nombreNotas + " ");
        contadorNotas++;
          if (contadorNotas == 4){
          System.out.println ("|");
          }
          
        } while (contadorNotas < 4);
      contadorNotas +=8;
    }
  }
}
