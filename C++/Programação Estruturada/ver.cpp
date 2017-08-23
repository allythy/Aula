#include <iostream>
#include <math.h>
using namespace std;

//floor arredonda para baixo
//ceil arredonda para cima

int main()
{
	float num;
	int ARRED;
	
	cout <<" Digite um número: ";
	cin >> num;
	
	if( num >= 0)
	{
	ARRED = ceil(num);
	}
	else 
	{
	ARRED =floor(num);
	}
	cout << "O arredodamento é: " << ARRED;

}

