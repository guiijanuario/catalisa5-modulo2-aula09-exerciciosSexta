package ExerciciosEstruturaDeRepeticaoEntregar;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[---------- Soma de números positivos ----------]");
        System.out.println("Insira a quantidade de números que vai inseridos:");
        int quantidadeNro = sc.nextInt();

        int somaPares = 0;
        int somaImpar = 0;

        for (int i = 1; i <= quantidadeNro; i++){
            System.out.println("Insira o número " + i + ":");
            int numero = sc.nextInt();
            if (numero % 2 == 0){
                somaPares+=numero;
            } else {
                somaImpar+=numero;
            }
        }
        System.out.println("A soma dos números pares inseridos é: " + somaPares);

    }
}
