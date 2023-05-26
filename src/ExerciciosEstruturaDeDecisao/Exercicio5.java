package ExerciciosEstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[----- Digite o dia da semana -----]");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Dia 1 é Domingo!");
                break;
            case 2:
                System.out.println("Dia 2 é Segunda-feira!");
                break;
            case 3:
                System.out.println("Dia 3 é Terça-feira!");
                break;
            case 4:
                System.out.println("Dia 4 é Quarta-feira!");
                break;
            case 5:
                System.out.println("Dia 5 é Quinta-feira!");
                break;
            case 6:
                System.out.println("Dia 6 é Sexta-feira!");
                break;
            case 7:
                System.out.println("Dia 7 é Sábado!");
                break;
            default:
                System.out.println("Valor inválido!");
                System.out.println("As opções são:");
                System.out.println("1 - Domingo");
                System.out.println("2 - Segunda-feira");
                System.out.println("3 - Terça-feira");
                System.out.println("4 - Quarta-feira");
                System.out.println("5 - Quinta-feira");
                System.out.println("6 - Sexta-feira");
                System.out.println("7 - Sábado");
                break;
        }
    }
}
