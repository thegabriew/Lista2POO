import java.util.Scanner;

class primeiro{

    public static void main (String [] args){
    Scanner ler = new Scanner(System.in);

    int a, resultado;

    System.out.print("Digite um número: ");
    a = ler.nextInt();

    System.out.println("Tabuada do " + a);
    for (int i = 1; i<=10; i++ ){

        resultado = a * i;
        System.out.println( a + "x" + i + "=" + resultado);
    }

}
}