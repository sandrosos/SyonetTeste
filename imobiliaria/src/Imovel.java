public class Imovel {
    private double areaImovel;
    private double valorImovel;

    public Imovel(double areaImovel, double valorImovel) {
        this.areaImovel = areaImovel;
        this.valorImovel = valorImovel;
    }

    public double getAreaImovel() {
        return areaImovel;
    }

    public void setAreaImovel(double areaImovel) {
        this.areaImovel = areaImovel;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }
}