package Ejemplo04;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 4 – Ranking de eficiencia energética de proyectos
 * Contexto: Se evalúan proyectos por su porcentaje de ahorro energético.
 * Ordena los proyectos del más al menos eficiente.
 * **/

public class RankingProduccion {


    public static void main(String[] args) {
        List<Proyecto> proyectos = new ArrayList<>();
        proyectos.add(new Proyecto("Sistema Solar", 25.0));
        proyectos.add(new Proyecto("Biosistema", 25.0));
        proyectos.add(new Proyecto("Aguaponico", 25.0));

        bubbleSort(proyectos);

        System.out.println("Ranking de eficiencias");
        for (Proyecto p : proyectos) {
            System.out.println(p.nombre + ": " + p.eficiencia + "% de ahorro energético");
        }



    }
}