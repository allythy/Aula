package questoes;



import javax.swing.JOptionPane;

public class Questao1 {

    public static void main(String[] args) {

        String produto = JOptionPane.showInputDialog(null, "Digite o nome do Produto: ");

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto: "));

        JOptionPane.showMessageDialog(null, "Nome do produto: " + produto + "\n" + "Valor de venda: " + (valor + 20) + "\n");
    }

}
