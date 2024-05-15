package excecoes;

public class Excecoes {
    public static void main(String[] args) {

        try {

        } catch (Exception e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }

    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if(numero < 100) {
            throw new Exception("o numero é menor que 100");
        }
    }
}
