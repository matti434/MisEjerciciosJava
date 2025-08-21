package poo;

import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre:");
            String nombre=scanner.nextLine();

            System.out.println("Ingrese la edad:");
            int edad=scanner.nextInt();

            scanner.nextLine();

            Persona persona = new Persona(nombre,edad);

            System.out.println(persona.getNombre()+" es mayor de edad? " + persona.esMayorDeEdad());

            System.out.println("desea seguir? (s/n)");
            String respuesta=scanner.nextLine();

            if(respuesta.equalsIgnoreCase("n")){
                System.out.println("Cerrando programa");
                break;
            }
        }
        scanner.close();
    }
}
