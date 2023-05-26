package ExerciciosEstruturaDeDecisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("0.00");

        System.out.println("[----- Digite o preço dos 3 produtos -----]");
        System.out.println("Digite a 1ª nota:                             ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a 2ª nota:                             ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Sua média foi: " + formatar.format(media));
            System.out.println("Aprovado com Distinção");
        } else if (media >=7 && media <10) {
            System.out.println("Sua média foi: " + formatar.format(media));
            System.out.println("Aprovado!");
        }else {
            System.out.println("Sua média foi: " + formatar.format(media));
            System.out.println("Reprovado");
        }

    }
}
