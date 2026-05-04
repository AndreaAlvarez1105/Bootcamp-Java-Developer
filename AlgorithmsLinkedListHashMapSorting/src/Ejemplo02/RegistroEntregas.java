package Ejemplo02;

/**
 * Ejercicio 2 – Registro móvil de entregas de vales
 * Contexto: Un equipo en terreno registra entregas de ayuda a beneficiarios. El orden cambia constantemente por prioridades o cambios logísticos. Simula este proceso con LinkedList.
 * Operaciones:
 * Agregar entrega
 * Eliminar por índice (por error o cambio)
 * Mostrar todas las entregas
 * */
import java.util.*;

public class RegistroEntregas {
    public static void main(String[] args) {
        LinkedList<String> entregas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuarMenu = true;

        while (continuarMenu) {
            System.out.println("\n1. Agregar entrega \n2. Eliminar entrega \n3. Ver entregas \n4. Salir \nSeleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del beneficiario:");
                    entregas.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Índice del beneficiario:");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < entregas.size()) {
                        entregas.remove(index);
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de entregas: ");
                    for (int i = 0; i < entregas.size(); i++) {
                        System.out.println((i + 1) + ". " + entregas.get(i));
                    }
                    break;
                case 4:
                    continuarMenu = false;
                    break;

                default:
                    System.out.println("Error: Ingrese un número válido (1-4).");


            }

        }
    }
}

