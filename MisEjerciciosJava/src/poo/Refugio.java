package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Refugio {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animales> animal= new ArrayList<>();

        String continuar;
        do{
            System.out.println("Ingrese el nombre del animal:");
            String nombre=scanner.nextLine();

            System.out.println("Ingrese el tipo de animal:");
            String tipo= scanner.nextLine();

            System.out.println("Ingrese la edad del animal:");
            int edad= scanner.nextInt();

            scanner.nextLine();

            // creamos el objeto segun el tipo
            if(tipo.equalsIgnoreCase("Perro")){
                animal.add(new Perro(nombre, edad));
            }
            else if(tipo.equalsIgnoreCase("Gato")){
                animal.add(new Gato(nombre, edad));
            }
            else{
                System.out.println("El refugio solo accepta perros y gatos de momento");
            }
            

            System.out.println("Desea seguir agregando s/n");
            continuar=scanner.nextLine();
        }while(continuar.equalsIgnoreCase("s"));
        
        for(Animales a : animal ){
            a.mostrarDatos();
            a.hacerSonido();
        }
        
        scanner.close();
    }
}
