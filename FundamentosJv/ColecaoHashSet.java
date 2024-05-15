package FundamentosJv;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // numeros.remove(1);

        for(Integer numero: numeros){
            System.out.println(numero);
        }
        System.out.println(numeros.contains(1));
    }
}
