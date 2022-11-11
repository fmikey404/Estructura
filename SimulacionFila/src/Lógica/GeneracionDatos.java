package Lógica;

import java.util.ArrayList;
import java.util.HashMap;
public class GeneracionDatos {
    
    public static int clientesTotales = 0;
    public static int clientesAtendidos = 0;
    public static int clientesNoAtendidos = 0;
    public static int tiempoPromedio = 0;
    public static int tiempoMaximo = 0;
    public static double promedio = 0.0;
    public static double porcentajeClientesNoAtendidos = 0.0;

    public static void llenarDatos(HashMap infoTotal) {
        for (int i = 1; i <= 480; i++) {
            int cantClientes = (int) (Math.random() * 2) + 1;
            ArrayList relClienteServicio = new ArrayList();
            for (int j = 0; j < cantClientes; j++) {
                clientesTotales++;
                int servicioUtilizado = (int) ((Math.random() * 3));
                HashMap tiempoServicio = new HashMap();
                switch (servicioUtilizado) {
                    case 0: {
                        tiempoServicio.put(servicioUtilizado, 0);
                        clientesNoAtendidos++;
                        break;
                    }
                    case 1: {
                        int espera = (int) (Math.random() * 83) + 10;
                        tiempoPromedio += espera;
                        if (espera > tiempoMaximo){
                            tiempoMaximo = espera;
                        }
                        tiempoServicio.put(servicioUtilizado, espera);
                        clientesAtendidos++;
                        break;
                    }
                    case 2: {
                        int espera = (int) (Math.random() * 234) + 7;
                        tiempoPromedio += espera;
                        if (espera > tiempoMaximo){
                            tiempoMaximo = espera;
                        }
                        tiempoServicio.put(servicioUtilizado, espera);
                        clientesAtendidos++;
                        break;
                    }
                }
                relClienteServicio.add(tiempoServicio);
            }
            infoTotal.put(i, relClienteServicio);
        }
        promedio = tiempoPromedio(tiempoPromedio, clientesAtendidos);
        porcentajeClientesNoAtendidos = porcentajeNoAtendidos(clientesNoAtendidos, clientesTotales);
    }
    
    public static double tiempoPromedio(int tiemposTotales, int cantidad){
        return tiemposTotales/cantidad;
    }
    
    public static double porcentajeNoAtendidos (int noAtendidos, int total){
        return (noAtendidos*100)/total;
    }
    
    public static void imprimir(HashMap datos){
        for (int i = 1; i <= datos.size(); i++) {
            System.out.println(datos.get(i));
        }
        System.out.println("CLIENTES TOTALES: " + clientesTotales);
        System.out.println("CLIENTES ATENDIDOS: " + clientesAtendidos);
        System.out.println("CLIENTES NO ATENDIDOS: " + clientesNoAtendidos);
        System.out.println("TIEMPO PROMEDIO: " + promedio + " segundos");
        System.out.println("TIEMPO MÁXIMO: " + tiempoMaximo + " segundos");
    }
}
