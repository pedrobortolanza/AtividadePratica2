public class Sistema {

    private static void exibirMenu() {
        System.out.println("\nCADASTRO DE VEÍCULOS - MENU\n");
        System.out.println("1) Cadastrar Carro");
        System.out.println("2) Cadastrar Moto");
        System.out.println("3) Cadastrar Bicicleta");
        System.out.println("4) Listar todos os veículos");
        System.out.println("5) Listar Carros");
        System.out.println("6) Listar Motos");
        System.out.println("7) Remover veículo");
        System.out.println("8) Excluir todos os veículos");
        System.out.println("0) Sair");
        System.out.print("\nInforme uma opção:");
    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadastrarCarro();
                break;
            case 2:
                cadastrarMoto();
                break;
            case 3:
                cadastrarBicicleta();
                break;
            case 4:
                listarVeiculos();
                break;
            case 5:
                listarCarros();
                break;
            case 6:
                listarMotos();
                break;
            case 7:
                removerVeiculo();
                break;
            case 8:
                excluirTodosOsVeiculos();
                break;
            case 0:
                System.out.println("\nO Sistema foi finalizado...");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
        System.out.println();
    }

    private static void cadastrarCarro() {
        System.out.println("\nCADASTRO DE CARRO:");
        System.out.print("Marca: ");
        String marca = Console.lerString();
        System.out.print("Modelo: ");
        String modelo = Console.lerString();
        System.out.print("Ano: ");
        int ano = Console.lerInt();
        Carro carro = new Carro(marca, modelo, ano);

        CadastrarVeiculo.cadastrar(carro);

        System.out.println("\nCarro cadastrado com sucesso!");
    }

    private static void cadastrarMoto() {
        System.out.println("\nCADASTRO DE MOTO:");
        System.out.print("Marca: ");
        String marca = Console.lerString();
        System.out.print("Modelo: ");
        String modelo = Console.lerString();
        System.out.print("Tipo de Moto(Street, Sport, Cross): ");
        String tipo = Console.lerString();
        Moto moto = new Moto(marca, modelo, tipo);

        CadastrarVeiculo.cadastrar(moto);

        System.out.println("\nMoto cadastrada com sucesso!");
    }

    private static void cadastrarBicicleta() {
        System.out.println("\nCADASTRO DE BICICLETA:");
        System.out.print("Marca: ");
        String marca = Console.lerString();
        System.out.print("Modelo: ");
        String modelo = Console.lerString();
        System.out.print("Número de Marchas: ");
        int numMarchas = Console.lerInt();
        Bicicleta bicicleta = new Bicicleta(marca, modelo, numMarchas);

        CadastrarVeiculo.cadastrar(bicicleta);

        System.out.println("\nBicicleta cadastrada com sucesso!");
    }

    private static void removerVeiculo() {
        System.out.println("\nREMOVER VEÍCULO");
        System.out.print("Marca do veículo: ");
        String marca = Console.lerString();
        System.out.print("Modelo do veículo: ");
        String modelo = Console.lerString();
    
        for (Veiculo veiculo : CadastrarVeiculo.getListaVeiculos()) {
            if (veiculo.getMarca().equalsIgnoreCase(marca) && veiculo.getModelo().equalsIgnoreCase(modelo)) {
                CadastrarVeiculo.getListaVeiculos().remove(veiculo);
                System.out.println("\nVeículo removido com sucesso!");
                return;
            }
        }

        System.out.println("\nVeículo não encontrado no cadastro.");
    }

    private static void excluirTodosOsVeiculos() {
        CadastrarVeiculo.getListaVeiculos().clear();
        System.out.println("\nTodos os veículos foram excluídos.");
    }

    private static void listarVeiculos() {
        System.out.println("\nLista de Veículos:");
        for (Veiculo veiculo : CadastrarVeiculo.getListaVeiculos()) {
            System.out.println(veiculo);
        }
    }

    private static void listarCarros() {
        System.out.println("\nLista de Carros:");
        for (Veiculo veiculo : CadastrarVeiculo.getListaVeiculos()) {
            if (veiculo instanceof Carro) {
                System.out.println(veiculo);
            }
        }
    }

    private static void listarMotos() {
        System.out.println("\nLista de Motos:");
        for (Veiculo veiculo : CadastrarVeiculo.getListaVeiculos()) {
            if (veiculo instanceof Moto) {
                System.out.println(veiculo);
            }
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }
}