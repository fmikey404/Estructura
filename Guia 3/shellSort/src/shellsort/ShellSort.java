package shellsort;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
    static int cantNumeros= 1000000;

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] array = new int[cantNumeros];
        for (int i = 0; i<cantNumeros; i++){
            array[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println("Array Desordenado\n=================");
        System.out.println(Arrays.toString(array));
        shell(array);
        System.out.println("\nArray Ordenado\n=================");
        System.out.println(Arrays.toString(array));
        System.out.println("\nTiempo de ejecución = " + (System.nanoTime()-startTime)/1e6 + "ms");
    }

    public static void shell(int[] arreglo) {
        for (int salto = arreglo.length / 2; salto != 0; salto /= 2) {
            boolean cambios = true;
            while (cambios) {
                cambios = false;
                for (int i = salto; i < arreglo.length; i++) {
                    if (arreglo[i - salto] > arreglo[i]) {
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }
}
