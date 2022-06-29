package listal3a.exercicio03;

import java.util.Scanner;

public class RefazendoMediaAprovaReprova {

    public static void main(String[] args) {
        Scanner entraNotas = new Scanner(System.in);
            double[] notas = new double[2]; // aqui estou e devo declara o tamanho do vetor, nao posso deixar de informar isso
                System.out.print("Insira a primeira nota do aluno: ");
                notas [0] = entraNotas.nextDouble();
                System.out.print("Insira a segunda nota do aluno: ");
                notas [1] = entraNotas.nextDouble();
            //    System.out.print("Insira a terceira nota do aluno: "); //Index 3 out of bounds for length 2
            //   notas [1] = entraNotas.nextInt();
                entraNotas.close();

        double media = (notas[0]+notas[1])/2;
        //double media = (notas[0]+notas[1]+notas[3])/2; --- explicação que notas[3] retornará Index 3 fora dos limites do array que foi [2];;

        System.out.println("A média do aluno obtida nas duas notas é de: "+media);




    }



}
