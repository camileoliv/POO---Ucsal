package Exercicio9;
import java.util.Scanner;

public class Nove {
    public static void atv() {
        Scanner teclado = new Scanner (System.in);

        int numero, fatorial = 1;

        System.out.println("Digite o numero: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial: "+ fatorial);
    }
}
