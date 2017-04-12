#include <iostream>
using namespace std;

int main()
{
	int nota;
	
		cout << "Digite sua Nota: ";
		cin >> nota;
		
	do{
		cout << "Numero errado, digite outro numero: ";
		cin >> nota; 
	
	}while(nota >10);
		cout << "Sua nota foi: " << nota;
		
	








}
