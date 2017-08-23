"""
Faça um programa que leia um número inteiro
qualquer e mostre na tela sua tabuada.
"""
numero = int(input('Digite um número inteiro: '))
for i in range(11):
    print('{} x {} = {}'.format(numero, i, numero * i))

# o i vai assumir cada número do range
