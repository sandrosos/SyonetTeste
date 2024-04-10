public class Apartamento extends Imovel {
    private int qntComodos;
    private boolean salaoFestas;

    public Apartamento(double areaImovel, double valorImovel, int qntComodos, boolean salaoFestas) {
        super(areaImovel, valorImovel);
        this.qntComodos = qntComodos;
        this.salaoFestas = salaoFestas;
    }

    public void listar() {
        System.out.printf("Apartamento: Área do imóvel: %.1f - Valor do imóvel: R$%.1f - Cômodos: %d - Salão de festas: %s%n",
                getAreaImovel(), getValorImovel(), qntComodos, salaoFestas ? "sim" : "não");
    }
}