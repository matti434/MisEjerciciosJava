package arrays_y_bucles;
import java.util.Scanner;

public class SumaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100];
        int contador = 0;
        int suma = 0;

        do {
            System.out.println("Ingrese el numero: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Debe ingresar un numero entero");
                scanner.next();// descarta el valor incorrecto(ej:abc)
                System.out.println("Numero: ");
            }
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            // Verificamos que haya espacio en el array
            if (contador < numeros.length) {
                numeros[contador] = numero;
                suma += numero;
                contador++;
            } else {
                System.out.println("¡Has alcanzado el límite máximo de números!");
                break;
            }

        } while (true);
        // Mostramos los números ingresados
        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nLa suma de los " + contador + " números positivos es: " + suma);
        scanner.close();
    }
}
