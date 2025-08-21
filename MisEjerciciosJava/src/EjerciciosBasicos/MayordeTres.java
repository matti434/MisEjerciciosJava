package EjerciciosBasicos;

import java.util.Scanner;

public class MayordeTres {
    
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese el primer numero");
      int numero = scanner.nextInt();

      // uso los scanner.nextLine(); para limpiar el buffer.
      scanner.nextLine();

      System.out.println("Ingrese el primer numero");
      int numero2 = scanner.nextInt();

      scanner.nextLine();

      System.out.println("Ingrese el primer numero");
      int numero3 = scanner.nextInt();


      if(numero>numero2 && numero>numero3){
        System.out.println("El numero: "+ numero+" es el mayor");
      }
      else if(numero2>numero && numero2>numero3){
         System.out.println("El numero: "+ numero2+" es el mayor");
      }else{
         System.out.println("El numero: "+ numero3+" es el mayor");
      }

      scanner.close();
    }

}
