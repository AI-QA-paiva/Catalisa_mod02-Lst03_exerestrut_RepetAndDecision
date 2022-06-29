package listal3a.exercicio01;

import java.util.Scanner;

public class MaiorDeDoisNumeros {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

            System.out.print("Informe o primeiro número: ");
            double numeroA = input.nextDouble();
            System.out.print("Informe o segundo número: ");
            double numeroB = input.nextDouble();

            input.close();

        if(numeroA == numeroB){
            System.out.println("números inseridos são exatamente iguais!");
        }else if(numeroA > numeroB){
            System.out.println("O número maior é: "+ numeroA);
        }else {
            System.out.println("O número maior é: "+ numeroB);
        }
    }

}
