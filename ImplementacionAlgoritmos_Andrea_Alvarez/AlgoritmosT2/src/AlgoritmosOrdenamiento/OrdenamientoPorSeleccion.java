/**
 * Clase OrdenamientoPorSeleccion
 * Esta clase implementa el algoritmo de ordenamiento por seleccion.
 *
 * @version 1.0
 * @author Andrea Alvarez
 * **/

package AlgoritmosOrdenamiento;

public class OrdenamientoPorSeleccion {

    public static void OrdenamientoSeleccion(int[] arreglo, int sizeArreglo) {
        for (int i = 0; i < sizeArreglo - 1; i++) {
            int minimo_indice = i; // Inicializa el índice del elemento mínimo como el índice actual

            // Encuentra el índice del elemento mínimo en el subarreglo no ordenado
            for (int j = i + 1; j < sizeArreglo; j++) {
                if (arreglo[j] < arreglo[minimo_indice]) { // Compara el elemento actual con el mínimo encontrado
                    minimo_indice = j; // Actualiza el índice del mínimo si se encuentra un elemento menor
                }
            }

            int auxiliar = arreglo[i]; // Guarda el valor del elemento actual
            arreglo[i] = arreglo[minimo_indice]; // Asigna el valor del elemento mínimo al elemento actual
            arreglo[minimo_indice] = auxiliar; // Asigna el valor guardado al elemento mínimo encontrado
        }
    }
}
