public class Veiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo(String tipo, String marca, String modelo, int ano, double preco) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return tipo + " " + marca + " " + modelo + " (" + ano + "), Preço: R$ " + String.format("%.2f", preco);
    }

    /* setters */

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /* getters */

    public int getAno() {
        return ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPreco() {
        return preco;
    }
    public String getTipo() {
        return tipo;
    }
}