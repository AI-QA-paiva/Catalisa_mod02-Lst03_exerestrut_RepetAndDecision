package listal3a.exercicio02;

import java.util.Scanner;

public class QualMaisBarato {

    public static void main(String[] args) {
        // e se A = B = C ??  // e se A = B  ou A = C
        Scanner barato = new Scanner(System.in);
            System.out.print("Informe o valor do produto A em R$: ");
            double precoA = barato.nextDouble();
            System.out.print("Informe o valor do produto B em R$: ");
            double precoB = barato.nextDouble();
            System.out.print("Informe o valor do produto C em R$: ");
            double precoC = barato.nextDouble();

            barato.close();

        if (precoA == precoB && precoA == precoC){
            System.out.println("Preços são exatamente iguais, escolha a seu gosto");
        }else if(precoA < precoB && precoA < precoC) {
            System.out.println("o produto A é o mais barato: R$ "+precoA);
        }else if(precoB < precoA && precoB < precoC){
            System.out.println("O produto B é o mais barato: R$ "+precoB);
        }else if(precoA == precoB && precoA < precoC) {
            System.out.println("O produto A e o produto B tem mesmo valor, e ambos são os mais baratos.\nPortanto, você quem escolhe qual vai querer");
        }else if(precoA == precoC && precoA < precoB) {
            System.out.println("O produto A e o produto C tem mesmo valor, e ambos são os mais baratos.\nPortanto, você quem escolhe qual vai querer");
        }else if(precoB == precoC && precoB < precoA) {
            System.out.println("O produto B e o produto C tem mesmo valor, e ambos são os mais baratos.\nPortanto, você quem escolhe qual vai querer");
        }else {
            System.out.println("O produto C é o mais barato: R$ "+precoC);
        }
    }
}

//verificar possibilidade pedir que o ususario informe qual o produto ele está inserindo o preço
//verificar bug, quando valor A = valor B, e C é maior que A e maior que B
