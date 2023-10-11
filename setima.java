import java.util.Scanner;

public class setima {
    
    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);
      
        int saque,nota100,nota50,nota20,nota10,nota5,nota1;
      

        System.out.print("Digite o valor do saque: ");

      if(ler.hasNextInt()){
        saque = ler.nextInt();

        nota100 = saque / 100;
        saque %= 100;
        nota50 = saque/50;
        saque %= 50;
        nota20 = saque /20;
        saque %= 20;
        nota10 = saque/10;
        saque %= 10;
        nota5 = saque/5;
        saque %= 5;
        nota1 = saque/1;
        saque %= 1;
      
      System.out.println("Notas de 100: " + nota100);
      System.out.println("Notas de 50: " + nota50);
      System.out.println("Notas de 20: " + nota20);
      System.out.println("Notas de 10: " + nota10);
      System.out.println("Notas de 5: " + nota5);
      System.out.println("Notas de 1: " + nota1);
      }
      else{
       System.out.println("O sistema não suporta centavos");
      }
      
    }
}
