package guia1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vehiculo {

    static int nMarcas;
    static int anioEscoger;
    static ArrayList<String> marcas = new ArrayList<>();
    static ArrayList<Integer> anios = new ArrayList<>();
    static ArrayList<Long> precios2018 = new ArrayList<>();
    static ArrayList<Long> precios2019 = new ArrayList<>();
    static ArrayList<Long> precios2020 = new ArrayList<>();
    static ArrayList<Long> precios2021 = new ArrayList<>();
    static ArrayList<Long> precios2022 = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);
    static Scanner leerS = new Scanner(System.in);

    public static void main(String[] args) {

        //
        for (int a = 2018; a <= 2022; a++){
            anios.add(a);
        }
        System.out.println(" REGISTRO VEHICULAR DE MARCAS Y PRECIOS");
        System.out.println("========================================");
        System.out.print("Cuantas marcas desea registrar: ");
        nMarcas = leer.nextInt();

        System.out.println("----------------------------------------");
        System.out.println("         NOMBRES DE LAS MARCAS");
        System.out.println("========================================");
        for (int i = 0; i < nMarcas; i++) {
            System.out.print("Digite la marca " + (i+1) + ": ");
            marcas.add(leerS.nextLine());
        }
        System.out.println("----------------------------------------");
        System.out.println("      PRECIO EN LOS ULTIMOS 5 AÑOS");
        System.out.println("========================================");
        long auxLong;
        System.out.println("***************************\n\t\t\t\t\t" +
                "2018\n***************************");
        for (int p = 0; p < nMarcas; p++) {
            System.out.print("Digite el precio de la marca " + marcas.get(p) + " en el año 2018: ");
            auxLong = leerS.nextLong();
            if (validarNumero(auxLong)) {
                System.out.println("No se pueden ingresar valores negativos o ceros");
                p--;
            }else{
                precios2018.add(auxLong);
            }
        }
        System.out.println("***************************\n\t\t\t\t\t" +
                "2019\n***************************");
        for (int p = 0; p < nMarcas; p++) {
            System.out.print("Digite el precio de la marca " + marcas.get(p) + " en el año 2019: ");
            auxLong = leerS.nextLong();
            if (validarNumero(auxLong)) {
                System.out.println("No se pueden ingresar valores negativos o ceros");
                p--;
            }else{
                precios2019.add(auxLong);
            }
        }
        System.out.println("***************************\n\t\t\t\t\t" +
                "2020\n***************************");
        for (int p = 0; p < nMarcas; p++) {
            System.out.print("Digite el precio de la marca " + marcas.get(p) + " en el año 2020: ");
            auxLong = leerS.nextLong();
            if (validarNumero(auxLong)) {
                System.out.println("No se pueden ingresar valores negativos o ceros");
                p--;
            }else{
                precios2020.add(auxLong);
            }
        }
        System.out.println("***************************\n\t\t\t\t\t" +
                "2021\n***************************");
        for (int p = 0; p < nMarcas; p++) {
            System.out.print("Digite el precio de la marca " + marcas.get(p) + " en el año 2021: ");
            auxLong = leerS.nextLong();
            if (validarNumero(auxLong)) {
                System.out.println("No se pueden ingresar valores negativos o ceros");
                p--;
            }else{
                precios2021.add(auxLong);
            }
        }
        System.out.println("***************************\n\t\t\t\t\t" +
                "2022\n***************************");
        for (int p = 0; p < nMarcas; p++) {
            System.out.print("Digite el precio de la marca " + marcas.get(p) + " en el año 2022: ");
            auxLong = leerS.nextLong();
            if (validarNumero(auxLong)) {
                System.out.println("No se pueden ingresar valores negativos o ceros");
                p--;
            }else{
                precios2022.add(auxLong);
            }
        }
        System.out.println("¿De qué año entre 2018 y 2022 deseas " +
                "ver el promedio del valor de los vehículos?");
        anioEscoger = leer.nextInt();
        System.out.println(lista());
        System.out.println(barato());
        System.out.println("En el año 2018 el promedio de los vehículos " +
                "entre $30'000.000 y $50'000.000 fue: $" + prom(anioEscoger));
    }

    public static String lista(){
        StringBuilder listaPrecios = new StringBuilder("=======================================\n"
                + "LISTA DE PRECIOS POR AÑO DE CADA MARCA" +
                "\n=======================================\n");
        for (int l = 0; l < nMarcas; l++) {
            listaPrecios.append(marcas.get(l)).append("\n");
            for (int a = 0; a < 5; a++) {
                listaPrecios.append(anios.get(a)).append(" -> $");
                switch (anios.get(a)){
                    case 2018:
                        listaPrecios.append(precios2018.get(l)).append("\n");
                        break;
                    case 2019:
                        listaPrecios.append(precios2019.get(l)).append("\n");
                        break;
                    case 2020:
                        listaPrecios.append(precios2020.get(l)).append("\n");
                        break;
                    case 2021:
                        listaPrecios.append(precios2021.get(l)).append("\n");
                        break;
                    case 2022:
                        listaPrecios.append(precios2022.get(l)).append("\n");
                        break;
                }
            }
        }
        return listaPrecios.toString();
    }

    public static String barato(){
        StringBuilder cheap = new StringBuilder("==================================\n"
                + "AUTO MÁS ECONÓMICO DE CADA AÑO" +
                "\n==================================\n");
        for (int a=2018; a<=2022; a++ ){
            cheap = new StringBuilder(cheap + "El auto más económico en "+ a + " fue el ");
            switch (a){
                case 2018:
                    cheap = new StringBuilder(cheap + marcas.get(
                            precios2018.indexOf(Collections.min(precios2018)))
                            + " con un precio de: $" + Collections.min(precios2018) + "\n");
                    break;
                case 2019:
                    cheap = new StringBuilder(cheap + marcas.get(
                            precios2019.indexOf(Collections.min(precios2019)))
                            + " con un precio de: $" + Collections.min(precios2019) + "\n");
                    break;
                case 2020:
                    cheap = new StringBuilder(cheap + marcas.get(
                            precios2020.indexOf(Collections.min(precios2020)))
                            + " con un precio de: $" + Collections.min(precios2020) + "\n");
                    break;
                case 2021:
                    cheap = new StringBuilder(cheap + marcas.get(
                            precios2021.indexOf(Collections.min(precios2021)))
                            + " con un precio de: $" + Collections.min(precios2021) + "\n");
                    break;
                case 2022:
                    cheap = new StringBuilder(cheap + marcas.get(
                            precios2022.indexOf(Collections.min(precios2022)))
                            + " con un precio de: $" + Collections.min(precios2022) + "\n");
                    break;
            }
        }
        return cheap.toString();
    }

    public static long prom(int select){
        long promedio = 0;
        ArrayList<Long> auxiliar = new ArrayList<>();
        switch (select){
            case 2018:
                for (int v = 0; v < precios2018.size(); v++){
                    if (precios2018.get(v) <= 50000000 && precios2018.get(v) >= 30000000){
                        auxiliar.add(precios2018.get(v));
                    }
                }
                break;
            case 2019:
                for (int v = 0; v < precios2019.size(); v++){
                    if (precios2019.get(v) <= 50000000 && precios2019.get(v) >= 30000000){
                        auxiliar.add(precios2019.get(v));
                    }
                }
                break;
            case 2020:
                for (int v = 0; v < precios2020.size(); v++){
                    if (precios2020.get(v) <= 50000000 && precios2020.get(v) >= 30000000){
                        auxiliar.add(precios2020.get(v));
                    }
                }
                break;
            case 2021:
                for (int v = 0; v < precios2021.size(); v++){
                    if (precios2021.get(v) <= 50000000 && precios2021.get(v) >= 30000000){
                        auxiliar.add(precios2021.get(v));
                    }
                }
                break;
            case 2022:
                for (int v = 0; v < precios2022.size(); v++){
                    if (precios2022.get(v) <= 50000000 && precios2022.get(v) >= 30000000){
                        auxiliar.add(precios2022.get(v));
                    }
                }
                break;
        }
        for (int x = 0; x < auxiliar.size(); x++){
            promedio+=auxiliar.get(x);
        }
        promedio = promedio /auxiliar.size();
        return promedio;
    }
    public static boolean validarNumero(long num){
        return num <= 0;
    }
}