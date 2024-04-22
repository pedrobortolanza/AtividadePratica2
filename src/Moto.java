public class Moto extends Veiculo{
    
    private String tipo;

    public Moto(String marca, String modelo, String tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {

        return super.toString() +
        "\nTipo: " + tipo;
    }
}
