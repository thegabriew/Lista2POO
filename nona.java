import java.util.Scanner;

public class nona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int entrada = scanner.nextInt();

       if (entrada >= 100 && entrada <= 999) {
           int original = entrada;
           int invertido = 0;

           while (entrada != 0) {
               invertido = invertido * 10 + entrada % 10;
               entrada = entrada / 10;
           }

           System.out.println("Entrada: " + original);
           System.out.println("Valor invertido: " + invertido);
       } else {
           System.out.println("Valor inválido");
       }

    }
}
