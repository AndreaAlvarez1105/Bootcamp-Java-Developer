public class FabricacionNotificacion {

    public static Notificacion crearNotificacion(String tipoNotificacion){

        if (tipoNotificacion == null){
            throw new NullPointerException("Tipo de notificacion no puede ser nulo");
        }

        switch (tipoNotificacion){
            case "email":
                return new Email("andrea.1105@gmail.com", "00073824@gmail.com", "Hola, como estas?", "Claro", "Saludo");
            case "SMS":
                return new SMS();
            default:
                System.out.println("No se reconoce el tipo de notificacion " );
                return null;
        }

    }
}
