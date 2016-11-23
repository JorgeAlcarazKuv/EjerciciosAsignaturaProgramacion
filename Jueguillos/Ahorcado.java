import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Juego del Ahorcado
 * 
*/
public class Ahorcado {
  public static void main (String[] args) {
    Scanner t = new Scanner(System.in);
    int longitud=0;
    int aciertos=0;
    String frase="";
    int intentos = 6;
/////////////////////////////////////////////
    do {
      Limpiar();
      pintarMonigote(intentos);
      System.out.println("Introduzca una palabra o frase de más de 9 letras.");
      frase = t.nextLine();
      longitud =frase.length();
    } while (longitud < 9 );
/////////////////////////////////////////////   
    String fraseOculta="";
    char letra='a';
    for (int i=0;i<longitud;i++) {
      letra=frase.charAt(i);
      if ((letra >= 'a') && (letra <= 'z')) {
        fraseOculta = fraseOculta+"_";
      } else {
        fraseOculta = fraseOculta+" ";
      }
    }
/////////////////////////////////////////////
    String fraseOcultaActualizada=fraseOculta;
    boolean hayAlgunAcierto=false;
    String letraIntroducida = "";
    Limpiar();
    pintarMonigote(intentos);
    System.out.println(fraseOcultaActualizada+ "     " + intentos + " fallos restantes.");
    System.out.print("Introduzca una letra: ");
//////////////////////////////////////////////
    while (intentos > 0 && !frase.equals(fraseOcultaActualizada) && !frase.equals(letraIntroducida)) {
      hayAlgunAcierto=false;
      letraIntroducida = t.nextLine();
      for(int i=0;i<longitud;i++){
        if ((letraIntroducida.equals(frase.substring(i,i+1))) && 
            (!letraIntroducida.equals(fraseOcultaActualizada.substring(i,i+1)))) {
          fraseOcultaActualizada = fraseOculta.substring(0,i)+letraIntroducida+
            fraseOculta.substring(i+1);
          fraseOculta=fraseOcultaActualizada;
          hayAlgunAcierto=true;
        }
      }
      if (!hayAlgunAcierto) {
        intentos--;
      }
      Limpiar();
      if (!frase.equals(fraseOcultaActualizada) && intentos != 0 && !frase.equals(letraIntroducida)) {
        pintarMonigote(intentos);
        System.out.println(fraseOcultaActualizada+ "     " + intentos + " fallos restantes.");
        System.out.print("Introduce una letra o intenta adivinar: ");
      }
      
    }
//////////////////////////////////////////////

    if (intentos == 0) {
      pintarMonigote(intentos);
      System.out.println("Has perdido! La solución era: " + frase );
    } else {
      pintarMonigote(intentos);
      System.out.println("Has ganado! La solución era: " + frase);
    }
  }
///////////////////////////////////////////////
  private static void Limpiar() {
    for (int i=0; i<=50; i++) {
      System.out.println();
      }
  }
  private static void pintarMonigote(int x) {
    switch(x) {
      case 6:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        break;
      case 5:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|     O");
        System.out.println("|   ");
        System.out.println("|     ");
        System.out.println("|");
        break;
      case 4:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|     O");
        System.out.println("|     |");
        System.out.println("|     ");
        System.out.println("|");
        break;
      case 3:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|     O");
        System.out.println("|   --|");
        System.out.println("|     ");
        System.out.println("|");
        break;
      case 2:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|     O");
        System.out.println("|   --|--");
        System.out.println("|     ");
        System.out.println("|");
        break;
      case 1:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|     O");
        System.out.println("|   --|--");
        System.out.println("|     l");
        System.out.println("|");
        break;
      case 0:
        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|     O");
        System.out.println("|   --|--");
        System.out.println("|     ll");
        System.out.println("|");
        break;
    }
  }
}

