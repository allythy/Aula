#include <iostream>
using namespace std;

int main()
{
	float sl;
	
	cout << "Digite o seu sálario " << endl << "R$: ";
	cin >> sl;
	
	if( sl <= 1903.98)
	{
		cout << "Você é isento de IRPF";
	}
	else
	{
	cout <<" Você não é isento do IRPF"	;
	}
}	
