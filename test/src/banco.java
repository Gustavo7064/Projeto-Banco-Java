import java.util.ArrayList;

public class Banco {

    private String nomeBanco;
    private int codigoBanco;
    private String endereco;

    private ArrayList<Conta> contas;

    public Banco(String nomeBanco, int codigoBanco, String endereco) {
        this.nomeBanco = nomeBanco;
        this.codigoBanco = codigoBanco;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void adicionarConta(Conta conta) {
        if (conta == null) {
            System.out.println("Não é possível adicionar conta nula.");
            return;
        }

        // evita duplicar número de conta
        if (buscarContaPorNumero(conta.getNumeroConta()) != null) {
            System.out.println("Já existe uma conta com esse número: " + conta.getNumeroConta());
            return;
        }

        contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numeroConta) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == numeroConta) {
                return c;
            }
        }
        return null;
    }

    public void listarContas() {
        System.out.println("=== CONTAS DO BANCO: " + nomeBanco + " ===");
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (Conta c : contas) {
            System.out.println("- " + c.getTitular() +
                    " | Ag: " + c.getAgencia() +
                    " | Conta: " + c.getNumeroConta() +
                    " | Saldo: R$ " + String.format("%.2f", c.getSaldo()));
        }
    }
}
