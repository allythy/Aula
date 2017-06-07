package questoes;



import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int destino = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a Região: \n\n 1- Região Norte \n 2- Região Nordeste \n 3- Região Centro-Oeste \n 4- Região Sul \n"));

        switch (destino) {

            case 1:

                String norte = JOptionPane.showInputDialog(null, "Viajem com Ida e volta ? [S/N]");
                if (norte.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $900,00");
                } else {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $500,00");
                }
                break;

            case 2:
                String nordeste = JOptionPane.showInputDialog(null, "Viajem com Ida e volta ? [S/N]");
                if (nordeste.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $650,00");
                } else {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $3500,00");
                }
                break;

            case 3:
                String centro = JOptionPane.showInputDialog(null, "Viajem com Ida e volta ? [S/N]");
                if (centro.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $750,00");
                } else {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $400,00");
                }
                break;

            case 4:
                String sul = JOptionPane.showInputDialog(null, "Viajem com Ida e volta ? [S/N]");
                if (sul.equalsIgnoreCase("s")) {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $550,00");
                } else {
                    JOptionPane.showMessageDialog(null, "O preço da viajem é: $300,00");
                }
                break;

            default:
                System.out.print("Você escolheu a opçao errada");

        }

    }
}
