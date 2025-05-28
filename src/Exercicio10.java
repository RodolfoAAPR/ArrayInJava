import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int exit = 0;

        System.out.println("***************************************");
        System.out.println("SEJA BEM VINDO AO CADASTRO DE PRODUTOS!");
        System.out.println("***************************************");

        while (exit != 1) {
            System.out.print("\nNome do Produto: ");
            String productName = scanner.nextLine();
            System.out.print("Insira o código do produto: ");
            int productCode = scanner.nextInt();
            products.put(productName, productCode);
            System.out.println("\nPARA SAIR, PRESSIONE 1");
            System.out.println("CASO DESEJE CADASTRAR MAIS PRODUTOS, PRESSIONE 0");
            System.out.print("Insira a opção desejada: ");
            exit = scanner.nextInt();
            scanner.nextLine();
        }

        int option = 0;

        System.out.println("\n1 - Listar Todos os Produtos.");
        System.out.println("2 - Buscar um Produto pelo código");
        System.out.print("Insira a opção desejada: ");
        option = scanner.nextInt();

        if (option == 1) {
            System.out.println("\n******************************");
            System.out.println("LISTA DE PRODUTOS CADASTRADOS!");
            System.out.println("******************************");
            for (Map.Entry<String, Integer> product : products.entrySet()) {
                System.out.println("\nNome do Produto: " + product.getKey());
                System.out.println("Código do Produto: " + product.getValue());
            }
        } else if (option == 2) {
            System.out.print("\nInsira o código do produto que deseja procurar: ");
            int code = scanner.nextInt();

            boolean found = false;

            for (Map.Entry<String, Integer> product : products.entrySet()) {
                if (product.getValue() == code) {
                    System.out.println("\n*********************");
                    System.out.println("PRODUTO ENCONTRADO!");
                    System.out.println("*********************");
                    System.out.println("\nNome: " + product.getKey());
                    System.out.println("Código: " + product.getValue());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nProduto não encontrado.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
