
import java.util.ArrayList;
import java.util.Collections;

public class Ordenaciones {
    public static void ordenarPorAtributo(ArrayList<Persona> lista, String atributo) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                Persona p1 = lista.get(i);
                Persona p2 = lista.get(j);

                    if (atributo.equalsIgnoreCase("nombre")) {
                        if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                            Collections.swap(lista, i, j);
                        }
                    }
                if (atributo.equalsIgnoreCase("apellido")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
                if (atributo.equalsIgnoreCase("dni")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
            }
        }
    }

    public static void ordenarPorClase(ArrayList<Persona> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                Persona p1 = lista.get(i);
                Persona p2 = lista.get(j);

                String claseP1 = p1.getClass().getSimpleName();
                String claseP2 = p2.getClass().getSimpleName();

                if (claseP1.compareTo(claseP2) > 0) {
                    Collections.swap(lista, i, j);
                }
            }
        }
    }


    public static void ordenarPorClaseFOREACH(ArrayList<Persona> lista) {
        for (Persona p1 : lista) {
            for (Persona p2 : lista) {
                String claseP1 = p1.getClass().getSimpleName();
                String claseP2 = p2.getClass().getSimpleName();

                if (claseP1.compareTo(claseP2) > 0) {
                    Collections.swap(lista, lista.indexOf(p1), lista.indexOf(p2));
                }
            }
        }
    }



}
