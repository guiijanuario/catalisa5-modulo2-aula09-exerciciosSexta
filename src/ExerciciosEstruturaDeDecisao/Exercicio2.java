package ExerciciosEstruturaDeDecisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("R$ #,##0.00");

        System.out.println("[------- Ver o produto mais barato -------]");
        System.out.println("[----- Digite o preço dos 3 produtos -----]");
        System.out.println("[Digite o 1ª produto:                             ");
        double n1 = sc.nextDouble();
        System.out.println("[Digite o 2ª produto:                             ");
        double n2 = sc.nextDouble();
        System.out.println("[Digite o 3ª produto:                             ");
        double n3 = sc.nextDouble();

        if (n1 < n2 && n1 < n3){
            System.out.println("O produto mais barato tem o valor de " + formatar.format(n1));
        } else if (n2 < n3 && n2 < n1){
            System.out.println("O produto mais barato tem o valor de " + formatar.format(n2));
        } else {
            System.out.println("O produto mais barato tem o valor de " + formatar.format(n3));
        }
    }
}
