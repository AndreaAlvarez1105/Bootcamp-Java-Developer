import java.util.Scanner;

public class Resataurante {
    enum Menu {
        PIZZA, HAMBURGUESA, ENSALDA
    }

    public static final double [] PRECIOS = {8.5, 7.0, 6.5};

    public static double total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do{
            System.out.println("---MENU---");
            for (Menu item : Menu.values())
            {
                System.out.println("item = " + item + " - Precio: " + PRECIOS[item.ordinal()]);
            }
            System.out.println("Que desea pedir?");
            try {
                Menu pedido = Menu.valueOf(sc.nextLine().toUpperCase());
                int index = pedido.ordinal();
                total += PRECIOS[index];
                System.out.println("Agregado " + pedido + " ($ " + PRECIOS[index] + ")");
            }catch (IllegalArgumentException e){
                System.out.println("Opcion no valida");
            }

            System.out.println("¿Desea continuar? (S/N)");
            opcion = sc.nextLine();


        } while (opcion.equalsIgnoreCase("S"));

        System.out.println("Total a pagar: $" + total);
        System.out.println("Gracias!");
    }
}
