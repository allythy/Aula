package questoes;



import javax.swing.JOptionPane;

public class Questao7 {

    public static void main(String[] args) {
        double produto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));

        if (produto < 20) {
            produto = produto * 1.45;
            JOptionPane.showMessageDialog(null, "Valor da venda do produto: R$ " + produto);
        } else {
            produto = produto * 1.3;
            JOptionPane.showMessageDialog(null, "Valor da venda do produto: R$ " + produto);
        }

    }

}
