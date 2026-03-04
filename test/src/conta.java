public class conta {

    private int numeroConta;
    private String titular;
    private int agencia;
    private double saldo;

    public conta(int numeroConta, String titular, int agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = 0.0;
    }
}
