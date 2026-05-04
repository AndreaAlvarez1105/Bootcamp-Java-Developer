/**
 * Clase Calculadora
 * Esta clase permite interactuar con el usuario en un switch para realizar operaciones matemáticas básicas como suma, resta, multiplicación, división, potencia y raíz cuadrada.
 * @version 1.0
 * @author Andrea Álvarez
 * */
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);

    private float resultado;

    public Calculadora() {
        this.resultado = 0;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void metodos() {
        int opcion = 0;
        float num1, num2;
        Operacion operacion = new Operacion();

        do {
            try {
                System.out.println("---CALCULADORA---");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Power");
                System.out.println("6. Raíz Cuadrada");
                System.out.println("7. Salir");
                System.out.println("Seleccione una opción:");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("SUMA");
                        System.out.println("Ingrese el primer número:");
                        num1 = sc.nextFloat();
                        System.out.println("Ingrese el segundo número:");
                        num2 = sc.nextFloat();
                        operacion.suma(num1, num2);
                        operacion.imprimirResultado();
                        break;
                    case 2:
                        System.out.println("RESTA");
                        System.out.println("Ingrese el primer número:");
                        num1 = sc.nextFloat();
                        System.out.println("Ingrese el segundo número:");
                        num2 = sc.nextFloat();
                        operacion.resta(num1, num2);
                        operacion.imprimirResultado();

                        break;
                    case 3:
                        System.out.println("MULTIPLICACION");
                        System.out.println("Ingrese el primer número:");
                        num1 = sc.nextFloat();
                        System.out.println("Ingrese el segundo número:");
                        num2 = sc.nextFloat();
                        operacion.multiplicacion(num1, num2);
                        operacion.imprimirResultado();
                        break;

                    case 4:
                        System.out.println("DIVISION");
                        System.out.println("Ingrese el primer número:");
                        num1 = sc.nextFloat();
                        System.out.println("Ingrese el segundo número:");
                        num2 = sc.nextFloat();
                        if (num2 == 0) {
                            operacion.division(num1, num2);
                        } else {
                            operacion.division(num1, num2);
                            operacion.imprimirResultado();
                        }
                        break;
                    case 5:
                        System.out.println("POWER");
                        System.out.println("Ingrese el número a elevar:");
                        num1 = sc.nextFloat();
                        System.out.println("Ingrese la potencia deseada:");
                        num2 = sc.nextFloat();

                        operacion.power(num1, num2);
                        operacion.imprimirResultado();
                        break;
                    case 6:
                        System.out.println("Raiz Cuadrada");
                        System.out.println("Ingrese el número a elevar:");
                        num1 = sc.nextFloat();
                        operacion.sqrt(num1);
                        operacion.imprimirResultado();
                        break;
                    case 7:
                        System.out.println("Saliendo del programa.........");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor intente de nuevo.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("---------------------------------\nIngrese un dato valido\n---------------------------------");
                sc.nextLine();
            }
        } while (opcion != 7);

    }

}
