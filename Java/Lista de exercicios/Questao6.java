package questoes;



import javax.swing.JOptionPane;

public class Questao6 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Infome a sua idade: "));

        if (idade >= 1 && idade <= 10) {
           JOptionPane.showMessageDialog(null,nome + " você deverá pagar R$ 160,00");
        } else if (idade > 10 && idade <= 29) {
           JOptionPane.showMessageDialog(null,nome + " você deverá deverá pagar R$ 180,00");
        } else if (idade > 29 && idade <= 45) {
           JOptionPane.showMessageDialog(null,nome + " você deverádeverá pagar R$ 220,00");
        } else if (idade > 45 && idade <= 59) {
           JOptionPane.showMessageDialog(null,nome + " você deverá deverá pagar R$ 380,00");
        } else if (idade > 59 && idade <= 65) {
           JOptionPane.showMessageDialog(null,nome + " você deverá deverá pagar R$ 450,00");
        } else if (idade > 65) {
           JOptionPane.showMessageDialog(null,nome + " você deverá deverá pagar R$ 550,00");
        }else{
            JOptionPane.showMessageDialog(null,"Você informou a idade de forma errada");
        }

    }
}
