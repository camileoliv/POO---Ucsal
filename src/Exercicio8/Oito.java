package Exercicio8;
import java.util.Scanner;

public class Oito {
    public static void atv (){
        Scanner teclado = new Scanner(System.in);
        int contador = 1, pares = 0, impares = 0, numero;
        double soma = 0, media;

        for (int i = 0; i <= 10; i++){
            System.out.println("Informe o %i numero: "+ contador);
            numero = teclado.nextInt();
            soma += numero;
            if (numero % 2 == 0 ){
                pares++;
            } else {
                impares++;
            }
            contador++;
        }

        media = soma / 10;

        System.out.println("Soma dos numeros: " +soma);
        System.out.println("Media dos numeros: " +media);
        System.out.println("Numeros pares: " +pares);
        System.out.println("Numeros impares: " +impares);

    }
}
