package conta;

public class Conta {

    private double saldo;

    public void debito(double valor) throws SaldoInsuficienteExpetion { // função

        if (valor < 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        } else if (saldo - valor < 0) {
            throw new SaldoInsuficienteExpetion("Saldo insuficiente. Seu saldo é: " + saldo);
        } else {
            saldo -= valor;
        }

    }

    public void credito(double valor) { // função
        if (valor < 0) {
            throw new IllegalArgumentException("Valor do credito deve ser maior que zero");
        } else {
            saldo += valor;
        }

    }

    public double getSaldo() {
        return saldo;
    }

}
