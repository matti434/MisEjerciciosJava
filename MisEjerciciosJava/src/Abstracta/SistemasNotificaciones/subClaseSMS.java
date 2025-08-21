package Abstracta.SistemasNotificaciones;

public class subClaseSMS extends Notificacion{

    public subClaseSMS(String destinatario, String mensaje){
      super(destinatario, mensaje);
    }

    @Override
    String enviar() {
        String resultado = "Enviando SMS a " + getDestinatario() + ": " + getMensaje();
        System.out.println(resultado);
        return resultado;
    }
    
}
