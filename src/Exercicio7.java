import java.util.HashMap;
import java.util.Map;

public class Exercicio7 {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleData = new HashMap<>();

        peopleData.put("Rodolfo", 22);
        peopleData.put("Isadora", 22);
        peopleData.put("Adriana", 50);
        peopleData.put("Rafaela", 29);
        peopleData.put("Patrícia", 52);
        peopleData.put("Gilberto", 44);

        for (Map.Entry<String, Integer> entry: peopleData.entrySet()){
            System.out.println("O nome é " + entry.getKey() + " e a idade é " + entry.getValue());
        }
    }
}