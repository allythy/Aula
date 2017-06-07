package questoes;

import javax.swing.JOptionPane;

public class Questao10 {

    public static void main(String[] args) {
        int A = 0, E = 0, I = 0, O = 0, U = 0;

        String texto = JOptionPane.showInputDialog("Digite alguma palavra ou frase:");

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                A++;
            }
            if (texto.charAt(i) == 'e' || texto.charAt(i) == 'E') {
                E++;
            }
            if (texto.charAt(i) == 'i' || texto.charAt(i) == 'I') {
                I++;
            }
            if (texto.charAt(i) == 'o' || texto.charAt(i) == 'O') {
                O++;
            }
            if (texto.charAt(i) == 'u' || texto.charAt(i) == 'U') {
                U++;
            }

        }
        JOptionPane.showMessageDialog(null, "O texto digitado foi, " + texto + " ele possui: " + "\n\nVogal A: " + A + "\nVogal E: " + E + "\nVogal I: " + I + "\nVogal O: " + O + "\nVogal U: " + U);

    }
}
