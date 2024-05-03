public interface ContaBancaria {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(ContaBancaria destino, double valor);
}
