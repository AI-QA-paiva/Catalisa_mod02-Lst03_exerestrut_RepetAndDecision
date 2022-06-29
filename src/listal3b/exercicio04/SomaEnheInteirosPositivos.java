package listal3b.exercicio04;

import java.util.Scanner;

public class SomaEnheInteirosPositivos {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Quantos numeros inteiros deseja armarzenar? ");
        int qtde = numero.nextInt();
        numero.close();

        int [] novoNum = new int[qtde];

        int soma = 0;
        for (int i = 0; i < novoNum.length; i++) {

                System.out.print("Insira o valor que deseja armazenar na posição " + i + " : ");
                novoNum[i] = numero.nextInt();
                while (novoNum[i] < 0) {
                    System.out.println("Número inválido, por favor digite número positivo.");
                    novoNum[i] = numero.nextInt();
                }
                soma += novoNum[i];
        }

        System.out.println();
        System.out.print("Os valores armazenados dentro do Vetor novoNum foram: ");
        for (int i = 0; i < novoNum.length; i++) {
            System.out.print(novoNum[i] + " ");
        }
        System.out.println();
        System.out.println("O valor da soma total desses números é: "+soma);

    }

}
