package Abstracta.GestionDispositivos;

public class subClaseTelofono extends Dispositivo{

    public subClaseTelofono(String nombre){
        super(nombre);
    }

    public void funcionNueva(){
        System.out.println("Hola funcion nueva");
    }

     @Override
    void encender() {
        setEncendido(true);
        System.out.println("Iniciando sistema operativo..");  
      
    }

    @Override
    void apagar() {
        setEncendido(false);
        System.out.println("Apagando sistema operativo");
    }

}
