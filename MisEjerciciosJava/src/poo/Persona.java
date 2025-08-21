package poo;

public class Persona {
      // atributos
    private String nombre;
    private int edad;


    //constructores
    public Persona(){

    }

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public boolean esMayorDeEdad(){
        return edad>=18;
    }
    

}
