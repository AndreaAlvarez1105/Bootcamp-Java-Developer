package com.abc;

public class ListaEnlazadaSimple {
    private Nodo cabeza;

    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public void insertarAlInicio(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            System.out.println("Dato insertado con exito al inicio.");

        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            System.out.println("Dato insertado con exito al inicio.");
        }

    }

    public void eliminarAlInicio(){
        Nodo nuevoNodo = cabeza;
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
            nuevoNodo.setSiguiente(null); // Desvincular el nodo eliminado
            System.out.println("Dato eliminado con exito al inicio.\nLista modificada: ");
        } else {
            System.out.println("La lista está vacía, no se puede eliminar.");
        }

    }

    public void insertarAlFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        //Inserta un nodo cuando la cabeza es null
        if (cabeza == null) {
            cabeza = nuevoNodo;
            System.out.println("Dato insertado con exito al final.");
        } else {
            //Declara un nodo que apunta a la cabeza(inicio)
            Nodo actual = cabeza;
            //Recorre la lista hasta llegar al último nodo
            while (actual.getSiguiente() != null) {
                //Avanza al siguiente nodo, tomando el valor del siguiente nodo hasta que llegue al último nodo
                actual = actual.getSiguiente();
            }
            //Cuando llega al último nodo, establece el siguiente del último nodo al nuevo nodo
            actual.setSiguiente(nuevoNodo);
            System.out.println("Dato insertado con exito al final.");

        }

    }
    public void eliminarAlFinal(){
        //Inserta un nodo cuando la cabeza es null
        if (cabeza == null) {
            System.out.println("La cabeza está vacía, no se hay nada por eliminar");;
        } else if (cabeza.getSiguiente() == null) {
            //Si la cabeza es el único nodo, lo elimina
            cabeza = null;
            System.out.println("Dato eliminado con exito al final.");
        }
        else {
            //Declara un nodo que apunta a la cabeza(inicio)
            Nodo actual = cabeza;
            Nodo anterior = null;
            //Recorre la lista hasta llegar al último nodo
            while (actual.getSiguiente() != null) {
                //Avanza al siguiente nodo, tomando el valor del siguiente nodo hasta que llegue al último nodo
                anterior = actual;
                actual = actual.getSiguiente();
            }
            //Cuando llega al último nodo, establece el siguiente del último nodo al nuevo nodo
            anterior.setSiguiente(null);
            System.out.println("Dato eliminado con exito al final.\nLista modificada: ");

        }

    }
    public void insertarEnPosicion(int dato, int posicion){
        Nodo nuevoNodo = new Nodo(dato);
        posicion = posicion-1;
        if (posicion < 0) {
            System.out.println("Posición inválida. Debe ser mayor o igual a 0.");
            return;
        }
        if (posicion == 0) {
            insertarAlInicio(dato);
            return;
        }
        Nodo actual = cabeza;
        for (int i = 0; i < posicion - 1 && actual != null; i++) {
            actual = actual.getSiguiente();
        }
        if (actual == null) {
            System.out.println("Posición fuera de rango. Se insertará al final.");
            insertarAlFinal(dato);
        } else {
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
            System.out.println("Dato insertado con exito.");
        }

    }
    public void eliminarEnPosicion(int posicion){
        Nodo actual = cabeza;
        Nodo anterior = null;

        if (posicion < 0) {
            System.out.println("Posición inválida. Debe ser mayor o igual a 0.");
            return;
        }
        if (posicion == 0) {
            eliminarAlInicio();
            return;
        }

        for (int i = 0; i < posicion - 1 && actual != null; i++) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual == null) {
            System.out.println("Posición fuera de rango. No se puede eliminar");
        } else {
            anterior.setSiguiente(actual.getSiguiente());
            System.out.println("Dato eliminado con exito.\nLista modificada: ");

        }

    }
    public void mostrarLista(){
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public void buscar(int dato) {
        Nodo actual = cabeza;
        int posicion = 1;
        while (actual != null) {
            if (actual.getDato() == dato) {
                System.out.println("Dato " + dato + " encontrado en la lista, en la posición: " + posicion);
                return;
            }
            posicion++;
            actual = actual.getSiguiente();
        }
        System.out.println("Dato " + dato + " no encontrado en la lista.");
    }
}
