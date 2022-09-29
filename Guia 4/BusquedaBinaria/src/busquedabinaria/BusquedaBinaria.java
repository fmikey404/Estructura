/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alibu
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        Scanner leer = new Scanner(System.in);
        int nArreglo=0, nBuscar=0, nRandom;

        System.out.print("Ingrese el tamano del arreglo: ");
        nArreglo = leer.nextInt();
        
        if (nArreglo<=100) {
            nRandom = 100;
        }
        else{
            nRandom = nArreglo;
        }
        
        int [] Arreglo = new int[nArreglo];
        for (int i = 0; i < nArreglo; i++) {
            Arreglo[i] = (int) ((Math.random() * nRandom) + 1);
        }
        System.out.println("====================================");
        System.out.println("            Arreglo");
        System.out.println("------------------------------------");
        for (int i = 0; i < nArreglo; i++) {
            System.out.println(" " + Arreglo[i]);
        }
        System.out.println("====================================");
        shell(Arreglo);
        System.out.println("        Arreglo Ordenado");
        System.out.println("------------------------------------");
        System.out.println(Arrays.toString(Arreglo));
        System.out.println("====================================");
        System.out.println("        Busqueda bianria");
        System.out.println("------------------------------------");
        System.out.print("Numero a buscar: ");
        nBuscar = leer.nextInt();
        System.out.println("------------------------------------");
        //
        int  inf=0, centro=0 , sup=nArreglo-1;
        
        while (inf<=sup) {
            centro = (sup+inf)/2;
            if (Arreglo[centro]==nBuscar) {
                System.out.println("El numero esta en la posicion "+centro+" del arreglo");
                break;
            } else if (nBuscar < Arreglo[centro]) {
                sup = centro-1;
            } else{
                inf = centro+1;
            }
        }
        System.out.println("====================================");
        System.out.println("       Tiempo de ejecucin");
        System.out.println("------------------------------------");
        System.out.println("Tiempo de ejecucion: " + (System.nanoTime()-startTime)/1e6 + " ms");
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
