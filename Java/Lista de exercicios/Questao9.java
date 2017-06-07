package questoes;



import javax.swing.JOptionPane;

public class Questao9 {

    public static void main(String[] args) {

        double indice = Double.parseDouble(JOptionPane.showInputDialog("Infome o índice de poluição da sua Empresa, que pode variar de 0.05 até 0.25"));
        if (indice <= 0.25) {
            JOptionPane.showMessageDialog(null, "Índice de poluição dentro dos padrões aceitáveis");
        } else if (indice > 0.25 && indice <= 0.3) {
            JOptionPane.showMessageDialog(null, "A sua Empresa está no 1º grupo de poluição");
        } else if (indice > 0.3 && indice <= 0.4) {
            JOptionPane.showMessageDialog(null, "A sua Empresa está no grupo 1º e 2º de poluição");
        } else {
            JOptionPane.showMessageDialog(null, "\"A sua Empresa está no grupo 1º, 2º e 3º de poluição");
        }

    }

}
