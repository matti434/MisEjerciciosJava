package poo;

public abstract class Animales {
    
    private String nombre;
    private String tipo;
    private int edad;

    public Animales(){

    }
    public Animales(String nombre, String tipo, int edad){
        this.nombre=nombre;
        this.tipo=tipo;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre +", edad: "+ edad +",tipo: "+ tipo);
    }

    public abstract void hacerSonido();

}
