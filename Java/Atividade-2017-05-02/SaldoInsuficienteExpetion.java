package conta;

public class SaldoInsuficienteExpetion extends Exception {

    public SaldoInsuficienteExpetion() {

        super("Falta de saldo para está operação");
    }

    public SaldoInsuficienteExpetion(String mensagem) {

        super(mensagem);
    }

}
