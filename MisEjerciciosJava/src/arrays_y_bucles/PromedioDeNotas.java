package arrays_y_bucles;
import java.util.Scanner;

public class PromedioDeNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        int suma = 0;
        
     
        for(int i = 0; i < 5; i++){
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            notas[i] = scanner.nextInt();
            suma += notas[i];
        }
    
        double promedio = (double) suma / notas.length;

        System.out.printf("\nPromedio: %.2f", promedio);
        scanner.close();
    }
}
