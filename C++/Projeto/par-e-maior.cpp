#include <iostream>
using namespace std;

int main()
{
//o número par e menor que 20
	
	int n;

/* 
 * && os dois argumentos tem que ser verdadeiros
 * || apenas um tem que ser verdadeiro
*/
	cout << "Digite um número: ";
	cin >> n;
	
	if(( n % 2 == 0) && n < 20 )
	{
	cout << "Seu número é par e menor que 20 ";
	}
	else
	{
	cout <<"O seu número não é par e nem menor do que vinte";
	}








}
