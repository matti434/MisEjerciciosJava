package Abstracta.SistemasNotificaciones;

public abstract class Notificacion {

    private String destinatario;
    private String mensaje;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    abstract String enviar();

    void mostrarInformacion() {
        System.out.println("Este mensaje viene desde la clase abstract");
    }

}
