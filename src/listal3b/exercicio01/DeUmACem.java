package listal3b.exercicio01;

import java.util.Scanner;

public class DeUmACem {

    public static void main(String[] args) {

        // metodo de repetição For a partir da definição de uma variavel tipo int de nome centenas iniciando do 1;
            int [] centenas = new int[101];
            for (int i = 1; i < 101; i++) {
                System.out.print(i + " ");
            }
            System.out.println("aqui verificando: "+centenas[2]);
            System.out.println();
            System.out.println();

   // public static void main(String[] args) { não precisa repetir pois ja existe um

        // metodo de repetição While a partir da definição de uma variavel tipo int de nome contador iniciando do 1;
             int contador = 1;
             while (contador < centenas.length) {
                 System.out.print(contador + " ");
                 contador++;
            }
    }
}
