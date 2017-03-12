
package media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        System.out.print("Média dos Alunos");
        
        float nota1, nota2, nota3, operacao;
        
        Scanner media = new Scanner(System.in);
       
        System.out.print("Digite a primeira nota: ");
        nota1 = media.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = media.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = media.nextFloat();
        
        operacao = (nota1 + nota2 + nota3)/3;
        
        if(operacao >= 6 )
            System.out.println("Você passou, Parabéns. Sua nota foi: " + operacao);
        else
            System.out.print("Você não passou, estude mais. Sua nota foi: " + operacao);
    }
    
}
