public class App {
    public static void main(String[] args) throws Exception {

        conta conta2 = new conta();

        conta2.titular = "Gustavo";
        conta2.numeroConta = 1234;
        conta2.agencia = 10;
        conta2.saldo = 1000;

        conta2.depositar(500);
        conta2.sacar(200);

        conta2.mostrarSaldo();
    }
}
