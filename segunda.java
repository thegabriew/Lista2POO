import java.util.Scanner;


public class segunda {

    public static void main (String [] args){
        
        Scanner ler = new Scanner(System.in);

        int c,f;
        System.out.println("Conversor de Celsius para Fahrenheit");        
        System.out.print("Insira um valor: ");
        c = ler.nextInt();

        f = (9*c + 160)/5;

        System.out.println(c + "em Fahrenheit é "+ f);


    }
}
