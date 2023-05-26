package ExerciciosEstruturaDeRepeticaoAula;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.println("[------ Programa para somar 5 números -------]");

        for (int i = 1; i <= 5;i++){
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            soma = soma + numero;
        }
        System.out.println("A soma dos 5 números é: " + soma);
    }
}
