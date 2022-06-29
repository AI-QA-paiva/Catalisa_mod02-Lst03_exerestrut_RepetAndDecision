package listal3b.exercicio07;

import java.util.Scanner;

public class PrimoOuNaoE {
    public static void main(String[] args) {

        Scanner primo = new Scanner(System.in);

        System.out.println("Escolha um número, digite aqui e verifique se é Primo ou não: ");
        int numQualquer = primo.nextInt();
        primo.close();

        if (numQualquer <= 0){
            System.out.println("Este numero não é valido");
        }else{
            int numero = 0;
            for (int i = 1; i <= numQualquer; i++) {
                if (numQualquer % i == 0) {
                    numero++;
                }
            }

            if (numero == 2) {
                System.out.println("O número " + numQualquer + " é primo.");

            } else {
                System.out.println("O número " + numQualquer + " não é primo.");
            }

        }

    }

}
