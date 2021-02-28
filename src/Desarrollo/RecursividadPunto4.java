/*
     Punto 4:
     Para un valor N real y un M entero positivo mayor que cero, calcular N^M.
*/
package Desarrollo;
import  java.util.Scanner;

public class RecursividadPunto4 {
    public static void main(String[] args) {
        // Solicitamos los números a operar
        Scanner nNumeroTecleado = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" *Bienvenido al punto #4 del taller, por favor ingresa la base para realizar la potencia:*");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int numeroN = nNumeroTecleado.nextInt();
        System.out.println("\n");

        Scanner mNumeroTecleado = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" *Bienvenido al punto #4 del taller, por favor ingresa el número a ser elevado:*");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int numeroM = mNumeroTecleado.nextInt();
        System.out.println("\n");

        System.out.println(numeroN +" ^ "+numeroM+" = "+ potencia(numeroN , numeroM));
    }

    /*
    * SOLUCIÓN:
    * Este ejercicio es de cierta forma parecido al factorial recursivo, puesto que le pasamos a la función la base y el exponente como parámetros,
    * luego simplemente multiplicamos la base por el exponente cada vez más reducido hasta que llegue a dar 1 que es cuando se va a multiplicar
    * con la base dándonos un mismo número igual a la base que se va a operar cuantas veces sea el número exponente, pues lo acumulamos cada vez
    * que lo llamamos recursivamente.
    * */
    public static int potencia(int n, int m) {
        if (m == 0) {
            return 1;
        }
        else {
            return n * potencia(n, m - 1);
        }
    }
}
