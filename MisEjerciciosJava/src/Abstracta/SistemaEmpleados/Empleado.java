package Abstracta.SistemaEmpleados;

public abstract class Empleado {

   private String nombre;
   private double salarioBase;

   public Empleado(){

   }
   public Empleado(String nombre){
      this.nombre=nombre;
   }
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public double getSalarioBase() {
      return salarioBase;
   }

   public void setSalarioBase(double salarioBase) {
      this.salarioBase = salarioBase;
   }

   abstract double calcularSalario();

   void imprimirInformacion() {
      System.out.println("Esta informacion viene de la clase abstracta");
   }
}
