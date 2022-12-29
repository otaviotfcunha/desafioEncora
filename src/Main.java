import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double valorInicial;
        Scanner stdio = new Scanner( System.in );

        //Recebe o valor desejado
        System.out.print("Digite o valor que deseja calcular: ");
        valorInicial = stdio.nextInt();
        stdio.nextLine();

        //Faz o calculo
        MakeChanges.makeChange(valorInicial);
    }

}