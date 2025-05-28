import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();

        products.add("BMW 320i G20");
        products.add("BMW M2 Competition");
        products.add("Subaru STI");
        products.add("Nissan Silvia S15");
        products.add("Nissan GTR R34 Skyline");

        System.out.println("A lista antes da remoção");
        for (String product : products) {
            System.out.println(product);
        }
        products.remove("BMW 320i G20");

        System.out.println("\nA lista depois da remoção");
        for (String product : products) {
            System.out.println(product);
        }
    }
}


