import java.util.Scanner;

public class oitava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da diária normal: ");
        double diaria = scanner.nextDouble();

        int apart = 42, meses = 7;
        double valorpromocao = 0.22, taxasemprom = 0.4, taxacomprom = 0.7;

        double diariaprom = diaria - (diaria * valorpromocao);

        double arrecadacaosemprom = apart * diaria * taxasemprom;

        double arrecadacaocomprom = apart * diariaprom * taxacomprom * meses;

        double diferenca = arrecadacaocomprom - arrecadacaosemprom;

        System.out.println("(a) O valor da diária no período da promoção é: " + diariaprom);
        System.out.println("(b) O valor médio arrecadado sem a promoção, durante um mês é: " + arrecadacaosemprom);
        System.out.println("(c) O valor médio arrecadado com a promoção, durante um mês é: " + arrecadacaocomprom);
        System.out.println("(d) O lucro ou prejuízo mensal com a promoção é: " + diferenca);

        scanner.close();
    }
}
