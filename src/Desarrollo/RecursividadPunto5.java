/*
     Punto 5:
     Determinar si una palabra es palíndroma.
*/
package Desarrollo;
import  java.util.Scanner;

public class RecursividadPunto5 {
    public static void main(String[] args) {
        // Solicitamos los números a operar
        Scanner palabraTecleada = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("    *Bienvenido al punto #5 del taller, por favor ingresa la palabra que quieres comprobar como palíndroma:*");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String palabra = palabraTecleada.nextLine();

        if (determinar_palindroma(palabra, 0, palabra.length() - 1) == palabra.length()) {
            System.out.println(palabra + " es un palídromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }

    /*
    * SOLUCIÓN:
    * La idea es separar la cadena a través del método: "charAT", con él contabilizamos cada uno de los carácteres de izquierda a derecha y de
    * derecha a izquierda, aumentando en uno para leer normalmente una palabra y decrementando la longitud de la cadena de derecha a izquierda.
    *
    * PD: Al principio la idea fue comparar que las letras del principio y del final fueran iguales; sin embargo, para palabras como dead sabemos
    * por definción que el palindromismo no se cumple; por lo que en lugar de comparar las letras del principio y del final decidí comparar la
    * variable izquierdaAderecha que es como leemos en occidente, con la longitud de la palabra normal puesto que las letras deben ser para el caso
    * menores al total de la cadena
    * */
    public static int determinar_palindroma(String palabra, int izquierdaAderecha, int derechaAizquierda) {
        if (izquierdaAderecha < palabra.length()) {
            if (palabra.charAt(izquierdaAderecha) == palabra.charAt(derechaAizquierda)) {
                return 1 + determinar_palindroma(palabra, izquierdaAderecha + 1, derechaAizquierda - 1);
            }
        }
        return 0;
    }
}
