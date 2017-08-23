package dowhile;

public class DoWhile {

    public static void main(String[] args) {
        int i = 1;
/*
Primeiro ele vai executar o bloco de código
só depois que ele vai avalia a expressão 
ao contrario do while que primeiro avalia
a expressão pra depois executar o bloco
de código.

*/
        do { // faça
            System.out.println("Contando: " + i); // imprimi o valor na tela
            i++; // incrementar uma unidade


        } while (i < 5); // enquanto 
  
    }
}

