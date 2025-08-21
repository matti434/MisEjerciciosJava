package Abstracta.GestionDispositivos;

public class subClaseTv extends Dispositivo {

    public subClaseTv(String nombre) {
        super(nombre);
    }

    public void OtraFuncion(){
        System.out.println("Hola otra funcion 2");
    }

    @Override
    void encender() {
        setEncendido(true);
        System.out.println("Buscando canales...");
 
    }

    @Override
    void apagar() {
        setEncendido(true);
        System.out.println("Apagando...");
      
    }

}
