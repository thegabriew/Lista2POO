import java.util.Scanner;

public class quarta {
    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        double dolar, resultado;
        double real = 5.07;

        System.out.print("Insira um valor em doláres: ");
        dolar = ler.nextDouble();

        resultado = dolar*real;

        System.out.printf("%.2f doláres valem %.2f reais", dolar, resultado );

    }
}