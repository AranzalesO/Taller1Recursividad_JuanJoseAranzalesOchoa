/*
     Punto 2:
     Para un arreglo de N posiciones de datos reales, determinar si un dato determinado existe.
*/
package Desarrollo;

import java.util.Scanner;
public class RecursividadPunto2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al punto #2 del taller, por favor ingrese el tamaño que desea para este array:");
        int length = teclado.nextInt();
        float[] array = new float[length];
        System.out.println("\n");

        for(int i = 0; i < array.length; i++) {
            // Imprimimos los elementos aleatorios del array en pantalla.
            array[i] = (float) (Math.random());
            System.out.println(array[i]);
        }

        Scanner elemento = new Scanner(System.in);
        System.out.print("Del arreglo creado por usted, ¿Qué elemento le gustaría comprobar que existe?:");
        float comprobarElemento = elemento.nextInt();
        System.out.println("\n");

        float encontrarValor = encontrar_valor(array, comprobarElemento, 0);
        System.out.println("--> Elemento existente en el arreglo? (0.0 = No existe) (1.0 = Existe): " + encontrarValor);
    }

    /*
     * Solución explicada:
     * Recorrer el arreglo y retornar la posición del elemento si es que se encuentra en el array
     * */
    public static int encontrar_valor(float[] array, float comprobarElemento, int indice) {
        if(indice == array.length) {
            return 0;
        }
        if(array[indice] == comprobarElemento) {
            return 1;
        } else {
            return encontrar_valor(array, comprobarElemento, indice+1);
        }
    }
}
