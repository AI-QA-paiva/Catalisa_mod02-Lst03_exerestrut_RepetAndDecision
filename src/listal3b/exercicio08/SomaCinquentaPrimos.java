package listal3b.exercicio08;



public class SomaCinquentaPrimos {

    public static void main(String[] args) {

        int somatorio = 0;

        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                somatorio += i;
            }

        }

        System.out.println();
        System.out.println("A soma dos números ímpares neste intevalo é de: "+somatorio);

    }

}
