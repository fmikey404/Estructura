package guia1;

import java.util.Hashtable;
import java.util.Scanner;

public class Ventas {

    static Scanner leer = new Scanner(System.in);
    static float ventas[][] = new float[7][6];
    static int sel;
    static Hashtable<Integer, String> dia = new Hashtable<Integer, String>();
    static Hashtable<Integer, String> sede = new Hashtable<Integer, String>();
    static float prom = 0;

    public static void menu() {
        sel = 0;
        System.out.println("===================");
        System.out.println("Bienvenido");
        System.out.println("1. Registrar ventas totales");
        System.out.println("2. Mostrar ventas");
        System.out.println("3. Aumentar ventas");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opción");
    }

    public static void sede() {
        sel = 0;
        System.out.println("===================");
        System.out.println("Seleccione sede");
        System.out.println("1. Santa Fe");
        System.out.println("2. Suba");
        System.out.println("3. Usaquén");
        System.out.println("4. Chapinero");
        System.out.println("5. Fontibón");
        System.out.println("6. Kennedy");
        System.out.println("7. Todas las sedes");
    }

    public static void sede2() {
        sel = 0;
        System.out.println("===================");
        System.out.println("Seleccione sede");
        System.out.println("1. Santa Fe");
        System.out.println("2. Suba");
        System.out.println("3. Usaquén");
        System.out.println("4. Chapinero");
        System.out.println("5. Fontibón");
        System.out.println("6. Kennedy");

    }

    public static void registrar() {
        do {
            sede();
            sel = leer.nextInt();
            if (sel > 7 || sel < 1) {
                System.out.println("Error en la digitación, Ingrese nuevamente la opción.");
            }
        } while (sel > 7 || sel < 1);
        switch (sel) {
            case 1:
                for (int i = 0; i <= 6; i++) {
                    System.out.println("Ingrese el total de ventas del día " + dia.get(i));
                    do {
                        ventas[i][0] = leer.nextInt();
                        if (ventas[i][0] < 0) {
                            System.out.println("El valor no puede ser negativo. Intente nuevamente.");
                        }
                    } while (ventas[i][0] < 0);
                }
                break;
            case 2:
                for (int i = 0; i <= 6; i++) {
                    System.out.println("Ingrese el total de ventas del día " + dia.get(i));
                    do {
                        ventas[i][1] = leer.nextInt();
                        if (ventas[i][1] < 0) {
                            System.out.println("El valor no puede ser negativo. Intente nuevamente.");
                        }
                    } while (ventas[i][1] < 0);
                }
                break;
            case 3:
                for (int i = 0; i <= 6; i++) {
                    System.out.println("Ingrese el total de ventas del día " + dia.get(i));
                    do {
                        ventas[i][2] = leer.nextInt();
                        if (ventas[i][2] < 0) {
                            System.out.println("El valor no puede ser negativo. Intente nuevamente.");
                        }
                    } while (ventas[i][2] < 0);
                }
                break;
            case 4:
                for (int i = 0; i <= 6; i++) {
                    System.out.println("Ingrese el total de ventas del día " + dia.get(i));
                    do {
                        ventas[i][3] = leer.nextInt();
                        if (ventas[i][3] < 0) {
                            System.out.println("El valor no puede ser negativo. Intente nuevamente.");
                        }
                    } while (ventas[i][3] < 0);
                }
                break;
            case 5:
                for (int i = 0; i <= 6; i++) {
                    System.out.println("Ingrese el total de ventas del día " + dia.get(i));
                    do {
                        ventas[i][4] = leer.nextInt();
                        if (ventas[i][4] < 0) {
                            System.out.println("El valor no puede ser negativo. Intente nuevamente.");
                        }
                    } while (ventas[i][4] < 0);
                }
                break;
            case 6:
                for (int i = 0; i <= 6; i++) {
                    System.out.println("Ingrese el total de ventas del día " + dia.get(i));
                    do {
                        ventas[i][5] = leer.nextInt();
                        if (ventas[i][5] < 0) {
                            System.out.println("El valor no puede ser negativo. Intente nuevamente.");
                        }
                    } while (ventas[i][5] < 0);
                }
                break;
            case 7:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 6; j++) {
                        System.out.println("Ingrese el total de ventas de la sede " + sede.get(i) + " del día " + dia.get(j));
                        do {
                            ventas[j][i] = leer.nextInt();
                            if (ventas[j][i] < 0) {
                                System.out.println("El valor no puede ser negativo. Intente nuevamente.");
                            }
                        } while (ventas[j][i] < 0);
                    }
                }
                break;
        }
        sel = 0;
    }

    public static void mostrar() {

        do {
            sede();
            sel = leer.nextInt();
            if (sel > 7 || sel < 1) {
                System.out.println("Error en la digitación, Ingrese nuevamente la opción.");
            }
        } while (sel > 7 || sel < 1);
        switch (sel) {
            case 1:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][0];
                }
                prom /= 7;
                System.out.println("El promedio de ventas de la sede " + sede.get(0) + " es de " + prom);
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][0] > prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas mayores al promedio de la semana: " + ventas[i][0]);
                    }
                }
                break;
            case 2:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][1];
                }
                prom /= 7;
                System.out.println("El promedio de ventas de la sede " + sede.get(1) + " es de " + prom);
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][1] > prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas mayores al promedio de la semana: " + ventas[i][1]);
                    }
                }
                break;
            case 3:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][2];
                }
                prom /= 7;
                System.out.println("El promedio de ventas de la sede " + sede.get(2) + " es de " + prom);
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][2] > prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas mayores al promedio de la semana: " + ventas[i][2]);
                    }
                }
                break;
            case 4:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][3];
                }
                prom /= 7;
                System.out.println("El promedio de ventas de la sede " + sede.get(3) + " es de " + prom);
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][3] > prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas mayores al promedio de la semana: " + ventas[i][3]);
                    }
                }
                break;
            case 5:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][4];
                }
                prom /= 7;
                System.out.println("El promedio de ventas de la sede " + sede.get(4) + " es de " + prom);
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][4] > prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas mayores al promedio de la semana: " + ventas[i][4]);
                    }
                }
                break;
            case 6:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][5];
                }
                prom /= 7;
                System.out.println("El promedio de ventas de la sede " + sede.get(5) + " es de " + prom);
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][5] > prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas mayores al promedio de la semana: " + ventas[i][5]);
                    }
                }
                break;
            case 7:
                prom = 0;
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 6; j++) {
                        if (ventas[j][i] != 0) {
                            prom += ventas[j][i];

                        }
                    }
                }
                prom /= 7;
                System.out.println("El promedio de ventas en toda la empresa es de " + prom);
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][0] + ventas[i][1] + ventas[i][2] + ventas[i][3] + ventas[i][4] + ventas[i][5] > prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas mayores al promedio de la semana: " + (ventas[i][0] + ventas[i][1] + ventas[i][2] + ventas[i][3] + ventas[i][4] + ventas[i][5]));
                    }
                }
                break;

        }
        sel = 0;
    }

    public static void aumentar() {
        do {
            sede2();
            sel = leer.nextInt();
            if (sel > 6 || sel < 1) {
                System.out.println("Error en la digitación, Ingrese nuevamente la opción.");
            }
        } while (sel > 6 || sel < 1);
        switch (sel) {
            case 1:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][0];
                }
                prom /= 7;
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][0] < prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas menores al promedio. Se aumenta un 15%.");
                        ventas[i][0] += ventas[i][0] * 0.15;
                        System.out.println("Nuevas ventas: " + ventas[i][0]);
                    }
                }
                break;
            case 2:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][0];
                }
                prom /= 7;
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][1] < prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas menores al promedio. Se aumenta un 15%.");
                        ventas[i][1] += ventas[i][1] * 0.15;
                        System.out.println("Nuevas ventas: " + ventas[i][1]);
                    }
                }
                break;
            case 3:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][2];
                }
                prom /= 7;
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][2] < prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas menores al promedio. Se aumenta un 15%.");
                        ventas[i][2] += ventas[i][2] * 0.15;
                        System.out.println("Nuevas ventas: " + ventas[i][2]);
                    }
                }
                break;
            case 4:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][3];
                }
                prom /= 7;
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][3] < prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas menores al promedio. Se aumenta un 15%.");
                        ventas[i][3] += ventas[i][3] * 0.15;
                        System.out.println("Nuevas ventas: " + ventas[i][3]);
                    }
                }
                break;
            case 5:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][4];
                }
                prom /= 7;
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][4] < prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas menores al promedio. Se aumenta un 15%.");
                        ventas[i][4] += ventas[i][4] * 0.15;
                        System.out.println("Nuevas ventas: " + ventas[i][4]);
                    }
                }
                break;
            case 6:
                prom = 0;
                for (int i = 0; i <= 6; i++) {
                    prom += ventas[i][5];
                }
                prom /= 7;
                for (int i = 0; i <= 6; i++) {
                    if (ventas[i][5] < prom) {
                        System.out.println("El día " + dia.get(i) + " hubo ventas menores al promedio. Se aumenta un 15%.");
                        ventas[i][5] += ventas[i][5] * 0.15;
                        System.out.println("Nuevas ventas: " + ventas[i][5]);
                    }
                }
                break;

        }
        sel = 0;
    }

    public static void hashes() {
        dia.put(0, "Lunes");
        dia.put(1, "Martes");
        dia.put(2, "Miércoles");
        dia.put(3, "Jueves");
        dia.put(4, "Viernes");
        dia.put(5, "Sábado");
        dia.put(6, "Domingo");
        sede.put(0, "Santa Fe");
        sede.put(1, "Suba");
        sede.put(2, "Usaquén");
        sede.put(3, "Chapinero");
        sede.put(4, "Fontibón");
        sede.put(5, "Kennedy");
    }

    public static void main(String[] args) {
        hashes();
        do {
            menu();
            do {
                sel = leer.nextInt();
                if (sel > 4 || sel < 1) {
                    System.out.println("Error en la digitación, Ingrese nuevamente la opción.");
                }
            } while (sel > 4 || sel < 1);
            switch (sel) {
                case 1:
                    registrar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    aumentar();

            }
        } while (sel != 4);
        System.out.println("=====================");
        System.out.println("Hasta luego.");
    }
}