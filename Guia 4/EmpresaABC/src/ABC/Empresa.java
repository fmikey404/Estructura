/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABC;

import javax.swing.JOptionPane;

/**
 *
 * @author Janus Gamer
 */
public class Empresa {

    static int rut[] = new int[100];
    static float sueldo[] = new float[100];
    static float gastos = 0;
    static boolean ordenado;

    public void crearRandom() {
        gastos = 0;
        for (int i = 0; i < 100; i++) {
            rut[i] = (int) ((Math.random() * 1000000000) + 28989898);
            sueldo[i] = (float) ((Math.random() * 9500000) + 800001);
        }
        JOptionPane.showMessageDialog(null, "100 Empleados creados correctamente", "Empleados creados", JOptionPane.PLAIN_MESSAGE);
        ordenado = false;
    }

    public void crearAMano() {
        gastos = 0;
        for (int i = 0; i < 100; i++) {
            rut[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el rut del empleado " + (1 + i), "Rut", JOptionPane.QUESTION_MESSAGE));
            sueldo[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el rut del empleado " + (1 + i), "Rut", JOptionPane.QUESTION_MESSAGE));
        }
        JOptionPane.showMessageDialog(null, "100 Empleados creados correctamente", "Empleados creados", JOptionPane.PLAIN_MESSAGE);
        ordenado = false;
    }

    public String mostrarEmpleados() {
        String salida = "";
        salida += "Lista de empleados:\n";
        for (int i = 0; i < 50; i++) {
            salida += "\n" + (1 + i) + ". Rut: " + rut[i] + ". Sueldo: $" + sueldo[i] + "     " + (50 + i) + ". Rut: " + rut[50 + i] + ". Sueldo: $" + sueldo[50 + i];
        }
        return salida;
    }

    public void ordenarEmpleados() {
        for (int i = 0; i < 99; i++) {
            int min = i;
            for (int j = i + 1; j < 100; j++) {
                if (sueldo[j] < sueldo[min]) {
                    min = j;
                }
            }
            float temp = sueldo[min];
            sueldo[min] = sueldo[i];
            sueldo[i] = temp;
            int temp2 = rut[min];
            rut[min] = rut[i];
            rut[i] = temp2;

        }
        ordenado = true;
        JOptionPane.showMessageDialog(null, "100 Empleados ordenados correctamente", "Empleados ordenados", JOptionPane.PLAIN_MESSAGE);
    }

    public String bonificaciones() {
        gastos = 0;
        if (ordenado) {
            String salida = "";
            salida += "Los empleados con sueldo más bajo son: \n";
            for (int i = 0; i < 30; i++) {
                salida += (1 + i) + ". Rut: " + rut[i] + ". Sueldo: $" + sueldo[i];
                gastos += sueldo[i] * 0.05;
                salida += ".  Bonificación: $" + sueldo[i] * 0.05 + "\n";
            }
            salida += "==============================\n";
            salida += "Total gastos en bonos: $" + gastos;
            return salida;
        } else {
            return "Los empleados deben estar ordenados";
        }
    }

}
