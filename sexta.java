import java.util.Scanner;

public class sexta {
    
    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);
      
        int horas, minutos, segundos, ent;

      System.out.print("Digite o tempo em segundos: ");
      ent = ler.nextInt();

      horas = ent / 3600;
      minutos = (ent % 3600) / 60;
      segundos = ent % 60;

      System.out.printf("O evento tem %d horas, %d minutos e %d segundos", horas, minutos, segundos);
      
    }
}
