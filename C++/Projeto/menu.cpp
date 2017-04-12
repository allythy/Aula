#include <iostream>
using namespace std;

int main()
{
 int n1,n2,op,soma,subt;
 cout <<"Digite um número: ";
 cin >> n1;
 cout << "Digite o segundo número: ";
 cin >> n2;
 cout << "Digite 1 para SOMA e 2 para SUBTRAÇÃO: ";
 cin >> op;
 
 if( op == 1)
 {
	 soma = n1 + n2;
	 cout << "Resultado: " << soma;
 }
 
 if (op ==2)
 {
	subt = n1 - n2;
	cout << "Resuldato: " << subt;
 }
else
{
 cout << " Deixa de ser tapado";
}






}


