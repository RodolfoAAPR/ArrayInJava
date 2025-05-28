import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            sum += numbers[i];
        }
        System.out.print("O valor total da soma é " + sum);
    }
}