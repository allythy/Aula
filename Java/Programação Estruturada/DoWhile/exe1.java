package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author allythy
 */
public class exe1 {

     /*
    Faça um programa que peça para o usuário digitar 
    um números entre 0 e 10, se ele digitar um número
    fora desse intervalo peça pra ele digitar novamente.
     */

    

    public static void main(String[] args) {

        boolean validador = false;

        do {

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 0 e 10"));

            if (numero >= 0 && numero <= 10) {
                JOptionPane.showMessageDialog(null, "Seu numero é: " + numero);
                validador = true;
            } else {
                JOptionPane.showMessageDialog(null, "Digite o número novamente");
            }

        } while (!validador); // validador == false

    }

}
