package ExerciciosEstruturaDeRepeticaoEntregar;



public class Exercicio8 {
    public static void main(String[] args) {


        System.out.println("[---------- Somar os 50 primeiros números Impares ----------]");

        int somaImpares = 0;
        int primeiroNroImpar = 1;
        int quantidadeDeNumerosImpares = 0;

        for (int i = 1; i <= 50; i++){
            somaImpares += primeiroNroImpar;
            quantidadeDeNumerosImpares++;
            primeiroNroImpar +=2;
            System.out.println(i + "ª número impar: " + primeiroNroImpar);

        }

        System.out.println("A soma dos primeiros " + quantidadeDeNumerosImpares + " números ímpares é: " + somaImpares);
    }
}
