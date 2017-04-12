#include <iostream>
using namespace std;

int main(void)
{
	float n1,n2,r;
	int op;

cout <<"Digite o número: ";
cin >> n1;
cout <<"Digite o número: ";
cin >> n2;
cout << "Digite 1 para soma 2 subtração: ";
cin >> op;

switch(op)
{
	case 1:
		r=n1+n1;
		cout << "Resultado: " << r;
	break;
	
	case 2:
		r=n1-n2;
		cout <<"Resultado: " << r;
	break;

	default:
	cout <<"Operação invalida";




}






}
