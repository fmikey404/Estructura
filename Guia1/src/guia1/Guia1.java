package guia1;

import java.util.ArrayList;

public class Guia1 {

    public static void main(String[] args) {
        ArrayList<Object> x = new ArrayList<>();

        /*FOR EN REVERSA DE 10 NUMEROS*/
        for (int i = 9; i >= 0; i--){
            x.add(i);
        }

        imprimirArreglo(x);
    }

    /*FUNCION PARA IMPRIMIR ARREGLOS*/
    private static void imprimirArreglo(ArrayList<Object> a) {
        System.out.println(a);
    }

}
