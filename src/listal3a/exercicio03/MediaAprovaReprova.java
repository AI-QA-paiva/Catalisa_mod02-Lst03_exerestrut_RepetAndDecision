package listal3a.exercicio03;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MediaAprovaReprova {
    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);
            System.out.print("Insira a primeira nota do aluno: ");
            double notaA = nota.nextDouble();
            System.out.print("Insira a segunda nota do aluno: ");
            double notaB = nota.nextDouble();

            nota.close();

        double media = (notaA+notaB) / 2;

        if(media == 10) {
            System.out.println("O aluno está Aprovado com Distinção. Ótimo desempenho e Parabéns!");
        }else if(media >=7){
            System.out.println("O aluno está Aprovado. Parabéns!");
        }else {
            System.out.println("O aluno está Reprovado, e repetirá o curso.");
        }

    }

}


// ________________________________
// duvida 1:
//   verificar caso considere com sistematica de arredondamentos:
//      de 0 até 0,5 (incluso) manter nota
//      acima de 0,5 arredondar para nota acima
//
// duvida 2:
//   como fazer algo dinamico como:
//      pedir para informar o numero n total de alunos para ter ideia tamanho do array
//      criar o array equivalente com base em n aluno que nao sei nomes, porem sei o tamanho da turma
//          - ai teremos permitir fazer n-1 < n para ele encerrar o input de nomes
// duvida 3:
//   como faço para exibir todos os nomes de uma unica vez?
//   cada um com o seu resultado da média e status ??
//
//   List <(String)> nomesAluno = new ArrayList<>(String);
//   Map<String,Double> alunos = new HashMap<>();   alunos.put(String,Double);
