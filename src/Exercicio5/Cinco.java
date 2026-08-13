package Exercicio5;
import java.util.Scanner;

public class Cinco {
    public static void atv (){
        Scanner teclado = new Scanner (System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = teclado.nextInt();

        if (idade >= 0 && idade <= 12){
            System.out.println("Crianca");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
