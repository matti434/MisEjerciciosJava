package arrays_y_bucles;

import java.util.Scanner;

public class BuscarUnArray {
     
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String[] ciudades = {"Buenos Aires", "Cordoba","Mendoza","Tucuman"};

        System.out.println("Ingrese la ciudad:");
        String ciudad= scanner.nextLine();

        boolean encontrada= false;

        for(String cantidadCiudad : ciudades){
           if(cantidadCiudad.equalsIgnoreCase(ciudad)){
              encontrada=true;
              break;
           }
        }

        if(encontrada){
            System.out.println("La ciudad buscada: "+ ciudad + " Esta en la lista");

        }
        else{
        System.out.println("La ciudad buscada: "+ ciudad + " No esta en la lista");
        }

        
        scanner.close();
    }
}

