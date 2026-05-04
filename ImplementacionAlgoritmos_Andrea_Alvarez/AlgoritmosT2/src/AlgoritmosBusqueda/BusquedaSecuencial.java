/**
 * Clase BusquedaBinaria
 * Esta clase implementa el algoritmo de búsqueda binaria.
 *
 * @version 1.0
 * @author Andrea Alvarez
 * **/
package AlgoritmosBusqueda;

public class BusquedaSecuencial {

    public static int busquedaSecuencial(int arreglo[], int numero) {
        // Verifica si el arreglo es nulo o tiene longitud cero
        int n = arreglo.length;

        for (int i = 0; i < n; i++) { //Recorre el arreglo
        // Si el elemento en la posición i es igual al número buscado, retorna la posición
            if (arreglo[i] == numero)
                return i;
        }
        return -1; // Retorna -1 si el número no se encuentra en el arreglo
    }
}
