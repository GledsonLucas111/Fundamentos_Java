package veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro = (Veiculo) new Carro();
        Veiculo moto = (Veiculo) new Moto();
        
        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
    }
}
