package ExerciciosEstruturaDeRepeticaoEntregar;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[---------- Ver se o número é primo ----------]");
        System.out.println("Insira o número: ");
        int numero = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 1){
                System.out.println("O número " + numero + " é primo!");
            }else {

            }
            // ainda não consegui fazer esse exercício.
        }
    }
}
