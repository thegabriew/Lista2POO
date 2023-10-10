import java.util.Scanner;

public class terceira {

    public static void main (String [] args){

    Scanner ler = new Scanner(System.in);

    double t, v;

    System.out.print("Informe o tempo gasto de viagem: ");
    t = ler.nextDouble();
    System.out.print("Informe a velocidade média: ");
    v = ler.nextDouble();
    
    //Calculando

    double d,l;

    d = t * v;
    l = d / 12;

    System.out.print("A quantidade de litros necessária é " + l);


    }
    
}
