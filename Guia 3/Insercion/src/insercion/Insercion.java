package insercion;

import java.util.Arrays;

public class Insercion {

    static int cantNumeros= 10000000;

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] array = new int[cantNumeros];
        for (int i = 0; i<cantNumeros; i++){
            array[i] = (int) ((Math.random() * 100)+1);
        }
        System.out.println("Array Desordenado\n=================");
        System.out.println(Arrays.toString(array));
        insercion(array);
        System.out.println("\nArray Ordenado\n=================");
        System.out.println(Arrays.toString(array));
        System.out.println("\nTiempo de ejecución = " + (System.nanoTime()-startTime)/1e6 + "ms");
    }

    public static void insercion(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++){
            int aux = arreglo[i];
            int j = i - 1;
            while ((j >= 0) && (aux < arreglo[j])){
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
    }
}
