/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Busetas;

import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author F.Ortiz
 */
public class Buseta {

    private ArrayList<ArrayList> ventas = new ArrayList<>();
    static Hashtable<Integer, String> dia = new Hashtable<Integer, String>();

    public Buseta() {
    }

    public ArrayList getVentas() {
        return ventas;
    }

    public void setVentas() {
        dia.put(0, "Lunes");
        dia.put(1, "Martes");
        dia.put(2, "Miércoles");
        dia.put(3, "Jueves");
        dia.put(4, "Viernes");
        dia.put(5, "Sábado");
        dia.put(6, "Domingo");
        ventas.add(new ArrayList<Float>());
        for (int i = (ventas.size()-1); i < ventas.size(); i++) {
            for (int j = 0; j < 7; j++) {
                ventas.get(i).add(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese las ventas del día " + dia.get(j), "Ingreso de ventas", JOptionPane.QUESTION_MESSAGE)));
            }
        }
        System.out.println("size array: " + ventas.size());
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println("bus " + i + " size : " + ventas.get(i).size());
        }
    }

    public String mostrarMaxSem() {
        float max;
        int maxI = -1;
        String salida = "";
        dia.put(0, "Lunes");
        dia.put(1, "Martes");
        dia.put(2, "Miércoles");
        dia.put(3, "Jueves");
        dia.put(4, "Viernes");
        dia.put(5, "Sábado");
        dia.put(6, "Domingo");
        for (int i = 0; i < ventas.size(); i++) {
            max = 0;
            for (int j = 0; j < ventas.get(i).size(); j++) {
                if (((float) ventas.get(i).get(j)) > max) {
                    max = (float) ventas.get(i).get(j);
                    maxI = j;
                }
            }
            salida += "\n El día de mayor ventas de la buseta " + (i + 1) + " es el día " + dia.get(maxI) + " con ventas de $" + ventas.get(i).get(maxI);
        }

        return salida;
    }
    
    public String mostrarBusMax(){
        float max=0, semana;
        int busI=0;
        for (int i = 0; i < ventas.size(); i++) {
            semana=0;
            for (int j = 0; j < ventas.get(i).size(); j++) {
                semana += (float)ventas.get(i).get(j);
            }
            if (semana > max) {
                max=semana;
                busI = i;
            }
        }
        return "La buseta que más ventas hizo en la semana fue la buseta "+(busI+1)+" con ventas de $"+max;
    }

    public String mostrarBusMin(){
        float min=999999999, semana;
        int busI=0;
        for (int i = 0; i < ventas.size(); i++) {
            semana=0;
            for (int j = 0; j < ventas.get(i).size(); j++) {
                semana += (float)ventas.get(i).get(j);
            }
            if (semana < min) {
                min=semana;
                busI = i;
            }
        }
        return "La buseta que menos ventas hizo en la semana fue la buseta "+(busI+1)+" con ventas de $"+min;
    }
    
    public String aumentar(){
        float suma=0, prom;
        String salida = "";
        for (int i = 0; i < ventas.get(0).size(); i++) {
            for (int j = 0; j < ventas.size(); j++) {
                suma += (float)ventas.get(j).get(i);
            }
            prom = suma/(float)ventas.size();
            for (int j = 0; j < ventas.size(); j++) {
                if ((float)ventas.get(j).get(i)<prom) {
                    ventas.get(j).set(i, ((float)(ventas.get(j).get(i))+(((float)ventas.get(j).get(i))*0.2)));
                    salida+="\nSe aumenta un 20% las ventas de la buseta "+(j+1)+" el día "+dia.get(i)+". Resultado: $"+ventas.get(j).get(i);
                }
            }
        }
        return salida;
    }
}
