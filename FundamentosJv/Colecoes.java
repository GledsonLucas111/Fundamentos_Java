package FundamentosJv;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        
        notas.put("Thayna", 10);
        notas.put("Gledson", 8);
        notas.put("Lucas", 5);

        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println("A chave: " + key + " a nota: " + value);
        }
    }
}
