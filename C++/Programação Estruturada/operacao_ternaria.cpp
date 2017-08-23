#include <iostream>
using namespace std;

/*
 Usanda para escolher entre duas opções(faça isso senão faça aquilo)
 É uma estrutura utilizada para simplificar o código. Estrutura:
 
 <variável> = (condição) ? <valor1> : <valor2>; 
 
 <variável> = 	(true) 	SE <valor1> SENÃO <valor2>; 

 
 */

int main()
{
	int nota1, nota2, operacao;
	string resultado;
	
	cout << "Digite a primeira nota: ";
	cin >> nota1;
	cout << "Digite a segunda nota: ";
	cin >> nota2;
	
	operacao=nota1+nota2;
	
	// >=60 Aprovado
	// < 60 Reprovado
	
	//Aqui estavamos atribuindo o valor direto a variavel
	//(operacao >=60) ? resultado="Aprovado" : resultado="Reprovado";
	
	
	
	resultado=(operacao >=60) ? "Aprovado" : "Reprovado";
	
	cout << "\nSituação do aluno: " << resultado;
	

}
	
