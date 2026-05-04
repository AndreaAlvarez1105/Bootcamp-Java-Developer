public class SMS extends Notificacion {
    private String operador;
    private String codigoPais;

    public SMS() {}
    public SMS(String remitente, String destinatario, String mensaje, String operador, String codigoPais) {
        super(remitente, destinatario, mensaje);
        this.operador = operador;
        this.codigoPais = codigoPais;
    }

    public String getOperador() {
        return operador;
    }
    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCodigoPais() {
        return codigoPais;
    }
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Operador " + getOperador());
        System.out.println("Codigo de pais: " + getCodigoPais());
        System.out.println("De: " + getRemitente());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Mensaje: " + getMensaje());
    }
}
