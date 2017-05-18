package sistemarecuros;

import javax.swing.JOptionPane;

public class SistemaRecuros {

    public static void main(String[] args) {

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome o seu cargo:  \n1- Engenheiro \n2- Gerente \n3- Presidente \n\n"));

        switch (opcao) {
            case 1:
                String nome = JOptionPane.showInputDialog(null, "Digite o nome do Engenheiro: ");

        }

    }
}