# **IMPLEMETACIÓN DE UNA LISTA ENLAZADA SIMPLE**





##### **Descripción**

Este proyecto implementa una lista enlaza simple en Java a través del paradigma de programación orientada objetos. Este programa permite agregar y eliminar al inicio, al final y en una posición en especificó. Además te permite buscar la existencia de algún dato en la lista creada y mostrar en consola la lista creada. 







##### **Estructura del proyecto**

El programa constitute de tres clases:

* *Clase Main*: Permite la interacción con la clase ListaEnlazadaSimple y los métodos que está contiene. Se instancia a una lista enlazada simple de forma "quemada o directa" y con un switch para facilitar la interacción con el usuario.
* *Clase ListaEnlazadaSimple:* Permite crear una lista enlazada simple, insertar y eliminar nodos al inicio, al final o en una posición específica, buscar un dato en la lista y mostrar la lista actual.
* *Clase Nodo:*  Representa un nodo en una lista enlazada simple, conteniendo un dato y una referencia al siguiente nodo llamada siguiente.



##### **Instrucciones para compilar y ejecutar el programa**

**Terminal de Windows**

Al abrir la terminal y acceder a la carpeta raíz del proyecto se debe seguir los siguientes paso:

1. Para compilar el proyecto, digitar el siguiente comando: *mvn clean compile*
2. Para ejecutar las pruebas unitarias: *mvn test*







##### **Pruebas Unitarias**

Se realizaron nueve pruebas correspondiente a cada uno de los métodos de la clase ListaEnlazadaSimple. Para la todas las pruebas, se inicializó un objeto de tipo LsitaEnlazadaSimple y en en la mayoría se le asignaron valores utilizando alguno de los métodos creados. Entre las principales podemos mencionar:

1. **Insertar al inicio:** Con el método insertarAlInicio primero se inserta el dato 10. Se realiza un assertEquals en el cual se espera obtener el valor 10 como cabeza de la lista. 
2. **Eliminar al inicio:** Con el método eliminarAlInicio primero se inserta el dato 10 y luego 5. Se realiza un assertEquals en el cual se espera obtener el valor 10 como cabeza de la lista.
3. **Búsqueda:** Se inserta cuatro valores en la lista: 5, 10, 15 y 20. Se Se realiza un assertEquals en el cual se espera obtener que el valor 15 se encuentra en la lista, al ya saber su posición, se verifica que está correctamente en esa posición. 







##### **Notas/Detalles importantes**

Para realizar la pruebas unitarias con la herramienta JUnit se utilizó:

1. Clase Extra: Se implemento la clase ListaEnlazadaSimpleTest en la cual se realizó pruebas unitarias para cada uno de los métodos de la clase ListaEnlazadaSimple.
2. Uso de dependencia: Para utilizar la herramienta se utilizó la versión 5.10.2, en específico la siguiente dependencia en el archivo pom.xml :
   *<dependencies>*
2. 
*&nbsp;       <dependency>*

            *<groupId>org.junit.jupiter</groupId>*

            *<artifactId>junit-jupiter</artifactId>*

            *<version>5.10.2</version>*

            *<scope>test</scope>*

        *</dependency>*

    *</dependencies>*

3\. Maven: Para poder implementar pruebas unitarias con Junit se optó por Maven como gestor del proyecto debido a que se necesitaban implementar dependencias para poder utilizar la herramienta mencionada.

