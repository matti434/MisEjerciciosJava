package EjerciciosBasicos;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       // Pedir nombre
       System.out.print("Por favor, ingresa tu nombre: ");
       String nombre = scanner.nextLine();

       // Pedir edad
       System.out.print("Ahora ingresa la edad: ");
       int edad = scanner.nextInt();

       // Mostrar el mensaje personalizado
       System.out.println("Hola "+ nombre + ". Tienes Ma" + edad + " años." );
     
       scanner.close();
    }
}
