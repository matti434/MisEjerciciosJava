package miniPyme.src.minipyme;

public class OrdenSanitaria extends OrdenTrabajo {

    private int llaves;
    private int cañerias;

    public OrdenSanitaria() {

    }

    public OrdenSanitaria(int llaves, int cañerias) {
        this.llaves = llaves;
        this.cañerias = cañerias;
    }

    public int getLlaves() {
        return llaves;
    }

    public void setLlaves(int llaves) {
        this.llaves = llaves;
    }

    public int getCañerias() {
        return cañerias;
    }

    public void setCañerias(int cañerias) {
        this.cañerias = cañerias;
    }


    @Override
    int calcularMontoTotal() {
        return llaves+cañerias;
    }

}
