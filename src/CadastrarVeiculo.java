import java.util.ArrayList;
import java.util.List;


public class CadastrarVeiculo {
    
    private static List<Veiculo> listaVeiculos = new ArrayList<>();


    public static void cadastrar(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
    }

    public static List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public static List<Veiculo> listarCarros() {
        List<Veiculo> carros = new ArrayList<>();
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo instanceof Carro) {
                carros.add(veiculo);
            }
        }
        return carros;
    }

    public static List<Veiculo> listarMotos() {
        List<Veiculo> motos = new ArrayList<>();
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo instanceof Moto) {
                motos.add(veiculo);
            }
        }
        return motos;
    }

    public static List<Veiculo> listarBicicletas() {
        List<Veiculo> bicicletas = new ArrayList<>();
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo instanceof Bicicleta) {
                bicicletas.add(veiculo);
            }
        }
        return bicicletas;
    }
}