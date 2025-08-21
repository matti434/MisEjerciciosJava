package poo;

public class Perro extends Animales{

    public Perro(String nombre, int edad){
      super(nombre,"Perro",edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre()+" dice: ¡Guau guau!");
    }
    
}
