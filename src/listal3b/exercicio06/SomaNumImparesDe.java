package listal3b.exercicio06;

import java.util.Scanner;

public class SomaNumImparesDe {

    public static void main(String[] args) {

        Scanner inputUsual = new Scanner(System.in);
            System.out.println("O primeiro n�mero do intervalo �: ");
            int numInicial = inputUsual.nextInt();
            System.out.println("O �ltimo n�mero do intervalo �: ");
            int numFinal = inputUsual.nextInt();
            inputUsual.close();

        int somatorio = 0;

        for (int c = numInicial; c <=numFinal; c++) {
            if(c % 2 == 1){
                somatorio += c;
            }

        }

        System.out.println();
        System.out.println("A soma dos n�meros �mpares neste intevalo � de: "+somatorio);

    }

}

//for (int c = numInicial+1; c < numFinal; c++) {
//            if(c % 2 == 1) {
//                somatorio += c;
//            }