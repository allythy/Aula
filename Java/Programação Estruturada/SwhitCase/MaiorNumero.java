package maiornumero;

import javax.swing.JOptionPane;

/**
 *
 * @author allythy
 */
public class MaiorNumero {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro número: "));

        if (num1 > num2 && num1 > num3) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior " + num1);
        } else if (num2 > num1 && num2 > num3) {
            JOptionPane.showMessageDialog(null, "O segundo número é maior " + num2);
        } else if (num3 > num1 && num3 > num2) {
            JOptionPane.showMessageDialog(null, "O terceiro número é maior " + num3);
        }
    }

}
