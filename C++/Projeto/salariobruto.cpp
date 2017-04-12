#include <iostream>
using namespace std;

int main(void)
{

	float sb,sl,inss;
	
	cout <<"Digite o seu Sálario Bruto: ";
	cin >> sb;
	
	if(sb <=1556.94)
	{
	sl=sb*0.08;	
	}
	
		
	if(sb >= 1556.95 || sb <= 2594.92)
	{
	sl=sb*0.09;	
	}

	if(sb >= 2594.93 || sb <= 5189.82)
	{
	sl=sb*0.11;	
	}
	
	if(sb >=5189.83)
	{
	sl=sb-570.57;	
	}

	inss=sb-sl;
	
	cout << "Salário Bruto: " << sb << endl << "Salário Líquido: " << sl << endl << "Desconto: " << inss << endl;






}
