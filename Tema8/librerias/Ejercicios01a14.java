package librerias;
import java.util.Scanner;
/*
 * @author Jorge Alcaraz Bravo
 * Tema 8 Ejercicios 1 - 14
 * 
*/ 
public class Ejercicios01a14 {
  /*public static void main(String[] args) {
  Scanner t = new Scanner(System.in);
  //int p=t.nextInt();
  System.out.println(voltea(1230));
  }
*/
  
  public static boolean esCapicua (int x) {
    return (x == voltea(x));
  }
  public static int voltea(int x) {
    int numVolteado=1;
    int i=0;
    while (x>=1) {
      numVolteado = numVolteado*10 + x%10;
      x = x/10;
      i++;
    }
    numVolteado = numVolteado-potencia(10,i);
    return numVolteado;
  }
  public static boolean esPrimo (int x) {
    for(int i=2;i*2 < x;i++) {
      if(x%i==0)
        return false;
    }
    return true;
  }
  public static int siguientePrimo (int x) {
    int i = x+1;
    while (!esPrimo(i)) {
      i++;
    }
    return i;
  }
  public static int potencia(int base, int exponente) {
    int resultado=1;
    for(int i=0; i < exponente;i++) {
      resultado = resultado*base;
    }
    return resultado;
  }
  public static int digitos(long x) {
    int i=0;
    while (x>=1) {
      i++;
      x = x/10;
    }
    return i;
  }
  public static int digitoN (int n, int pos) {
    int volteado = voltea(n);
    for (int i=0; i < pos; i++) {
      volteado = volteado/10;
    }
    return volteado%10;
  }
  public static int posicionDeDigito (int n, int digito) {
    int volteado = voltea(n);
    int i=0;
    while (volteado >=1) {
      if (digito == volteado%10) {
        return i;
      }
      volteado = volteado/10;
      i++;
    }
    return i;
  }
  public static int quitaPorDetras (int n, int quitaDigitos) {
    for (int i = 0; i < quitaDigitos; i++) {
      n = n/10;
    }
    return n;
  }
  public static int quitaPorDelante (int n, int quitaDigitos) {
    n = voltea(n);
    n = quitaPorDetras(n, quitaDigitos);
    n = voltea(n);
    return n;
  }
  public static int trozoDeNumero (int n, int inicial, int fin) {
    int numDigitos = digitos(n);
    n = quitaPorDetras(n, numDigitos-fin-1);
    n = quitaPorDelante(n, inicial);
    return n;
  }
  public static long juntaNumeros (int n1, int n2) {
    int numDigitos = digitos(n2);
    long num = potencia(10, numDigitos);
    return n1*num+n2;
  }
}

