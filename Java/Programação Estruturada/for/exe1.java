package pkgfor;

import javax.swing.JOptionPane;

/**
 *
 * @author allythy
 */
public class For {

    /*
    Faça um programa que leia 5 números
    e informe o mairo
     */
    public static void main(String[] args) {
        
        double maior = Integer.MIN_VALUE;
        double numero;

        for (int i = 0; i < 5; i++) {
            numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digte um número: "));
           
            if(numero > maior){
               maior = numero;
            }

        }JOptionPane.showMessageDialog(null,"O maior número é: " + maior);
    }

}
