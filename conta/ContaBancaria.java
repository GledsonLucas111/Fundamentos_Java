package conta;

public class ContaBancaria {

    private String titular;
    private String numero;
    private double saldo;

    public ContaBancaria() {
        saldo = 0.0;
    }
    //GETTERS E SETTERS

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void depositar (double valor){
        if(valor > 0) {
            saldo+=valor;
            System.out.println("O valor depositado foi R$: " + valor + " seu saldo agora é: " + saldo);
        }else { 
            System.out.println("Valor inserido é invalido.");
        }
    }
    
    void sacar(double valor) {
        if(valor > 0 && valor <= saldo){
            saldo-=valor;
            System.out.println("Sacado com sucesso. Seu saldo atual é: " + saldo);
        }else {
            System.out.println("Valor inserido para o saque é invalido.");
        }
    }

}
