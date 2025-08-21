package Abstracta.SistemaEmpleados;

public class EmpleadoHora extends Empleado{
    
    private double salarioPorHora;
    private double horasTrabajadas;

    public EmpleadoHora(){

    }
    public EmpleadoHora(String nombre, double salarioPorHora, double horasTrabajadas){
        super(nombre);
        this.salarioPorHora=salarioPorHora;
        this.horasTrabajadas=horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return salarioPorHora*horasTrabajadas;
    }
}
