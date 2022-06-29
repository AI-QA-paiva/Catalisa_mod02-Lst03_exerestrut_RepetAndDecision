package listal3b.exercicio02;

import java.util.Scanner;

public class MediaDeEnheInteiros {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
            System.out.println("Quantos numeros inteiros deseja armarzenar? ");
            int qtde = numero.nextInt();
            //numero.close(); Aqui nao serve, pois limitará o seguimento do código nas proximas linhas, pois encerra scanner neste ponto.

            int [] novoNum = new int[qtde];

            for (int i = 0; i < novoNum.length; i++) {
                System.out.print("Insira o valor que deseja armazenar na posição "+i+" : ");
                    novoNum[i] = numero.nextInt();

            }
            int soma = 0;
            for (int i = 0; i < novoNum.length; i++){
                soma += novoNum[i];
            }

            double media = soma/novoNum.length;

            System.out.print("Os valores armazenados dentro do Vetor novoNum foram: ");
            for (int i = 0; i < novoNum.length; i++) {
                System.out.print(novoNum[i] + " ");
            }

        System.out.println();
        System.out.println("Os valor soma o total de "+soma);
        System.out.println("O valor da média desses valores é igual a  "+media);

    }
}