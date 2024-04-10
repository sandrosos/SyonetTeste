import java.util.ArrayList;

public class Revenda {
    private ArrayList<Veiculo> veiculosVendidos;

    public Revenda() {
        veiculosVendidos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosVendidos.add(veiculo);
        System.out.println("Veículo adicionado!");
        System.out.println("");
    }

    public void excluirVeiculo(int index) {
        if (index >= 0 && index < veiculosVendidos.size()) {
            veiculosVendidos.remove(index-1);
            System.out.println("Veículo excluído!");
            System.out.println("");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void editarVeiculo(int index, Veiculo veiculoAtualizado) {
        if (index >= 0 && index < veiculosVendidos.size()) {
            veiculosVendidos.set(index, veiculoAtualizado);
            System.out.println("Veículo editado!");
            System.out.println("");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarVeiculos() {
        if (!veiculosVendidos.isEmpty()) {
            System.out.println("Veículos vendidos:");
            for (int i = 0; i < veiculosVendidos.size(); i++) {
                System.out.println((i+1) + " - " + veiculosVendidos.get(i));
                System.out.println("");
            }
        } else {
            System.out.println("Nenhum veículo vendido.");
        }
    }
}
