"""
Faca um programa que peca para o usuario
digitar alguns numero e mostre a soma deles
mas quando ele digitar o numero zero o programa
precis parar.
"""

valor = 1
soma = 0

while valor != 0:
    valor = float(input("Digite um numero: "))
    soma = soma + valor
print("A soma dos numeros digitados foi: {}".format(soma))
