public class Terreno extends Imovel {
    public Terreno(double areaImovel, double valorImovel) {
        super(areaImovel, valorImovel);
    }

    public void listar() {
        System.out.printf("Terreno: Área do imóvel: %.1f - Valor do imóvel: R$%.1f%n", getAreaImovel(), getValorImovel());
    }
}