#include <iostream>
#include <math.h>
using namespace std;

/*
 O vetor sempre começa com o índice zero que é a primeira posição
 e o último tem o índice igual a quatro, nesse caso. O número cinco 
 indica o número de posições que esse vetor vai ter, nesse caso 5. 
 
 sintaxe:
 
 tipo nome []


Array - Palavra do inglês que significa "arranjo"

Vetor - Array de uma única dimensão

Tabela - Array com 2 dimensões

Matriz - Array com 'n' dimensões
 
 
 
 */

int main(void)
{
	int numeros[5];
	
	numeros[0]=13;
	numeros[1]=12;
	numeros[2]=11;
	numeros[3]=10;
	numeros[4]=91;
	
	cout << numeros[0] << endl;
	cout << numeros[1] << endl;
	cout << numeros[2] << endl;
	cout << numeros[3] << endl;
	cout << numeros[4] << endl << endl;

// Percorrendo os Elementos do Array com o FOR

 for(int i=0 ; i <=4 ; i++)
	{
	 cout << numeros[i] << endl;
	}


}
