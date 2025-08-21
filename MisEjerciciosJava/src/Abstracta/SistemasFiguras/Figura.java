package Abstracta.SistemasFiguras;

public abstract class Figura {
    
    abstract double calcularArea();


    void imprimirInformacion(){
        System.out.println("Esta informacion viene desde la clase abstracta");
    }
}
