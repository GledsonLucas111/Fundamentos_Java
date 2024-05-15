package construtor;

public class Contrutor {
    private int numero;

    public Contrutor(int numero, String texto) {
        this.numero = numero;
        System.out.println("Contrutor com um paramentro criado.");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
