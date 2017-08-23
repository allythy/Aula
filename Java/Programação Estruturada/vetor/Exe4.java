package vetor;

import java.util.Scanner;

public class Exe4 {

    public static void main(String[] args) {

        /*
        Crie um vetor A com 10 elementos inteiros. Implemente
        um programa que difina e escreva a quantidade de
        elementos armazenados neste vetor que são pares
         */
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (1 + i) + ": ");
            vetorA[i] = scan.nextInt();
        }
        int qtdpares = 0; 
        for(int i = 0; i <vetorA.length; i++){
            if (vetorA[i] % 2 == 0) {
                qtdpares++;
            }
        }System.out.println("Você tem " + qtdpares + " números pares");
        
    }
}
