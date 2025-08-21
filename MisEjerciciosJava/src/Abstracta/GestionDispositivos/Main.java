package Abstracta.GestionDispositivos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dispositivo dispositivo = null;

        System.out.println("¿Qué dispositivo quieres crear?");
        System.out.println("1. Teléfono");
        System.out.println("2. Televisor");
        System.out.print("Elige (1 o 2): ");
        int tipoDispositivo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingresa el nombre del dispositivo");
        String nombre = scanner.nextLine();

        if (tipoDispositivo == 1) {
            dispositivo = new subClaseTelofono(nombre);
            System.out.println("Su telefono tiene de nombre: " + nombre);
        } else if (tipoDispositivo == 2) {
            dispositivo = new subClaseTv(nombre);
            System.out.println("Su televisor tiene de nombre: " + nombre);
        }

        System.out.println(
                "Desea encender o apagar el equipo? 0-para salir - 1 para prender - 2 para apagar - 3 para mostrar estado");
        int opciones = scanner.nextInt();

        do {
            switch (opciones) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    dispositivo.encender();
                    break;
                case 2:
                    dispositivo.apagar();
                    break;
                case 3:
                    dispositivo.mostrarEstado();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println(
                    "Desea encender o apagar el equipo? 0-para salir - 1 para prender - 2 para apagar - 3 para mostrar estado");
            opciones = scanner.nextInt();
        } while (opciones != 0);

    
        if (dispositivo instanceof subClaseTelofono) {
            System.out.println("Es de la clase telefono");
            subClaseTelofono telefono = (subClaseTelofono) dispositivo;
            telefono.funcionNueva();
        }
        if (dispositivo instanceof subClaseTv) {
            System.out.println("Es de la clase televisor");
            subClaseTv television = (subClaseTv) dispositivo;
            television.OtraFuncion();
            
        }

        scanner.close();
    }
}
