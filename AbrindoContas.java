import java.util.Scanner;

public class AbrindoContas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBanco contaBancaria = new ContaBanco(numeroConta,nomeTitular,saldo);

        System.out.println("Informacoes:");
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
        System.out.println(contaBancaria.toString());
    }
}
class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta: " + numero +
                "\nTitular: " + titular +
                "\nSaldo: " + String.format("R$ %.1f",saldo);
    }
}
