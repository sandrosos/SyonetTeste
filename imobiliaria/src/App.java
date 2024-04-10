import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Imovel> imoveis = new ArrayList<>();
    public static void main(String[] args) {
        Casa casa = new Casa(100.0, 200000.0, 3, 300.0);
        Casa casa2 = new Casa(120.0, 250000.0, 4, 350.0);
        Casa casa3 = new Casa(90.0, 180000.0, 3, 280.0);
        Apartamento apartamento = new Apartamento(80.0, 150000.0, 2, false);
        Apartamento apartamento2 = new Apartamento(65.0, 120000.0, 1, false);
        Apartamento apartamento3 = new Apartamento(100.0, 200000.0, 3, true);
        Terreno terreno = new Terreno(500.0, 100000.0);
        Terreno terreno2 = new Terreno(800.0, 150000.0);
        Terreno terreno3 = new Terreno(1000.0, 200000.0);

        adicionarImovel(casa);
        adicionarImovel(casa2);
        adicionarImovel(casa3);
        adicionarImovel(apartamento);
        adicionarImovel(apartamento2);
        adicionarImovel(apartamento3);
        adicionarImovel(terreno);
        adicionarImovel(terreno2);
        adicionarImovel(terreno3);

        listarImoveis();
    }

    public static void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public static void listarImoveis() {
        for (Imovel imovel : imoveis) {
            if (imovel instanceof Casa) {
                ((Casa) imovel).listar();
            } else if (imovel instanceof Apartamento) {
                ((Apartamento) imovel).listar();
            } else if (imovel instanceof Terreno) {
                ((Terreno) imovel).listar();
            }
        }
    }
}
