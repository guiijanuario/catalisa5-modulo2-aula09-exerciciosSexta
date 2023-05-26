package ExerciciosEstruturaDeDecisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatar = new DecimalFormat("R$ #,##0.00");

        System.out.println("[----- Calculo de aumento salarial! -----]");
        System.out.println("Digite o salário do colaborador:          ");
        double salario = sc.nextDouble();

        if (salario <= 280) {
            double aumentoDeSalario = (salario * 20) / 100;
            double salarioReajustado = salario + aumentoDeSalario;
            System.out.println("O salário sem reajuste é: " + formatar.format(salario));
            System.out.println("O percentual de aumento é 20% ");
            System.out.println("O valor do aumento salarial é: " + formatar.format(aumentoDeSalario));
            System.out.println("O novo salário do colaborador é: " + formatar.format(salarioReajustado));
        } else if (salario > 280 && salario <= 700) {
            double aumentoDeSalario = (salario * 15) / 100;
            double salarioReajustado = salario + aumentoDeSalario;
            System.out.println("O salário sem reajuste é: " + formatar.format(salario));
            System.out.println("O percentual de aumento é 15% ");
            System.out.println("O valor do aumento salarial é: " + formatar.format(aumentoDeSalario));
            System.out.println("O novo salário do colaborador é: " + formatar.format(salarioReajustado));
        } else if (salario > 700 && salario <= 1500) {
            double aumentoDeSalario = (salario * 10) / 100;
            double salarioReajustado = salario + aumentoDeSalario;
            System.out.println("O salário sem reajuste é: " + formatar.format(salario));
            System.out.println("O percentual de aumento é 10% ");
            System.out.println("O valor do aumento salarial é: " + formatar.format(aumentoDeSalario));
            System.out.println("O novo salário do colaborador é: " + formatar.format(salarioReajustado));
        } else {
            double aumentoDeSalario = (salario * 5) / 100;
            double salarioReajustado = salario + aumentoDeSalario;
            System.out.println("O salário sem reajuste é: " + formatar.format(salario));
            System.out.println("O percentual de aumento é 5% ");
            System.out.println("O valor do aumento salarial é: " + formatar.format(aumentoDeSalario));
            System.out.println("O novo salário do colaborador é: " + formatar.format(salarioReajustado));
        }


    }
}
