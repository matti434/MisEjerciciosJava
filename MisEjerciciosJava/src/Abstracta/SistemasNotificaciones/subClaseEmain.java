package Abstracta.SistemasNotificaciones;

public class subClaseEmain extends Notificacion{

    public subClaseEmain(String destinatario,String mensaje){
        super(destinatario, mensaje);
    }

    @Override
    String enviar() {
        String resultado = "Enviando email a " + getDestinatario() + ": " + getMensaje();
        System.out.println(resultado);
        return resultado;
    }
}
