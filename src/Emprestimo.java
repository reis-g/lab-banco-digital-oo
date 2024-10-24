
public class Emprestimo {
    private double valor;
    private double taxaJuros;
    private int prazoEmMeses;

    // Construtor
    public Emprestimo(double valor, double taxaJuros, int prazoEmMeses) {
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazoEmMeses = prazoEmMeses;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getPrazoEmMeses() {
        return prazoEmMeses;
    }

    public void setPrazoEmMeses(int prazoEmMeses) {
        this.prazoEmMeses = prazoEmMeses;
    }

    // Método para simulação de parcelas
    public void simularParcelas() {
        double valorParcela = (valor * (1 + taxaJuros)) / prazoEmMeses;
        System.out.println("Valor das parcelas: " + valorParcela);
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "valor=" + valor +
                ", taxaJuros=" + taxaJuros +
                ", prazoEmMeses=" + prazoEmMeses +
                '}';
    }
}
