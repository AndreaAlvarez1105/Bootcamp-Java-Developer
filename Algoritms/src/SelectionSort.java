import java.util.HashMap;
import java.util.Map;

public class SelectionSort {


    public static void main(String[] args) {

        //Primero debemos conocer la frecuecia de cada elemento para luego utilizarlo en el ordanmiento
        String palabra = "programacionjava";

        //Necesitmaos una variable que un <caracter>, frecuencia
        Map<Character, Integer> frecuenciaCaracter = new HashMap<>();

        //pasar la palabra a minúscula
        palabra = palabra.toLowerCase();

        //Para capturar cada caracter de la palabra y las frecuencias
        for (char c : palabra.toCharArray()) {
            frecuenciaCaracter.put(c, frecuenciaCaracter.getOrDefault(c, 0) + 1);
        }

        //Array de caracteres, que no tenga letras suplicadas y que pueda ordenar por frecuencia y algabeticamente
        char caracteres[] = new char[frecuenciaCaracter.size()];
        int i = 0;
        for (char c : frecuenciaCaracter.keySet()) {
            caracteres[i++] = c;
        }

        //Ordenamos el array de caracteres según frecuencia y alfabeticmaente
        selectionSort(caracteres,frecuenciaCaracter);

        //ver resultado
        System.out.print("Salida: \n[");
        for (int j = 0; j < caracteres.length; j++) {
            System.out.print("'" + caracteres[j] + " ");
            if ( j != caracteres.length - 1) System.out.print(", ");
            System.out.print("]\n");
        }
    }

    public static void selectionSort(char[] arr, Map<Character, Integer> frecuencias) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                int frecueciaJ = frecuencias.get(arr[j]);
                int frecMax = frecuencias.get(arr[maxIndex]);

                if (frecueciaJ > arr[maxIndex]) {
                    maxIndex = j;
                    //Si tiene  la misma frecuencia, hay que ordenar en orden alfabetico ASC
                } else if (frecueciaJ == frecMax && arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Intercambiar arr[i] y arr[minIndex]
            char temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

}