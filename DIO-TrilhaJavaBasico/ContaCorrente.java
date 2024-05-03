public class ContaCorrente implements ContaBancaria {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= this.saldo && destino instanceof ContaCorrente) {
            this.saldo -= valor;
            ((ContaCorrente) destino).depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para Conta Corrente.");
        } else {
            System.out.println("Transferência não permitida.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
