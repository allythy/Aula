
package vetor;

import java.util.Scanner;

public class Exe2 {
     public static void main(String[] args) {

        /*
        Crie um vetor A com 5 elementos inteiros . Construir um vetor B 
        do mesmo tipo e tamanho e com o s "mesmo" elementos do vetor A
        multiplicado por 2, ou seja B[i] = A[i] * 2
         */
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length]; // array B vai ter o mesmo tamanho do array A(vetorA.length)

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
    
}
