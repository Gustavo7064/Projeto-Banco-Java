  public class conta {

    int numeroConta;
    String titular;
    double saldo;
    int agencia;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
}
