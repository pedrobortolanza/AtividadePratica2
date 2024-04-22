public class Bicicleta extends Veiculo{
    private int numMarchas;

    public Bicicleta(String marca, String modelo, int numMarchas) {
        super(marca, modelo);
        this.numMarchas = numMarchas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    @Override
    public String toString() {

        return super.toString() +
        "\nNúmero de Marchas: " + numMarchas;
    }
}
