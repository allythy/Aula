""""
Crie um algoritomo que leia um número e mostre
o seu dobro, triblo e raiz quadrada.
"""
from math import sqrt

numero = int(input('Digite um núemro: '))

dobro = numero * 2
triblo = numero * 3
raiz = sqrt(numero)

print('O dobro de {} \ntriblo {} \nraiz {}'.format(dobro, triblo, raiz))
