package Exercicio4;
import java.util.Scanner;

public class Quatro {
    public static void atv(){
        Scanner teclado = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextDouble();

        System.out.println((n1 == n2) ? "Os numeros sao iguais" : (n1 > n2 ? "O primeiro numero e maior" : "O segundo numero e maior"));
    }
}
