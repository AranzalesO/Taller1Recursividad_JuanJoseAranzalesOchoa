/*
     Punto 3:
     Mostrar N números de la secuencia Tribonacci[1].
*/
package Desarrollo;
import  java.util.Scanner;

public class RecursividadPunto3 {
    public static void main(String[] args) {
        // Solicitamos la cantidad de elementos de la secuencia a mostrar
        Scanner elementoTecleado = new Scanner(System.in);
        System.out.println("***********************************************************************************************************************");
        System.out.println("**Bienvenido al punto #3 del taller, por favor ingresa el número de elementos de la secuencia de Tribonacci a mostrar:*");
        System.out.println("***********************************************************************************************************************");
        int elementos = elementoTecleado.nextInt();
        System.out.println("\n");

        for(int i=1; i<=elementos; i++){
            System.out.println(funcionTribonacci(i));   // Por cada elemento que haya pedido el usuario invocamos la función desde esta clase
            // Por cada vez que nuestro índice llegue a esta posición par, va a dejar un espaciado para dar a entender mejor el funcionamiento de la secuencia
            if(i%4==0){
                System.out.println("\n");
            }
        }
    }

    /*
    * SOLUCIÓN:
    * Como vamos a imprimir 2 veces el mismo elemento y a partir de que esta función recibe un índice por el que se itera,
    * hacemos un condicional en el que si el índice es igual a los 3 primeros números del ciclo nos retorne un 0 y
    * cuando el índice llegue a 3 nos retorne un 1 por el que se podamos empezar a sumar, entonces como el índice va a seguir aumentando
    * sumamos sucesivamente los 3 números anteriores al índice en el que nos encontramos en forma descendente para que los retorne uno por uno
    * y los vaya sumando entre sí.
    * */
    private static int funcionTribonacci(int num){
        if(num == 0 || num == 1 || num == 2){
            return 0;
        }
        if (num == 3) {
            return 1;
        } else {
            return funcionTribonacci(num-1) + funcionTribonacci(num-2) + funcionTribonacci(num-3);
        }
    }
}

