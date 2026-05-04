/**
 * Clase OrdenamientoPorInsercion
 * Esta clase implementa el algoritmo de ordenamiento por insercion.
 *
 * @version 1.0
 * @author Andrea Alvarez
 * **/

package AlgoritmosOrdenamiento;

public class OrdenamientoPorInsercion {
    public static void ordenamientoInsercion(int arr[], int arregloSize) {

        for (int i = 1; i < arregloSize; ++i) {
            int indice = arr[i];
            int posicion = i - 1;

            // Mueve los elementos del arreglo que son mayores que el indice a una posición adelante
            while (posicion >= 0 && arr[posicion] > indice) {
                // Mueve el elemento a la derecha
                arr[posicion + 1] = arr[posicion];
                posicion = posicion - 1; // Disminuye la posición
            }
            arr[posicion + 1] = indice; // Inserta el indice en la posición correcta
        }
    }
}