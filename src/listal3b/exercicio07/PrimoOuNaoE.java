package listal3b.exercicio07;

import java.util.Scanner;

public class PrimoOuNaoE {
    public static void main(String[] args) {

        Scanner primo = new Scanner(System.in);

        System.out.println("Escolha um n�mero, digite aqui e verifique se � Primo ou n�o: ");
        int numQualquer = primo.nextInt();
        primo.close();

        if (numQualquer <= 0){
            System.out.println("Este numero n�o � valido");
        }else{
            int numero = 0;
            for (int i = 1; i <= numQualquer; i++) {
                if (numQualquer % i == 0) {
                    numero++;
                }
            }

            if (numero == 2) {
                System.out.println("O n�mero " + numQualquer + " � primo.");

            } else {
                System.out.println("O n�mero " + numQualquer + " n�o � primo.");
            }

        }

    }

}
