package Exercicio6;
import java.util.Scanner;

public class Seis {
    public static void atv () {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero de 1 a 7: ");
        numero = teclado.nextInt();

        switch (numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
