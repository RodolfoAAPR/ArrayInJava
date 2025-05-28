import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();

        products.add("BMW 320i G20");
        products.add("BMW M2 Competition");
        products.add("Subaru STI");
        products.add("Nissan Silvia S15");
        products.add("Nissan GTR R34 Skyline");

        System.out.print("Insira o veículo que deseja procurar: ");
        String search = scanner.nextLine();

        if (products.contains(search)) {
            System.out.printf("O veículo %s foi encontrado", search);
        } else {
            System.out.printf("O veículo %s não foi encontrado", search);
        }
        scanner.close();
    }
}
