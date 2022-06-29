package listal3a.exercicio05;

import java.util.Scanner;

public class QualDiaSemana {

    public static void main(String[] args) { //essa linha significa um ponto de entrada, localiza para o java onde o codigo começa; mas nao é obrigatorio sempre, por exemplo para apçicaççoes web;

        Scanner semana = new Scanner(System.in); //aqui cria uma instancia onde o system,in indica que receberar uma entrada vindo do usuario
            System.out.print("Digite numero natural de 1 a 7 e saiba qual o dia da semana equivale: ");
            int diaSemana = semana.nextInt();

            semana.close();

        if (diaSemana == 1) {
            System.out.println("Você digitou: " + diaSemana + ", então o dia da semana é Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Você digitou: " + diaSemana + ", então o dia da semana é Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Você digitou: " + diaSemana + ", então o dia da semana é Terça");
        } else if (diaSemana == 4) {
            System.out.println("Você digitou: " + diaSemana + ", então o dia da semana é Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Você digitou: " + diaSemana + ", então o dia da semana é Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Você digitou: " + diaSemana + ", então o dia da semana é Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Você digitou: " + diaSemana + ", então o dia da semana é Sábado");
        } else {
            System.out.println("Valor inválido, tente novamente");
        }

    }



}
