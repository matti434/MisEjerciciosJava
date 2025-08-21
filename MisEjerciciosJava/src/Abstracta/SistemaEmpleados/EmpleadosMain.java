package Abstracta.SistemaEmpleados;

import java.util.Scanner;

public class EmpleadosMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        // Para empleado completo
        System.out.println("Ingrese el salario base:");
        double salarioBase = scanner.nextDouble();

        // Para empleado por horas
        System.out.println("Ingrese el salario por hora:");
        double salarioPorHora = scanner.nextDouble();

        System.out.println("Ingrese las horas trabajadas:");
        double horasTrabajadas = scanner.nextDouble();

        // Crear empleados con los datos ingresados
        EmpleadoCompleto empleadoCompleto = new EmpleadoCompleto(nombre, salarioBase);
        EmpleadoHora empleadoHora = new EmpleadoHora(nombre, salarioPorHora, horasTrabajadas);

        System.out.println(empleadoCompleto.getNombre() +
                " tiene un sueldo de: " + empleadoCompleto.calcularSalario());

        System.out.println(empleadoHora.getNombre() +
                " tiene un sueldo de: " + empleadoHora.calcularSalario());

        scanner.close();
    }
}
