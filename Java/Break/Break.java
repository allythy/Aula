package pkgbreak;

import java.util.Scanner;

public class Break {

    /*
    Vai pedir para o usuario entrar com um número
    e depois com o limite desse número. Feito isso,
    vai ter que informar o primeiro numero divisivel
    desse intervalo por 2.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.print("Digite o número limite: ");
        int limite = scan.nextInt();

        for (int i = num; i < limite; i++) {
            if (i % 2 == 0) {
                System.out.println("O primeiro número divisivel por 2 é: " + i);
                break; // vai sair do loop quando encontrar o primeiro número divisivel

            }else
                System.out.println("Não tem número");
            //break;
        }

    }

}
