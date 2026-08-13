package Exercicio3;

import java.util.Scanner;

public class Tres {
    public static void atv () {
        Scanner teclado = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.println("Digite a sua primeira nota: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        n2 = teclado.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        n3 = teclado.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media == 5 && media < 7) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
    }
}
