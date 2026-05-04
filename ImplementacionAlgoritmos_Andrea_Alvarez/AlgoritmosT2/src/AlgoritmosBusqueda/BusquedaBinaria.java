/**
 * Clase BusquedaBinaria
 * Esta clase implementa el algoritmo de búsqueda binaria.
 *
 * @version 1.0
 * @author Andrea Alvarez
 * **/

package AlgoritmosBusqueda;

public class BusquedaBinaria {

    //recibe un arreglo ordenado, el índice inicial (x), el índice final (sizeArreglo) y el número a buscar
    public int busquedaBinaria(int arreglo[], int x, int sizeArreglo, int numero) {
        // Verifica si el arreglo está vacío o si el número es menor que el primer elemento o mayor que el último
        while (x <= sizeArreglo) {
            // Calcula el índice medio
            int indice = (x + sizeArreglo) / 2;
            // Verifica si el número está en el índice medio
            if (arreglo[indice] == numero) {
                return indice; // Retorna el índice del número encontrado
            } else if (arreglo[indice] > numero) {
                sizeArreglo = indice - 1; // Busca en la mitad izquierda
            } else {
                x = indice + 1; // Busca en la mitad derecha
            }
        }
        return -1; // Retorna -1 si el número no se encuentra en el arreglo
    }
}
