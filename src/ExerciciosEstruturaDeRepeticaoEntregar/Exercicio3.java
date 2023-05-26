package ExerciciosEstruturaDeRepeticaoEntregar;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menor = 2147483647;
        int maior = -2147483648;

        System.out.println("[------ Digite 10 números inteiros -------]");

        for (int i = 1; i <= 10;i++){
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if(numero < menor){
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("[------ ************************** -------]");
        System.out.println("O menor valor é: " + menor);
        System.out.println("O 1maior valor é: " + maior);
    }
}
