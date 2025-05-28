import java.util.*;

public class Exercicio9 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>(10000);
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            String name = "Nome" + i;
            names.add(name);
            map.put(name, rand.nextInt(1000));
        }

        long timeOne = System.currentTimeMillis();

        for (String name : names) {
            if (Objects.equals(name, "Nome9999")) {
                long timeTwo = System.currentTimeMillis();
                System.out.printf("O tempo para encontrar no ArrayList foi de %dms.", timeTwo - timeOne);
            }
        }

        long timeThree = System.currentTimeMillis();
        map.get("Nome9999");
        long timeFour = System.currentTimeMillis();
        System.out.printf("\nO tempo para percorrer o Map foi de %dms.", timeFour - timeThree);
    }
}