package model;

public abstract class ViagemCorporativa implements IRemarcavel {
    protected String destino;
    protected String ida;
    protected String volta;

    public ViagemCorporativa(String destino, String ida, String volta){
        this.destino = destino;
        this.ida = ida;
        this.volta = volta;
    }

    public String getDestino() {
        return destino;
    }

    public String getIda() {
        return ida;
    }

    public String getVolta() {
        return volta;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public void setVolta(String volta) {
        this.volta = volta;
    }

    public abstract void detalhesViagem();
}
