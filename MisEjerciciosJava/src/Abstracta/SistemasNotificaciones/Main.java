package Abstracta.SistemasNotificaciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el destinatario:");
        String destinatario = scanner.nextLine();

        System.out.println("Por favor ingrese el mensaje:");
        String mensaje = scanner.nextLine();

        System.out.println("Desea enviarlo por Email o SMS: ingrese E para email y S para sms");
        String opciones = scanner.nextLine().toLowerCase();

        switch (opciones) {
            case "e":
                subClaseEmain mensajeEmail = new subClaseEmain(destinatario, mensaje);
                mensajeEmail.enviar();
                break;
            case "s":
                subClaseSMS mensajeSMS = new subClaseSMS(destinatario, mensaje);
                mensajeSMS.enviar(); 
                break;
            default:
                System.out.println("El valor ingresado es incorrecto, recuerde ingresar (e) o (s) ");
        }

        scanner.close();
    }
}
