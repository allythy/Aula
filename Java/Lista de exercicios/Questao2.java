package questoes;



import java.util.Scanner;
import javax.swing.JOptionPane;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String prato = JOptionPane.showInputDialog(null,"Informe o nome do Prato: \n\n -Peixe \n -Carne \n\n");

        int calPrato = 0;
        if (prato.equalsIgnoreCase("peixe")) {
            calPrato = 230;
        } else if (prato.equalsIgnoreCase("carne")) {
            calPrato = 300;
        } else {
            JOptionPane.showMessageDialog(null,"Você digitou o nome do prato errado");
        }

        String sobremesa = JOptionPane.showInputDialog(null,"Informe o nome da Sobremesa: \n\n -Sorvete \n -Mousse \n\n");

        int calSobremesa = 0;
        if (sobremesa.equalsIgnoreCase("Sorvete")) {
            calSobremesa = 110;
        } else if (sobremesa.equalsIgnoreCase("Mousse")) {
            calSobremesa = 200;
        } else {
            JOptionPane.showMessageDialog(null,"Você digitou o nome da sobremesa errado");
        }

        String bebida = JOptionPane.showInputDialog(null,"Informe o nome da Bebida: \n\n -Suco \n -Chá \n\n");

        int calBebida = 0;
        if (bebida.equalsIgnoreCase("Suco")) {
            calBebida = 70;
        } else if (bebida.equalsIgnoreCase("Chá")) {
            calBebida = 20;
        } else {
            JOptionPane.showMessageDialog(null,"Você digitou o nome da bebida errado");
        }

        JOptionPane.showMessageDialog(null,"Sua comida tem : " + (calPrato + calSobremesa + calBebida) + " calorias\n");

    }

}
