/**
 * Clase OrdenamientoBurbuja
 * Esta clase implementa el algoritmo de ordenamiento Burbuja.
 *
 * @version 1.0
 * @author Andrea Alvarez
 * **/

package AlgoritmosOrdenamiento;

public class OrdenamientoBurbuja {

    public static void ordenarBurbuja(int arreglo[], int sizeArreglo) {

        boolean intercambio;
        int auxiliar;

        for (int i = 0; i < sizeArreglo - 1; i++) {
            intercambio = false;// Inicializa la variable de intercambio como falsa
            for (int j = 0; j < sizeArreglo - i - 1; j++) {
                //Compara los elementos del arreglo
                if (arreglo[j] > arreglo[j + 1]) {

                    //Intercambia los elementos si están en el orden incorrecto
                    auxiliar = arreglo[j]; // Guarda el valor del elemento actual
                    arreglo[j] = arreglo[j + 1]; // Asigna el valor del siguiente elemento al actual
                    arreglo[j + 1] = auxiliar; // Asigna el valor guardado al siguiente elemento
                    intercambio = true; // Marca que se ha realizado un intercambio
                }
            }
            if (intercambio == false){
                // Si no se realizaron intercambios en el ciclo, el arreglo ya está ordenado por lo que se puede salir del bucle
                break;
            }
        }
    }
}