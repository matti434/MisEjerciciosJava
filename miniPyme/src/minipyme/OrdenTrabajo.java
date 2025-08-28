package miniPyme.src.minipyme;

public abstract class OrdenTrabajo {
    private int dia;
    private String valorBase;

    public OrdenTrabajo() {

    }

    public OrdenTrabajo(int dia, String valorBase) {
        this.dia=dia;
        this.valorBase = valorBase;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getValorBase() {
        return valorBase;
    }

    public void setValorBase(String valorBase) {
        this.valorBase = valorBase;
    }

    

}
