package Exercicio2;

import java.util.Scanner;

public class Dois {
    public static void atv () {
        Scanner teclado = new Scanner(System.in);

        double numero;

        System.out.println("Digite seu numero: ");
        numero = teclado.nextDouble();

        if (numero % 2 == 0) {
            System.out.print("E par");
        } else {
            System.out.print("E impar");
        }

    }
}
