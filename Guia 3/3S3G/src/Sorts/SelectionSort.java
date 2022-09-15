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
public class SelectionSort {

    public static void main(String[] args) {
        long time;
        int lista[];
        int cantNums;
        int temp, min;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números en el arreglo");
        cantNums = leer.nextInt();
        lista = new int[cantNums];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * 100) + 1);
        }
        time = System.nanoTime();
        System.out.println("Orden:");
        for (int i = 0; i < lista.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[min]) {
                    min = j;
                }
            }
            temp = lista[i];
            lista[i] = lista[min];
            lista[min] = temp;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Tiempo de ejecución en ms: " + ((System.nanoTime() - time)/1E+6));
        
    }
}
