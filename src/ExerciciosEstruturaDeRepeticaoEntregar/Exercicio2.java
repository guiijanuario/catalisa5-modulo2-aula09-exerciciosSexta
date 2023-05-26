package ExerciciosEstruturaDeRepeticaoEntregar;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[------ Programa para fazer a média -------]");
        System.out.println("[------ Digite a quantidade de números que você quer fazer a média -------]");
        int qtdNumeros = sc.nextInt();

        int soma = 0;
        int i = 1;

        while (i <= qtdNumeros){
            System.out.println("Digite o numero " + i + ":");
            double numero = sc.nextDouble();
            soma += numero;
            i++;
        }

        double media = (double) soma / qtdNumeros;

        System.out.println("A média é: " + media);
    }
}
