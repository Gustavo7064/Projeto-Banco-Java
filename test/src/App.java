public class App {

    public static void main(String[] args) {

        // 1) Criando o banco
        Banco banco = new Banco("Banco do Gustavo", 123, "Av. Central, 100");

        // 2) Criando contas
        Conta conta1 = new Conta(1001, "Gustavo", 10);
        Conta conta2 = new Conta(1002, "Maria", 10);

        // 3) Adicionando as contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // 4) Operações
        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(conta2, 300);

        // 5) Extratos
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        // 6) Listar contas cadastradas no banco
        banco.listarContas();
    }
}