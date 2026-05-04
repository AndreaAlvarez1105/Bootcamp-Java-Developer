/**
 * Clase Main
 * Esta clase contiene el metodo main que ejecuta los algoritmos de busqueda y ordenamiento.
 *
 * @version 1.0
 * @author Andrea Alvarez
 **/

import AlgoritmosBusqueda.BusquedaBinaria;
import AlgoritmosBusqueda.BusquedaSecuencial;
import AlgoritmosOrdenamiento.OrdenamientoBurbuja;
import AlgoritmosOrdenamiento.OrdenamientoPorInsercion;
import AlgoritmosOrdenamiento.OrdenamientoPorSeleccion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arregloOrdenadoSmall[] = {2, 3, 6, 8, 10};
        int arregloDesordenadoSmall[] = {10, 2, 6, 3, 8};

        int arregloOrdenadoMedium[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int arregloDesordenadoMedium[] = {10, 2, 6, 3, 8, 1, 4, 5, 12, 9, 14, 7, 15, 11, 13};

        int arregloOrdenadoBig[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100
        };

        int arregloDesordenadoBig[] = {89, 12, 45, 68, 34, 23, 76, 92, 5, 100,
                3, 9, 33, 27, 59, 6, 84, 16, 51, 71,
                24, 8, 90, 19, 63, 78, 32, 22, 1, 39,
                54, 15, 87, 26, 75, 66, 17, 49, 2, 38,
                91, 80, 46, 7, 30, 14, 41, 70, 4, 28,
                61, 60, 40, 13, 20, 95, 35, 36, 99, 44,
                18, 25, 29, 64, 81, 50, 10, 73, 62, 52,
                88, 11, 42, 83, 77, 21, 57, 48, 58, 97,
                53, 67, 72, 37, 85, 31, 55, 74, 86, 43,
                96, 65, 47, 56, 98, 69, 79, 93, 94, 82};
        int numeroBuscar = 10;
        int sizeArreglo = arregloDesordenadoSmall.length;


        //Implementacion de algoritmo de busqueda Secuencial
        BusquedaSecuencial b = new BusquedaSecuencial();
        int resultadoB1 = BusquedaSecuencial.busquedaSecuencial(arregloOrdenadoSmall, numeroBuscar);
        if (resultadoB1 == -1) {
            System.out.print(
                    "El elemento no se encuentra en el arreglo");
        } else {
            System.out.print("El elemento se encuentra en el arreglo en la posicion: " + resultadoB1);
        }

        //Implementacion de algoritmo de busqueda Binaria
        BusquedaBinaria b2 = new BusquedaBinaria();
        int resultadoB2 = b2.busquedaBinaria(arregloOrdenadoSmall, 0, sizeArreglo - 1, numeroBuscar);

        if (resultadoB2 == -1)
            System.out.println("El elemento no se encuentra en el arreglo");
        else
            System.out.print("El elemento se encuentra en el arreglo en la posicion: " + resultadoB2);


        //Implementacion de algoritmo de ordenamiento Burbuja
        OrdenamientoBurbuja ob = new OrdenamientoBurbuja();

        ob.ordenarBurbuja(arregloDesordenadoSmall, sizeArreglo);
        System.out.print("\nArreglo ordenado con el algoritmo de ordenamiento Burbuja: ");
        for (int i = 0; i < sizeArreglo; i++) {
            System.out.print(arregloDesordenadoSmall[i] + " ");
        }


        //Implementacion de algoritmo de ordenamiento por insercion
        OrdenamientoPorInsercion oi = new OrdenamientoPorInsercion();
        oi.ordenamientoInsercion(arregloDesordenadoSmall, sizeArreglo);
        System.out.print("\nArreglo ordenado con el algoritmo de ordenamiento Burbuja: ");
        for (int i = 0; i < sizeArreglo; i++) {
            System.out.print(arregloDesordenadoSmall[i] + " ");
        }


        //Implementacion de algoritmo de ordenamiento por seleccion
        OrdenamientoPorSeleccion ordenSeleccion = new OrdenamientoPorSeleccion();

        ordenSeleccion.OrdenamientoSeleccion(arregloDesordenadoSmall, sizeArreglo);
        System.out.print("\nArreglo ordenado con el algoritmo de ordenamiento por seleccion: ");
        for (int i = 0; i < sizeArreglo; i++) {
            System.out.print(arregloDesordenadoSmall[i] + " ");
        }

    }

}
