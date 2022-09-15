package presaberes;

public class cambiarValoresVariables {

    public static void main (String[] args){
        int var1 = 6;
        int var2 = 200;

        System.out.println("La variable 1 es: " + var1 + " y la variable 2 es: " + var2 + " antes del cambio");

        int aux = var1;
        var1 = var2;
        var2 = aux;

        System.out.println("La variable 1 es: " + var1 + " y la variable 2 es: " + var2 + " después del cambio");
    }
}
