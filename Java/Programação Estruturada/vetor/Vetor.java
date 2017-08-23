package vetor;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nome = new String[2]; // criando um array do tipo String de 2 posições

        for (int i = 0; i < nome.length; i++) { // a propriedade length informa o temanho do array
            System.out.print("Digite o " + (i + 1) + " nome: ");
            nome[i] = scan.nextLine();
        }
        System.out.println();

        System.out.println("Os nomes digitados foi: ");
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }
  
       
    }
    
}
