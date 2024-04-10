public class Casa extends Imovel {
    private int qntComodos;
    private double areaTerreno;

    public Casa(double areaImovel, double valorImovel, int qntComodos, double areaTerreno) {
        super(areaImovel, valorImovel);
        this.qntComodos = qntComodos;
        this.areaTerreno = areaTerreno;
    }

    public void listar() {
        System.out.printf("Casa: Área do imóvel: %.1f - Valor do imóvel: R$%.1f - Cômodos: %d - Área do Terreno: %.1f%n",
                getAreaImovel(), getValorImovel(), qntComodos, areaTerreno);
    }
}