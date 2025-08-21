package Abstracta.SistemasFiguras;

public class Rectangulo extends Figura {

    double lado1;
    double lado2;

    public Rectangulo(double lado1, double lado2){
        this.lado1=lado1;
        this.lado1=lado1;
    }

    @Override
    double calcularArea() {
        return lado1*lado2;
    }

    
    
}
