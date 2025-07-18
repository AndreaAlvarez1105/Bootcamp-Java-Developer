package com.abc;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        //Instancia de la clase ListaEnlazadaSimple de forma quemada o directa
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.mostrarLista();
        lista.insertarAlFinal(30);
        lista.mostrarLista();
        lista.eliminarAlInicio();
        lista.mostrarLista();
        lista.insertarEnPosicion(20,1);
        lista.mostrarLista();
        lista.eliminarEnPosicion(1);
        lista.mostrarLista();
        lista.buscar(10);

        //Instancia de la clase ListaEnlazadaSimple con un menu para el usuario
        int opcion = 0;
        int dato = 0;
        int posicion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----LISTA ENLAZADA SIMPLE-----");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en posición");
            System.out.println("4. Eliminar al inicio");
            System.out.println("5. Eliminar al final");
            System.out.println("6. Eliminar en posición");
            System.out.println("7. Mostrar lista");
            System.out.println("8. Buscar dato");
            System.out.println("9. Salir");
            System.out.println("Seleccione una opción:");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("--INSERTAR AL INICIO--");
                        System.out.print("Ingrese el dato a insertar: ");
                        dato = sc.nextInt();
                        lista.insertarAlInicio(dato);
                        break;
                    case 2:
                        System.out.println("--INSERTAR AL FINAL--");
                        System.out.print("Ingrese el dato a insertar: ");
                        dato = sc.nextInt();
                        lista.insertarAlFinal(dato);
                        break;
                    case 3:
                        System.out.println("--INSERTAR EN POSICION ESPECIFICA--");
                        System.out.print("Ingrese el dato a insertar: ");
                        dato = sc.nextInt();
                        System.out.print("Ingrese la posición donde desea insertar el dato: ");
                        posicion = sc.nextInt();
                        lista.insertarEnPosicion(dato, posicion);
                        break;
                    case 4:
                        System.out.println("--ELIMINAR AL INICIO--");
                        lista.eliminarAlInicio();
                        lista.mostrarLista();
                        break;
                    case 5:
                        System.out.println("--ELIMINAR AL FINAL--");
                        lista.eliminarAlFinal();
                        lista.mostrarLista();
                        break;
                    case 6:
                        System.out.println("--ELIMINAR EN POSICION ESPECIFICA--");
                        System.out.print("Ingrese la posicion a eliminar: ");
                        posicion = sc.nextInt();
                        lista.eliminarEnPosicion(posicion);
                        lista.mostrarLista();
                        break;
                    case 7:
                        System.out.println("-----LISTA-----");
                        lista.mostrarLista();
                        break;
                    case 8:
                        System.out.println("--BUSCAR DATO--");
                        System.out.print("Ingrese el dato a buscar: ");
                        dato = sc.nextInt();
                        lista.buscar(dato);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 9.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número entre 1 y 9.");
                sc.nextLine();
            }

        }while (opcion != 9);



        }
    }
