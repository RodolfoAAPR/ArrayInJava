public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        vetor[0] = 8;
        vetor[1] = 4;
        vetor[2] = 8;
        vetor[3] = 3;
        vetor[4] = 0;

        for (int i = 0; i < vetor.length; i++)
            System.out.printf("\nO valor presente no indice %d do vetor é %d.", i, vetor[i]);
    }
}
