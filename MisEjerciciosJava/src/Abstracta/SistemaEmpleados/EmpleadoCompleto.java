package Abstracta.SistemaEmpleados;

public class EmpleadoCompleto extends Empleado {

    private double salarioBase;
    private double bono=0.10;
    public EmpleadoCompleto(){
      super();
    }
    
    public EmpleadoCompleto(String nombre,double salarioBase){
        super(nombre);
        this.salarioBase=salarioBase;
    }

    
    @Override
    double calcularSalario() {
        return salarioBase+(salarioBase*bono);
    }

    
}
