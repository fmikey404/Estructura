/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alibu
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> TempMax = new ArrayList<Integer>();
        ArrayList<Integer> TempMin = new ArrayList<Integer>();
        
        int tempMax=0, tempMin=0, sumaMax=0, sumaMin=0;
        float promMax, promMin;
        
        //
        JOptionPane.showMessageDialog(null,"TEMPERATURA MAXIMA");
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
            switch (i) {
                case 0:
                    tempMax = Integer.parseInt(JOptionPane.showInputDialog("Lunes temperatura maxima"));
                    if (tempMax > 40 || tempMax < -40){
                        i--;
                        System.out.println(i);
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 1:
                    tempMax = Integer.parseInt(JOptionPane.showInputDialog("Martes temperatura maxima"));
                    if (tempMax > 40 || tempMax < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 2:
                    tempMax = Integer.parseInt(JOptionPane.showInputDialog("Miercoles temperatura maxima"));   
                    if (tempMax > 40 || tempMax < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 3:
                    tempMax = Integer.parseInt(JOptionPane.showInputDialog("Jueves temperatura maxima"));
                    if (tempMax > 40 || tempMax < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 4:
                    tempMax = Integer.parseInt(JOptionPane.showInputDialog("Viernes temperatura maxima"));
                    if (tempMax > 40 || tempMax < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 5:
                    tempMax = Integer.parseInt(JOptionPane.showInputDialog("Sabado temperatura maxima"));
                    if (tempMax > 40 || tempMax < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 6:
                    tempMax = Integer.parseInt(JOptionPane.showInputDialog("Domingo temperatura maxima"));
                    if (tempMax > 40 || tempMax < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                default: System.out.print("***El día no existe***");
            }
            TempMax.add(tempMax);
        }
        
        //
        JOptionPane.showMessageDialog(null,"TEMPERATURA MINIMA");
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    tempMin = Integer.parseInt(JOptionPane.showInputDialog("Lunes temperatura minima"));
                    if (tempMin > 40 || tempMin < -40){
                        i--;
                        System.out.println(i);
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 1:
                    tempMin = Integer.parseInt(JOptionPane.showInputDialog("Martes temperatura minima"));
                    if (tempMin > 40 || tempMin < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 2:
                    tempMin = Integer.parseInt(JOptionPane.showInputDialog("Miercoles temperatura minima"));   
                    if (tempMin > 40 || tempMin < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 3:
                    tempMin = Integer.parseInt(JOptionPane.showInputDialog("Jueves temperatura minima"));
                    if (tempMin > 40 || tempMin < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 4:
                    tempMin = Integer.parseInt(JOptionPane.showInputDialog("Viernes temperatura minima"));
                    if (tempMin > 40 || tempMin < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 5:
                    tempMin = Integer.parseInt(JOptionPane.showInputDialog("Sabado temperatura minima"));
                    if (tempMin > 40 || tempMax < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                case 6:
                    tempMin = Integer.parseInt(JOptionPane.showInputDialog("Domingo temperatura minima"));
                    if (tempMin > 40 || tempMin < -40){
                        i--;
                        JOptionPane.showMessageDialog(null, "La temperatura debe estar entre -40° y 40°");
                    }
                        break;
                default: System.out.print("***El día no existe***");
            }
            TempMin.add(tempMin);
        }
        
        
        
       JOptionPane.showMessageDialog(null,"TEMPERATURAS MAXIMAS ENTRE 15 Y 20");
        if (TempMax.contains(16) || TempMax.contains(17) || TempMax.contains(18) || TempMax.contains(19)){
            for (int i = 0; i < 7; i++) {
                if (TempMax.get(i)>15 && TempMax.get(i)<20) {
                    switch (i) {
                        case 0 -> JOptionPane.showMessageDialog(null,"Lunes temperatura maxima: "+TempMax.get(i));
                        case 1 -> JOptionPane.showMessageDialog(null,"Martes temperatura maxima: "+TempMax.get(i));
                        case 2 -> JOptionPane.showMessageDialog(null,"Miercoles temperatura maxima: "+TempMax.get(i));   
                        case 3 -> JOptionPane.showMessageDialog(null,"Jueves temperatura maxima: "+TempMax.get(i));
                        case 4 -> JOptionPane.showMessageDialog(null,"Viernes temperatura maxima: "+TempMax.get(i));
                        case 5 -> JOptionPane.showMessageDialog(null,"Sabado temperatura maxima: "+TempMax.get(i));
                        case 6 -> JOptionPane.showMessageDialog(null,"Domingo temperatura maxima: "+TempMax.get(i));
                        default -> System.out.print("***El día no existe***");
                    }
                }
            }
       } else{
           JOptionPane.showMessageDialog(null, "No se registraron temperaturas entre 15° y 20°");
       }
        
        JOptionPane.showMessageDialog(null,"TEMPERATURAS MINIMAS MENORES A 0");
        int[] aux = new int[7];
        for (int n = 0; n < TempMin.size(); n++){
            if (TempMin.get(n) < 0){
                aux[n] = TempMin.get(n);
            }
        }
        for (int i = 0; i < 7; i++) {
            if (aux[i]<0) {
                switch (i) {
                    case 0 -> JOptionPane.showMessageDialog(null,"Lunes temperatura minima: "+aux[i]);
                    case 1 -> JOptionPane.showMessageDialog(null,"Martes temperatura minima: "+aux[i]);
                    case 2 -> JOptionPane.showMessageDialog(null,"Miercoles temperatura minima: "+aux[i]);   
                    case 3 -> JOptionPane.showMessageDialog(null,"Jueves temperatura minima: "+aux[i]);
                    case 4 -> JOptionPane.showMessageDialog(null,"Viernes temperatura minima: "+aux[i]);
                    case 5 -> JOptionPane.showMessageDialog(null,"Sabado temperatura minima: "+aux[i]);
                    case 6 -> JOptionPane.showMessageDialog(null,"Domingo temperatura minima: "+aux[i]);
                    default -> System.out.print("***El día no existe***");
                }
            }
        }
        
        //
        JOptionPane.showMessageDialog(null,"PROMEDIO TEMPERATURAS MAXIMAS");
        for (int i = 0; i < 7; i++) {
            sumaMax+=TempMax.get(i);
        }
        promMax=sumaMax/7;
        JOptionPane.showMessageDialog(null,"Promedio temperaturas maximas: "+promMax);
        
        //
        JOptionPane.showMessageDialog(null,"PROMEDIO TEMPERATURAS MINIMAS");
        for (int i = 0; i < 7; i++) {
            sumaMin+=TempMin.get(i);
        }
        promMin=sumaMin/7;
        JOptionPane.showMessageDialog(null,"Promedio temperaturas maximas: "+promMin);
        
        //
        JOptionPane.showMessageDialog(null,"TEMPERATURAS MAXIMAS Y MINIMAS");
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0 -> JOptionPane.showMessageDialog(null,"Lunes temperatura maxima: "+TempMax.get(i)+"\nLunes temperatura minima: "+TempMin.get(i));
                case 1 -> JOptionPane.showMessageDialog(null,"Martes temperatura maxima: "+TempMax.get(i)+"\nMartes temperatura minima: "+TempMin.get(i));
                case 2 -> JOptionPane.showMessageDialog(null,"Miercoles temperatura maxima: "+TempMax.get(i)+"\nMiercoles temperatura minima: "+TempMin.get(i));   
                case 3 -> JOptionPane.showMessageDialog(null,"Jueves temperatura maxima: "+TempMax.get(i)+"\nJueves temperatura minima: "+TempMin.get(i));
                case 4 -> JOptionPane.showMessageDialog(null,"Viernes temperatura maxima: "+TempMax.get(i)+"\nViernes temperatura minima: "+TempMin.get(i));
                case 5 -> JOptionPane.showMessageDialog(null,"Sabado temperatura maxima: "+TempMax.get(i)+"\nSabado temperatura minima: "+TempMin.get(i));
                case 6 -> JOptionPane.showMessageDialog(null,"Domingo temperatura maxima: "+TempMax.get(i)+"\nDomingo temperatura minima: "+TempMin.get(i));
                default -> System.out.print("***El día no existe***");
            }
        }
        
        
    }
}
