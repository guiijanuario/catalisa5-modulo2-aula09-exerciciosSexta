package ExerciciosEstruturaDeRepeticaoEntregar;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[---------- Calcular fatorial ----------]");
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero <= 2) {
            System.out.println("Digite uma número válido");
        }

        int fatorialSoma = 1;
        if (numero > 2) {
            for (int i = 2; i <= numero; i++) {
                fatorialSoma *= i;
            }
            System.out.println("O fatorial do número " + numero + " é " + fatorialSoma);
        }
    }
}
