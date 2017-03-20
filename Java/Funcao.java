
package funcao;

public class Funcao {

    // Função
    static int soma(int n1, int n2){ 
      int operacao  = n1 +n2;  
      return operacao;
    }        
  
    
    public static void main(String[] args) { 
        
        int resultado = soma(5,3);
        System.out.println("Soma foi:"+ resultado);


    }
    
}
