import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();

        products.add("BMW 320i G20");
        products.add("BMW M2 Competition");
        products.add("Subaru STI");
        products.add("Nissan Silvia S15");
        products.add("Nissan GTR R34 Skyline");

        for (String product : products)
            System.out.println(product);
    }
}
