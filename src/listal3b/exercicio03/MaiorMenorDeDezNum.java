package listal3b.exercicio03;

import java.util.Scanner;

public class MaiorMenorDeDezNum {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in); // como � uma lista com tamanho definido, optei por usar array

         int total = 10;

        int[] blocoN = new int[total];

        for (int i = 0; i < blocoN.length; i++) {
            System.out.print("Informe o valor na posi��o "+i+" : ");
            blocoN[i] = numero.nextInt();

        }
        int menor = blocoN[0];
        int maior = blocoN[0];

        for (int i = 0; i < blocoN.length; i++) {
            if (blocoN[i]>maior) {
                maior = blocoN[i];
            } else if(blocoN[i]<menor){
                menor = blocoN[i];
            }

        }

        System.out.println();
        System.out.print("Os valores armazenados dentro do Vetor novoNum foram: ");
        for (int i = 0; i < blocoN.length; i++) {
            System.out.print(blocoN[i] + " ");
        }

        System.out.println();
        System.out.println("O menor valor �: "+menor);
        System.out.println("O maior valor �: "+maior);

    }





}
