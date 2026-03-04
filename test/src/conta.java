public class Conta {

    private int numeroConta;
    private String titular;
    private int agencia;
    private double saldo;

    public Conta(int numeroConta, String titular, int agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

     public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

public boolean depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido: valor deve ser maior que zero.");
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido: valor deve ser maior que zero.");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }

        saldo -= valor;
        return true;
    }

   public boolean transferir(Conta destino, double valor) {

    if (destino == null) {
        System.out.println("Conta destino inválida.");
        return false;
    }

    if (this == destino) {
        System.out.println("Não é permitido transferir para a mesma conta.");
        return false;
    }

    if (valor <= 0) {
        System.out.println("Transferência inválida: valor deve ser maior que zero.");
        return false;
    }

    if (valor > saldo) {
        System.out.println("Saldo insuficiente para transferência.");
        return false;
    }

    // aqui acontece a transferência
    saldo -= valor;
    destino.saldo += valor;

    return true;
    }

    public void imprimirExtrato() {
        System.out.println("---- EXTRATO ----");
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("-----------------");
    
}
}
