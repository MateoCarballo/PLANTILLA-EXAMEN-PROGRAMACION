import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean esUnNumero=false;
        boolean continuarMenuPpal = true;
        String seleccionMenu="";

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Ana", "Lopez Martinez", 111));
        listaPersonas.add(new Persona("Carlos", "Garcia Sanchez", 222));
        listaPersonas.add(new Persona("Laura", "Perez Rodriguez", 333));
        listaPersonas.add(new Persona("David", "Gonzalez Fernandez", 444));
        listaPersonas.add(new Persona("Sara", "Sanchez Gomez", 555));
        listaPersonas.add(new Persona("Julia", "Hernandez Perez", 666));
        listaPersonas.add(new Persona("Jorge", "Gomez Gonzalez", 777));
        listaPersonas.add(new Persona("Isabel", "Martinez Lopez", 888));
        listaPersonas.add(new Persona("Daniel", "Fernandez Sanchez", 999));
        listaPersonas.add(new Persona("Cristina", "Perez Hernandez", 123));



        do {
            while (!esUnNumero) {
                System.out.println("""
                    1.Ordenar por nombre.
                    2.Buscar por nombre.
                    3.
                    4.
                    5.
                    6.
                    7.
                    8.
                    9.
                    0.Salir               
                    """);

                seleccionMenu= br.readLine();

                if (seleccionMenu.matches("^[0-9]$")) {
                    System.out.println("El numero introducido es valido."+"\n");
                    esUnNumero = true;
                } else {
                    System.out.println("""
                        Has introducido un valor que no cumple las especificaciones
                        Introduce un digito entre 0-9""");
                    esUnNumero = false;
                }

            }
//
            switch (Integer.parseInt(seleccionMenu)) {
                case 1 -> {
                    Ordenaciones.ordenarPorAtributo(listaPersonas,"nombre");
                    imprimirElementosArrayList(listaPersonas);

                }
                case 2 -> {

                    //Ordenar y buscar por lo mismo

                    Ordenaciones.ordenarPorAtributo(listaPersonas,"nombre");
                    //me retorna una Arraylist que envio al metodo

                    System.out.println(Busqueda.busquedaBinaria(listaPersonas,"JORGE"));
                }
                /*
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 8 -> {
                }
                case 9 -> {


                }
                */
                case 0 -> {
                    continuarMenuPpal = false;
                }
            }
            esUnNumero = false;

        } while (continuarMenuPpal);
    }

    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*1000));
    }

    public static void imprimirElementosArrayList (ArrayList<Persona> lista){
        for(Persona elemento :lista) {
            System.out.println(elemento);
        }
    }
}
