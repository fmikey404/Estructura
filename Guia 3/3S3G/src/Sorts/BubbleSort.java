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
public class BubbleSort {

    public static void main(String[] args) {
        long time;
        int lista[];
        int cantNums;
        int temp;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números en el arreglo");
        cantNums = leer.nextInt();
        lista = new int[cantNums];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) ((Math.random() * 100) + 1);
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        time = System.nanoTime();
        System.out.println("Orden:");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Tiempo de ejecución en ms: " + ((System.nanoTime() - time)/1E+6));
    }
}
