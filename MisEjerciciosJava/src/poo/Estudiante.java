package poo;

/*
 * Clase Estudiante

Atributos: nombre, nota.

Método que indique si está aprobado (nota >= 6).

Crear un array de 5 estudiantes y mostrar cuántos aprobaron.
 */

public class Estudiante {

    private String nombre;
    private float nota;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public Estudiante(){

    }

    public Estudiante(String nombre, float nota){
        this.nombre=nombre;
        this.nota=nota;
    }

    public void aprobado(){
        if(nota<=6){
            System.out.println("El estudiante "+nombre+ " esta aprobado con: "+nota);
        }
        else{
            System.out.println("El estudiante "+nombre+ " no esta aprobado con: "+nota);
        }
    }

}
