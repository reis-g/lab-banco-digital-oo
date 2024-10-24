
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected double limiteCredito;  // Novo atributo de limite de crédito

    // Construtor
    public Conta(Cliente cliente, double limiteCredito) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.limiteCredito = limiteCredito;  // Atribuindo o limite de crédito no construtor
    }

    @Override
    public void sacar(double valor) {
        // Modificação: agora inclui o limite de crédito no cálculo
        if (saldo + limiteCredito >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        // Modificação: Verifica saldo disponível antes da transferência
        if (this.saldo + this.limiteCredito >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }

    // Getter para o atributo limite de crédito
    public double getLimiteCredito() {
        return limiteCredito;
    }

    // Setter para o atributo limite de crédito
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para impressão das informações comuns
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Limite de Crédito: %.2f", this.limiteCredito));  // Novo
    }
}
