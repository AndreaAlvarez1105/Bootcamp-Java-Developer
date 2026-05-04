package Ejemplo01;

import java.util.*;

/**
 * Ejercicio 1 – Orden de atención por prioridad social
 * Contexto: En una oficina se atienden solicitudes según su tipo: urgentes, regulares o informativas. Se requiere un sistema que ordene automáticamente las solicitudes según prioridad antes de atenderlas.
 *
 * Entrada: List<String> solicitudes = Arrays.asList("Regular", "Informativa", "Urgente", "Urgente", "Regular");
 *
 * Salida:Atención: Urgente -> Urgente -> Regular -> Regular -> Informativa
 * **/

public class AntencionSolicitudes {

    public static void main(String[] args) {
        List<String> solicitudes = Arrays.asList("Regular", "Informativa", "Urgente", "Regular");
        String resultado = ordenarPrioridades(solicitudes);
        System.out.println(resultado);
    }

    private static String ordenarPrioridades (List<String> solicitudes){
        Map<String, Integer> prioridad = Map.of(
                "Urgente", 1,
                "Regular", 2,
                "Informativa", 3
        );
        //Copia de solicitudes
        List<String> copia = new ArrayList<>(solicitudes);
        copia.sort(Comparator.comparingInt(prioridad::get)); //IMPORTANTE: Metodo para ordenar la lista copia según el valor de prioridad de cada solicitud.
        return "Atención: " + String.join(" -> ", copia);
        //String.join(" -> ", copia) es para poner el separador " -> " entre los elementos de la lista.



    }


}
