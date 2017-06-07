package questoes;



import javax.swing.JOptionPane;

public class Questao4 {

    public static void main(String[] args) {

        String municipios = JOptionPane.showInputDialog(null, "Informe o nome de Municípios: ");
        int qtdEleitores = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eleitores aptos: "));
        int votosCandidato = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de votos do candidato: "));

        if (qtdEleitores > 20000 && votosCandidato <= (20000 * 0.5)) {
            JOptionPane.showMessageDialog(null, "O Município de " + municipios + " Vai ter Segundo Turnmo");
        } else {
            JOptionPane.showMessageDialog(null, "O Município de: " + municipios + " Não vai ter segundo turnmo");

        }

    }
}
