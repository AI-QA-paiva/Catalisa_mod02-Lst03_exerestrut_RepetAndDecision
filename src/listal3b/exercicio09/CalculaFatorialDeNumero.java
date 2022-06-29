package listal3b.exercicio09;

import java.util.Scanner;

public class CalculaFatorialDeNumero {

    public static void main(String[] args) {

        Scanner numeroFator = new Scanner(System.in);

        System.out.println("Por favor informe o numero fatorial: ");
        int valor = numeroFator.nextInt();


        int contador = valor;
        int resultado = 1;

        while (contador > 1) {
            resultado *= contador;
            contador --;
        }

        System.out.println();
        System.out.println("O resultado do fatorial de "+valor+" é igual a: "+resultado);

    }

}
