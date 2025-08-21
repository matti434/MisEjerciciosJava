package EjerciciosBasicos;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = scanner.nextInt();

        if(numero % 2==0){
            System.out.println("El numero: " + numero + " es par");
        }
        else{
             System.out.println("El numero: " + numero + " es impar");
        }

        scanner.close();
    }
}
