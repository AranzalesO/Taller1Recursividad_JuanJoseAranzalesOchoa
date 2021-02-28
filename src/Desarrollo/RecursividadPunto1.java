/*
    Punto 1:
    Para un arreglo de N posiciones de datos enteros, devolver el valor menor en el arreglo.
*/
package Desarrollo;

import java.util.Scanner;

public class RecursividadPunto1 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño que desea para este array:");
        System.out.println("\n");
        int length = teclado.nextInt();
        int array [] = new int[length];

        for(int i = 0; i < array.length; i++) {
            // Imprimimos los elementos del array en pantalla.
            System.out.print("Bienvenido al punto #1 del taller, por favor ingrese el número "+ i + ": ");
            array[i] = teclado.nextInt();
        }

        System.out.println("--> El valor menor del arreglo es: " + menor_valor(array,0, array[0]));
    }

    /*
     * - Explicación solución:
     * Leer y recorrer el array desde el índice que va a ser 0 hasta llegar a la longitud total n del array;
     * sin embargo cada vez que el índice en el array por el que va aumentando sea distinto a su longitud,
     * vamos a usar directamente la recursividad para retormar el valor menor que vamos a definir desde el
     * array en la posición 0 para ir comparándolo con el valor siguiente en los condicionales, es decir que cuando la recursividad pare
     * lo hará cuando el array esté leído, porque definimos como parámetro a (int menor), para asignar el valor menor en el array
     * en esa variable y así, si en el recorrido no se ha encontrado el valor menor, se siga comparando el valor actual con el siguiente
     * */
    public static int menor_valor(int[] array, int indice, int menor) {
        if(indice != array.length) {
            if(array[indice] < menor) {
                menor = menor_valor(array, indice + 1, array[indice]);
            } else {
                menor = menor_valor(array, indice + 1, menor);
            }
        }
        return menor;
    }
}
