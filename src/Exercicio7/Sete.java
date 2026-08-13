package Exercicio7;
import java.util.Scanner;

public class Sete {
    public static void atv (){
        Scanner teclado = new Scanner (System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
