#include <iostream>
#include <stdlib.h>
using namespace std;

int main(void)
{
	int numero; char subir;
	
	do{
	cout << "Digite um número para fazer a multiplicação: ";
	cin >> numero;
	cout << endl;
	
	for(int i=1; i<=10; i++){
	cout << i << " x " << numero << " = " << i*numero << endl;
	}
	
	cout << endl;
	cout << "Vai continuar [S/N]: ";
	cin >> subir;
	system("clear");

	}while(subir == 's');



}
