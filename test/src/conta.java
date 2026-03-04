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

}
