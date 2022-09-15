package presaberes;

import java.util.Arrays;
import java.util.Scanner;

public class arrayNombres {

    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String[] arreglo = new String[10];

        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Digite el " + (i+1) + " nombre del arreglo: ");
            arreglo[i] = leer.nextLine();
        }

        System.out.println("El arreglo resultante es: " + Arrays.toString(arreglo));
    }
}
