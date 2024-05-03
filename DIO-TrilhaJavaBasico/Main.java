public class Main {
    public static void Main(String[] args) {
        // Criando contas corrente e poupança
        ContaCorrente contaCorrente1 = new ContaCorrente(1000.0);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(500.0);

        // Realizando operações
        contaCorrente1.depositar(200.0);
        contaCorrente1.sacar(150.0);

        contaPoupanca1.depositar(300.0);
        contaPoupanca1.sacar(200.0);

        // Transferência entre contas
        contaCorrente1.transferir(contaPoupanca1, 100.0);

        // Exibindo saldos finais
        System.out.println("Saldo Conta Corrente: R$" + contaCorrente1.getSaldo());
        System.out.println("Saldo Conta Poupança: R$" + contaPoupanca1.getSaldo());
    }
}
