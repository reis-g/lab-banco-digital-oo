public class CartaoCredito extends Cartao {
    private double limiteCredito;

    // Construtor
    public CartaoCredito(String numeroCartao, String nomeTitular, double limiteCredito) {
        super(numeroCartao, nomeTitular);
        this.limiteCredito = limiteCredito;
    }

    // Getter e Setter para limite de crédito
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return super.toString() + ", CartaoCredito{" +
                "limiteCredito=" + limiteCredito +
                '}';
    }
}
