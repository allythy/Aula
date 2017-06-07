package questoes;



import javax.swing.JOptionPane;

public class Questao5 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o seu primeiro nome:");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da sua comrpra:"));

        
        if (nome.startsWith("A") || nome.startsWith("a")) {
            valor = valor * 0.7;
            JOptionPane.showMessageDialog(null, "Você ganhou um desconto de 30% \n\n Sua conta ficou: " + valor);
        } else if (nome.startsWith("D") || nome.startsWith("d")) {
            valor = valor * 0.7;
            JOptionPane.showMessageDialog(null, "Você ganhou um desconto de 30% \n\n Sua conta ficou: " + valor);

        } else if (nome.startsWith("M") || nome.startsWith("m")) {
            valor = valor * 0.7;
            JOptionPane.showMessageDialog(null, "Você ganhou um desconto de 30% \n\n Sua conta ficou: " + valor);

        } else if (nome.startsWith("S") || nome.startsWith("s")) {
            valor = valor * 0.7;
            JOptionPane.showMessageDialog(null, "Você ganhou um desconto de 30% \n\n Sua conta ficou: " + valor);
        } else {
            JOptionPane.showMessageDialog(null, "Que pena. Nesta semana o desconto não é para o seu nome, mas continue nos prestigiando que sua vez chegará \n\n" + "Sua conta ficou: " + valor);
        }

    }

}
