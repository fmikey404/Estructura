/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorts;

import java.util.Scanner;

/**
 *
 * @author Practica
 */
public class Quicksort {

    public static void main(String[] args) {
        long time;
        int lista[];
        int cantNums;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números en el arreglo");
        cantNums = leer.nextInt();
        lista = new int[cantNums];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * 100) + 1);
        }
        time = System.nanoTime();
        System.out.println("Orden:");
        quickSort(lista, 0, lista.length-1);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Tiempo de ejecución en ms: " + ((System.nanoTime() - time)/1E+6));

    }

    public static void quickSort(int arr[], int inicio, int fin) {
        if (inicio < fin) {
            int partitionIndex = partition(arr, inicio, fin);

            quickSort(arr, inicio, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, fin);
        }
    }

    private static int partition(int arr[], int inicio, int fin) {
        int pivote = arr[fin];
        int i = (inicio - 1);

        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }
}
