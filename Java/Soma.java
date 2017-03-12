package soma;

import java.util.Scanner;
        
public class Soma {

   
    public static void main(String[] args) {
        System.out.println("Soma de  dois númros");
         
        float valor1, valor2, operacao; 
        
        Scanner soma = new Scanner(System.in);
       
        System.out.print("Digite o primeiro número: ");
        valor1 = soma.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        valor2 = soma.nextFloat();
        
        operacao = valor1 + valor2;
        
        System.out.println("A sua soma foi: " + operacao );
                
    }
    
}
