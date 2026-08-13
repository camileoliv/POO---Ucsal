package Exercicio10;
import java.util.Scanner;

public class Dez {
    public static void atv (){
        Scanner teclado = new Scanner (System.in);

        int opcao, n1, n2;
        double soma, subtracao, multiplicacao, divisao;

        do {
            System.out.println("====MENU====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.println("Digite o numero desejado: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o primeiro numero: ");
                    n1 = teclado.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    n2 = teclado.nextInt();

                    soma = n1 + n2;

                    System.out.println("Resultado: "+ soma);
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero: ");
                    n1 = teclado.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    n2 = teclado.nextInt();

                    subtracao = n1 - n2;
                    System.out.println("Resultado: "+ subtracao);
                    break;
                case 3:
                    System.out.println("Digite o primeiro numero: ");
                    n1 = teclado.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    n2 = teclado.nextInt();

                    multiplicacao = n1 * n2;
                    System.out.println("Resultado: "+ multiplicacao);
                    break;
                case 4:
                    System.out.println("Digite o primeiro numero: ");
                    n1 = teclado.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    n2 = teclado.nextInt();

                    divisao = n1 / n2;
                    System.out.println("Resultado: "+ divisao);
                    break;

                default:
                    System.out.println("Invalido!");
                    break;
            }
        } while (opcao != 5);
    }
}
