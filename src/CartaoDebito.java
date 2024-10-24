
public class CartaoDebito extends Cartao {

    // Construtor
    public CartaoDebito(String numeroCartao, String nomeTitular) {
        super(numeroCartao, nomeTitular);
    }

    @Override
    public String toString() {
        return super.toString() + ", CartaoDebito{}";
    }
}
