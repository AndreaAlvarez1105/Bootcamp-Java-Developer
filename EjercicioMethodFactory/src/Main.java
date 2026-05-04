public class Main {
    public static void main(String[] args) {

        INotificacion notificacion = FabricacionNotificacion.crearNotificacion("email");
        notificacion.enviarMensaje();

    }

}
