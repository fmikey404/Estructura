/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Practica
 */
public class Usuario {

    public static float contador = 0.0f;
    public static String nombre;
    public static int id = 0;
    public static boolean[] rtas = new boolean[10];
    static ArrayList<Integer> posicionesErradas = new ArrayList<>();
    public static String malas;

    public static void asignarDatos(String name, int cod) {
        nombre = name;
        id = cod;
        Arrays.fill(rtas, false);
    }

    public static void sumar() {
        for (int i = 0; i < rtas.length; i++) {
            if (rtas[i]) {
                contador = contador + 0.5f;
            }
        }
    }

    public static void calcularMal() {
        for (int i = 0; i < rtas.length; i++) {
            if (rtas[i] == false) {
                posicionesErradas.add(i);
            }
        }
        if (posicionesErradas == null || posicionesErradas.size() == 0) {
            malas = "NO TUVISTE NINGUNA MAL";
        } else {
            malas = "Tuviste mal las preguntas: ";
            for (int i = 0; i < posicionesErradas.size(); i++) {
                malas = malas + (posicionesErradas.get(i) + 1) + ". ";
            }
        }
    }
}
