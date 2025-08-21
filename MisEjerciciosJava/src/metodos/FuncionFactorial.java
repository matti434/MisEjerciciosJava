package metodos;

import java.util.Scanner;

public class FuncionFactorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el numero a factorear (0-20):");
            int numero = scanner.nextInt();
            
            long resultado = factorial(numero);
            System.out.println(numero + "! = " + resultado);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Debe ingresar un número válido");
        } finally {
            scanner.close();
        }
    }

    public static long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        if (numero > 20) {
            throw new IllegalArgumentException("El máximo permitido es 20! (2,432,902,008,176,640,000)");
        }
        
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}