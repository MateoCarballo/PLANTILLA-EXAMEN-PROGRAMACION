import java.util.ArrayList;

public class Busqueda {

    public static Persona busquedaBinaria(ArrayList<Persona> lista, String nombreBuscado) {
        int inicio = 0;
        int fin = lista.size() - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (lista.get(medio).getNombre().equalsIgnoreCase(nombreBuscado)) {
                return lista.get(medio);
            } else if (lista.get(medio).getNombre().compareTo(nombreBuscado) < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return null; // Si no se encuentra el objeto, devolver null
    }}

/* LO QUE MARIA SUBIO
public class BusquedaBinaria {//también llamada DICOTÓMICA
    public int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {

        int index = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {

        int middle = (low + high) / 2;
        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }

    //Usando método Arrays
    /*
     * Es importante mencionar que el método binarySearch de la clase Arrays también requiere que
     * el arreglo que se pase como parámetro se encuentre ordenado, en caso contrario los resultados pueden ser erróneos.
     *   Si hay números repetidos, solamente devuelve uno.
     *


    public int runBinarySearchUsingJavaArrays(int[] sortedArray, Integer key) {
        int index = Arrays.binarySearch(sortedArray, key);
        return index;
    }

    //Usando método Collections
    public int runBinarySearchUsingJavaCollections(List< Integer > sortedList, Integer key) {
        int index = Collections.binarySearch(sortedList, key);
        return index;
    }

    public static void main(String[] args) {

        BusquedaBinaria binarySearch = new BusquedaBinaria();

        int[] sortedArray = {
                0,
                1,
                2,
                3,
                4,
                5,
                5,
                6,
                7,
                8,
                9,
                9
        };
        int key = 7;
        int low = 0;
        int high = sortedArray.length - 1;
        List < Integer > sortedList = Arrays.asList(0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);

        int result = binarySearch.runBinarySearchIteratively(sortedArray, key, low, high);
        System.out.println("runBinarySearchIteratively result -> " + result);

        result = binarySearch.runBinarySearchRecursively(sortedArray, key, low, high);
        System.out.println("runBinarySearchRecursively result -> " + result);

        result = binarySearch.runBinarySearchUsingJavaArrays(sortedArray, key);
        System.out.println("runBinarySearchUsingJavaArrays result -> " + result);

        result = binarySearch.runBinarySearchUsingJavaCollections(sortedList, key);
        System.out.println("runBinarySearchUsingJavaCollections result -> " + result);
    }


}

*/