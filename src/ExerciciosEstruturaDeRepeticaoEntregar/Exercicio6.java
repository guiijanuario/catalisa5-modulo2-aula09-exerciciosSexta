package ExerciciosEstruturaDeRepeticaoEntregar;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[---------- Soma de números Impares ----------]");
        System.out.println("Insira o valor Inicial: ");
        int valorInicial = sc.nextInt();
        System.out.println("Insira o valor Final: ");
        int valorFinal = sc.nextInt();

        if (valorInicial > valorFinal){
            System.out.println("Intervalo de valores inválido");
        }

        int somaImpar = 0;

        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 != 0) {
                somaImpar += i;
            }
        }

        System.out.println("A soma dos números ímpares no intervalo é: " + somaImpar);

    }
}
