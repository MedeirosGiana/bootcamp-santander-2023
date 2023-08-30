import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
/*
Entrada:
A função deve receber os seguintes parâmetros:

valor_inicial: um número inteiro ou decimal representando o valor inicial do investimento.

taxa_juros: um número decimal representando a taxa de juros anual. Por exemplo, se a taxa for de 5%,
 o valor passado será 0.05.

periodo: um número inteiro representando a quantidade de anos do investimento.

Saída:
A função deve retornar o valor final do investimento após o período determinado, considerando os
 juros compostos. O valor final deve ser arredondado para duas casas decimais.
 */
public class BancoApp {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double valorInicial = scanner.nextDouble();//5000


    double taxaJuros = scanner.nextDouble();//0.08

    int periodo = scanner.nextInt();//5 anos

    double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);


    //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

    System.out.printf("Valor final do investimento: R$ %.2f", valorFinal);

    scanner.close();
   }
}
