package listal3a.exercicio04;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {

        Scanner salarioAtual = new Scanner(System.in);
        System.out.print("Informe valor de salario: ");
            double salHoje = salarioAtual.nextDouble();

            salarioAtual.close();

        double perctSalVinte = (salHoje * 0.20);
        double perctSalQuinze = (salHoje * 0.15);
        double perctSalDez = (salHoje * 0.10);
        double perctSalCinco = (salHoje * 0.05);

        System.out.printf("O salário total bruto atual é de: R$ %.2f",salHoje);
        if(salHoje <= 280.00) {
                System.out.printf("\nSerá reajustado em 20 por cento que equivale a : R$ %.2f",perctSalVinte);
                System.out.printf("\nO novo salário total bruto será de R$ %.2f",(salHoje+perctSalVinte));
        }else if(salHoje > 280.00 && salHoje <= 700.00){
            System.out.printf("\nSerá reajustado em 15 por cento que equivale a : R$ %.2f",perctSalQuinze);
            System.out.printf("\nO novo salário total bruto será de R$ %.2f",(salHoje+perctSalQuinze));
        }else if(salHoje > 700.00 && salHoje <= 1500.00){
            System.out.printf("\nSerá reajustado em 10 por cento que equivale a : R$ %.2f",perctSalDez);
            System.out.printf("\nO novo salário total bruto será de R$ %.2f",(salHoje+perctSalDez));
        }else {
            System.out.printf("\nSerá reajustado em 5 por cento que equivale a : R$ %.2f",perctSalCinco);
            System.out.printf("\nO novo salário total bruto será de R$ %.2f",(salHoje+perctSalCinco));
        }
    }
}
