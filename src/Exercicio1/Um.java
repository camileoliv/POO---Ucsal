package Exercicio1;
import java.util.Scanner;

public class Um {
    public static void atv() {
        Scanner teclado = new Scanner (System.in);

        double n1, n2, soma, sub, multi, divisao;

        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextDouble();

        soma = n1 + n2;
        sub = n1 - n2;
        multi = n1 * n2;
        divisao = n1 / n2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + multi);
        System.out.println("Divisao: " + divisao);
    }
}
