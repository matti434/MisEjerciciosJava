package poo;

public class Gato extends Animales {
    
    public Gato(String nombre, int edad){
        super(nombre,"Gato",edad);
    }

    @Override
    public void hacerSonido(){
       System.out.println(getNombre() + " dice: ¡Miau miau!");
    }
}
