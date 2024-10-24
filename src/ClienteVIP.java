
public class ClienteVIP extends Cliente {
    private double taxaJurosReduzida;

    // Construtor
    public ClienteVIP(String nome, double taxaJurosReduzida) {
        this.setNome(nome);  // Usando o setter de Cliente
        this.taxaJurosReduzida = taxaJurosReduzida;
    }

    // Getter e Setter para taxa de juros reduzida
    public double getTaxaJurosReduzida() {
        return taxaJurosReduzida;
    }

    public void setTaxaJurosReduzida(double taxaJurosReduzida) {
        this.taxaJurosReduzida = taxaJurosReduzida;
    }

    @Override
    public String toString() {
        return super.toString() + ", ClienteVIP{" +
                "taxaJurosReduzida=" + taxaJurosReduzida +
                '}';
    }
}
