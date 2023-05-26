package ExerciciosEstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[------ Imprimir o maior número digitado -------]");
        System.out.println("[-------------- Digite 2 números ---------------]");
        System.out.println("[Digite o 1ª número:                             ");
        int n1 = sc.nextInt();
        System.out.println("[Digite o 2ª número:                             ");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("O maior número digitado é: " + n1);
        } else {
            System.out.println("O maior número digitado é: " + n2);
        }
    }
}
