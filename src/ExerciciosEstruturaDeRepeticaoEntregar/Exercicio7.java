package ExerciciosEstruturaDeRepeticaoEntregar;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[---------- Ver se o número é primo ----------]");
        System.out.println("Insira o número: ");
        int numero = sc.nextInt();
        int quantidadeDeDivisor = 0;

        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                quantidadeDeDivisor++;
                System.out.println("O i é:" + i);
            }
        }

        if(quantidadeDeDivisor == 2){
            System.out.println("Ele é um número primo! ");
        } else {
            System.out.println("Ele não é um número primo! ");
        }
    }
}
