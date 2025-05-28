import java.util.HashMap;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleData = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String name;

        peopleData.put("Rodolfo", 22);
        peopleData.put("Isadora", 21);
        peopleData.put("Adriana", 50);
        peopleData.put("Rafaela", 29);
        peopleData.put("Patrícia", 52);
        peopleData.put("Gilberto", 44);

        System.out.print("Insira o nome que deseja buscar: ");
        name = scanner.nextLine();

        if (peopleData.containsKey(name)){
            int age = peopleData.get(name);
            System.out.printf("%s está presente na lista e a idade é %d", name, age);
        } else {
            System.out.printf("O nome %s não está presente na lista.", name);
        }
    }
}