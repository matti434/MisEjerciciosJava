package EjerciciosBasicos;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Ingrese el numero:");
        int numero = scanner.nextInt();

        for(int i=1;i<=10;i++){
            int multiplicacion = i*numero;

            System.out.println(numero +" * "+ i +" = "+ multiplicacion);
        }

        scanner.close();
    }
}
