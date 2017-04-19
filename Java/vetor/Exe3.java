package vetor;

import java.util.Scanner;

public class Exe3 {

    public static void main(String[] args) {

        /*
        Crie um vetor A e B cada um com 10 elementos inteiros.
        Construir um vetor C, onde cada elemento de C é a soma
        dos respectivos elementos em A e B, ou seja C[i]= A[i] + B[i]
         */
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor vetorA na posição " + i + ": ");
            vetorA[i] = scan.nextInt();    
        }
        System.out.println();
        
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o valor vetorB na posição " + i + ": ");
            vetorB[i] = scan.nextInt();  
            
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println();
        
         System.out.print("A soma do Vetor A e B  = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

    }
}
