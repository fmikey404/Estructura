
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fambr
 */
public class Validador {

    static String[] movies = {"Harry Potter and The Deathly Hallows: Part II", "Fast and Furious 7", "Jurassic Wolrd", "Black Panther",
        "Frozen II", "Star Wars: Episode VII – The Force Awakens", "Titanic", "Top Gun: Maverick", "Avatar", "Spider-Man: No Way Home",
        "Avengers: Age of Ultron", "Avengers: Endgame", "Avengers", "The Lion King", "Avengers: Infinity War"};

    public static ArrayList validar(ArrayList<String> base) {
    ArrayList<Integer> posiciones = new ArrayList();
        for (int i = 0; i < base.size(); i++) {
            for (int j = 0; j < movies.length; j++) {
                if (base.get(i).equals(movies[j])) {
                    int aux = base.indexOf(base.get(i));
                    posiciones.add(aux);
                }
            }
        }
        eliminarRepetidos(posiciones);
        return hallarCantidad(posiciones, Movies.sala1);
    }

    public static ArrayList hallarCantidad(ArrayList<Integer> pos, ArrayList<String> base) {
        ArrayList cant = new ArrayList();
        for (int i = 0; i < pos.size(); i++) {
            int contador = 0;
            for (int j = 0; j < base.size(); j++) {
                if (pos.get(i) == base.indexOf(base.get(j))) {
                    contador++;
                }
            }
            cant.add(contador);
        }
        return cant;
    }

    public static ArrayList eliminarRepetidos(ArrayList del) {
        Set<Integer> ordenador = new HashSet<Integer>(del);
        del.clear();
        del.addAll(ordenador);
        return del;
    }
}
