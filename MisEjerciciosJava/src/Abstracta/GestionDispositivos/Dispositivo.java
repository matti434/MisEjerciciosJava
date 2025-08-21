package Abstracta.GestionDispositivos;

public abstract class Dispositivo {

    private String nombre;
    private boolean encendido;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
    }

    abstract void encender();

    abstract void apagar();

    public void mostrarEstado(){
        String estado= encendido ? "encendido" : "apagado";
        System.out.println("Nombre: "+ nombre + " , Estado: " + estado);
    }
    
}
