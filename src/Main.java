
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Maria");
        cliente1.setDataDeNascimento(LocalDate.of(1990, 5, 10));

        ClienteVIP clienteVIP = new ClienteVIP("João VIP", 0.05);

        // Criando contas
        Conta conta1 = new Conta(500);  // Limite de crédito de 500
        Conta conta2 = new Conta(300);  // Limite de crédito de 300

        // Operações
        conta1.depositar(1000);
        conta2.depositar(500);

        // Transferência entre contas
        conta1.transferir(conta2, 200);

        // Simulação de empréstimo
        Emprestimo emprestimo = new Emprestimo(10000, 0.02, 12);
        emprestimo.simularParcelas();

        // Exibindo informações
        System.out.println(cliente1);
        System.out.println(clienteVIP);
        System.out.println(conta1);
        System.out.println(conta2);
    }
}
