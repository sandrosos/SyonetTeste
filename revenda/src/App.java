import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Revenda revenda = new Revenda();
        String opcao = "";

        while (!opcao.equals("5")) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Produtos");
            System.out.println("2 - Excluir Produto");
            System.out.println("3 - Editar Produtos");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Sair");
            System.out.println("");
            
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    //adicionar
                    Veiculo novoVeiculo = capturarDadosVeiculo(scanner);

                    revenda.adicionarVeiculo(novoVeiculo);

                    // revenda.adicionarVeiculo(new Veiculo("carro", "Toyota", "Corolla", 2020, 75000));  tipo(carro, moto e caminhão), marca, modelo, ano e preço de venda
                    break;

                case "2":
                    //excluir
                    revenda.listarVeiculos();

                    System.out.println("Digite o número do veiculo que deseja excluir:");
                    int excluirVeiculo = scanner.nextInt();
                    revenda.excluirVeiculo(excluirVeiculo);

                    scanner.nextLine();
                    break;

                case "3":
                    //editar
                    revenda.listarVeiculos();

                    System.out.println("Digite o número do item que deseja editar:");
                    int indexVeiculo = scanner.nextInt();
                    scanner.nextLine();

                    Veiculo atualizacaoVeiculo = capturarDadosVeiculo(scanner);

                    revenda.editarVeiculo(indexVeiculo - 1, atualizacaoVeiculo);

                    // revenda.editarVeiculo(1, "moto", "Honda", "CBR600RR", 2021, 28000);
                    break;

                case "4":
                    //listar
                    revenda.listarVeiculos();
                    break;

                case "5":
                    //sair
                    System.out.println("Fechando aplicativo.");
                    System.out.println("");
                    break;

                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }


        /* Implementar o gerenciamento da lista dos veículos vendidos na
            revenda, sendo necessário adicionar, excluir e editar as propriedades dos veículos. Os
            veículos possuem tipo(carro, moto e caminhão), marca, modelo, ano e preço de venda e
            todas as informações podem ser editadas. */


        scanner.close();
    }

    public static Veiculo capturarDadosVeiculo(Scanner scanner) {

        System.out.println("Digite o tipo do veiculo:");
        String veiculoTipo = scanner.nextLine();

        System.out.println("Digite a marca do veiculo:");
        String veiculoMarca = scanner.nextLine();

        System.out.println("Digite o modelo do veiculo:");
        String veiculoModelo = scanner.nextLine();

        System.out.println("Digite o ano do veiculo:");
        int veiculoAno = scanner.nextInt();

        System.out.println("Digite o preco do veiculo:");
        double veiculoPreco = scanner.nextDouble();
        scanner.nextLine();
        

        return new Veiculo(veiculoTipo, veiculoMarca, veiculoModelo, veiculoAno, veiculoPreco);
        // return new Veiculo(veiculoTipo, veiculoMarca, veiculoModelo, veiculoAno, veiculoPreco);
        
    }

}
