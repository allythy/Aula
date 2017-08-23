#include <iostream>
#include <math.h>
using namespace std;

// Tem que chama a função antes do main
void texto(); // não retorna um valor
int soma(float n1, float n2);


int main (void) 
{
	
	float valor1, valor2;
	
	for(int i = 1; i <=10; i++)
	{texto();}
	
	cout << "Digite um número: " ;
	cin >> valor1;
	cout << "Digite outro número: " ;
	cin >> valor2;
	cout << "A soma é: " << soma(valor1,valor2);
}

//função
void texto()
{
	cout << "Pense, e muito\n";	
}

//função
int soma(float n1, float n2)
{
	return (n1+n2);
}

