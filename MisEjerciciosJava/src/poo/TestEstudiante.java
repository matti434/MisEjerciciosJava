package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEstudiante {
    
    public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);
     ArrayList<Estudiante> estudiantes= new ArrayList<>();

     String continuar;
     do{

         System.out.println("Ingrese el nombre del estudiante:");
         String nombre= scanner.nextLine();
         
         System.out.println("Ingrese la nota:");
         float nota= scanner.nextFloat();
         
         scanner.nextLine();
         //Agregar estudiante al ArrayList
         estudiantes.add(new Estudiante(nombre,nota));
         
         System.out.println("Desea agregar mas estudiantes?s/n");
         continuar=scanner.nextLine();
         

        }while(continuar.equalsIgnoreCase("s"));
        
        System.out.println("Mostrar todos los estudiantes");
        for(Estudiante est: estudiantes){
            est.aprobado();
        }
        scanner.close();
    }
}
