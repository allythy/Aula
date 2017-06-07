package questoes;



import javax.swing.JOptionPane;

public class Questao8 {

    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Informe o seu sexo:");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Infome a sua altura:"));

        if (sexo.equalsIgnoreCase("masculino")) 
        {
            double formula = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, "O peso ideal para sua altura é: " + formula);
        } else if(sexo.equalsIgnoreCase("feminimo")) 
        {
            double formula = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, "O peso ideal para sua altura é: " + formula);
        }else
        {
            JOptionPane.showMessageDialog(null,"Digite o sexo correto:");
        }
    }

}
