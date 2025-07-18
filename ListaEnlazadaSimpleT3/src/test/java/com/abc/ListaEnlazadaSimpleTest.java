package com.abc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ListaEnlazadaSimpleTest {

    @Test
    void insertarAlInicio() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        assertEquals(10, lista.getCabeza().getDato());

        lista.insertarAlInicio(20);
        assertEquals(20, lista.getCabeza().getDato());
        assertEquals(10, lista.getCabeza().getSiguiente().getDato());
    }

    @Test
    void eliminarAlInicio() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(5);

        lista.eliminarAlInicio();
        lista.mostrarLista();
        assertEquals(10, lista.getCabeza().getDato());
    }

    @Test
    void insertarAlFinal() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        lista.insertarAlFinal(20);

        assertEquals(20, lista.getCabeza().getSiguiente().getDato());
    }

    @Test
    void eliminarAlFinal() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        lista.insertarAlFinal(20);

        lista.eliminarAlFinal();
        lista.mostrarLista();
        assertNull(lista.getCabeza().getSiguiente());
    }

    @Test
    void insertarEnPosicion() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        lista.insertarAlFinal(20);

        lista.insertarEnPosicion(30,3);
        lista.mostrarLista();
        assertEquals(30, lista.getCabeza().getSiguiente().getSiguiente().getDato());
    }

    @Test
    void eliminarEnPosicion() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.mostrarLista();

        lista.eliminarEnPosicion(2);
        lista.mostrarLista();
        assertEquals(30, lista.getCabeza().getSiguiente().getDato());
    }

    @Test
    void mostrarLista() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(5);
        lista.insertarAlFinal(15);
        lista.insertarAlFinal(20);

        lista.mostrarLista();
        // Verifica que la lista se muestre correctamente
        assertEquals(5, lista.getCabeza().getDato());
        assertEquals(10, lista.getCabeza().getSiguiente().getDato());
        assertEquals(15, lista.getCabeza().getSiguiente().getSiguiente().getDato());
        assertEquals(20, lista.getCabeza().getSiguiente().getSiguiente().getSiguiente().getDato());
    }

    @Test
    void buscar() {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(5);
        lista.insertarAlFinal(15);
        lista.insertarAlFinal(20);

        lista.mostrarLista();
        lista.buscar(15);
        // Verifica que el dato se encuentre en la lista
        assertEquals(15, lista.getCabeza().getSiguiente().getSiguiente().getDato());
    }
}