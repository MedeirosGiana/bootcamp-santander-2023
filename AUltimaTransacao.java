import java.util.Locale;
import java.util.Scanner;

public class AUltimaTransacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe as entradas: (data,hora,descricao,valor)");
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");
        // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.

        if (partes.length == 4){
            String data = partes[0].trim();
            String hora = partes[1].trim();
            String descricao = partes[2].trim();
            double valor;
            try {
                valor = Double.parseDouble(partes[3].trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.");
                return;
            }
            Transacao transacao = new Transacao(data,hora,descricao,valor);
            transacao.imprimir();
        }
        scanner.close();
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }
}
