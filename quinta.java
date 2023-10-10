import java.util.Scanner;

public class quinta {
    
    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);
        int idade, meses, dias, anos;

        System.out.println("Insira sua idade em: ");
        System.out.print("Anos: ");
        anos = ler.nextInt();
        System.out.print("Meses: ");
        meses = ler.nextInt();
        System.out.print("Dias: ");
        dias = ler.nextInt();

        int resultado;

        resultado = (anos * 365) + (meses * 30) + dias;

      System.out.printf("Sua idade em dias é: %d", resultado);
      
    }
}
