package poo;

import java.util.Scanner;

public class TestCuenta {
    
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular");
        String titular=scanner.nextLine();
        
        System.out.println("Ingrese el saldo inicial");
        double saldo=scanner.nextDouble();

        // crea una cuenta con los datos ingresados
        Cuenta cuenta1 = new Cuenta(titular, saldo);

        System.out.println("Ingrese la cantidad que desea depositar");
        double deposito = scanner.nextDouble();
        cuenta1.depositar(deposito);

        System.out.println("Saldo actual: " + cuenta1.getSaldo());

        System.out.println("¿Cuánto desea retirar?");
        double retiro = scanner.nextDouble();
        cuenta1.retirar(retiro);

        System.out.println("Saldo final: " + cuenta1.getSaldo());

        scanner.close();
    }
}
