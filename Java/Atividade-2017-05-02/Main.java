package conta;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta();

        try {
            conta1.credito(100);
            conta1.debito(50);
            conta1.debito(500);

        } catch (SaldoInsuficienteExpetion erro) {

            JOptionPane.showMessageDialog(null, erro);
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, erro);

        } finally {
            JOptionPane.showMessageDialog(null, conta1.getSaldo());

        }

    }

}
