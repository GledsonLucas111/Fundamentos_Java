package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setTitular("Thayná");
        conta1.setNumero("252301");
        conta1.setSaldo(10.5);

        conta1.sacar(20);
    }
}
