package metodos;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero:");
        int numero = scanner.nextInt();

        
        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        // 0 y 1 no son primos
        if (numero <= 1)
            return false;

        // 2 es el único primo par
        if (numero == 2)
            return true;

        // Cualquier otro número par no es primo
        if (numero % 2 == 0)
            return false;

        // Verificamos solo divisores impares hasta √n
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
