import java.util.Locale;
import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        System.out.print("Informe o Saldo: ");
        double saldoAtual = sc.nextDouble();
        System.out.print("Informe o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        System.out.print("Quato deseja sacar: ");
        double valorSaque = sc.nextDouble();

        saldoAtual += valorDeposito - valorSaque;
        System.out.println(String.format("Saldo atualizado na conta: %.1f", saldoAtual));
        sc.close();
    }
}
