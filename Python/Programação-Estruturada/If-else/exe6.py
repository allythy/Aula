"""
Programa para resolver a equação do do
Segundo Grau
"""
from math import sqrt

a = float(input('Digite o valor de a: '))
b = float(input('Digite o valor de b: '))
c = float(input('Digite o valor de c: '))

if a != 0:
    delta = b**2 - 4*a*c
    if delta < 0:
        print('Não há raízes reais, delta negativo: {}'.format(delta))
    elif delta == 0:
        x = -b / (2*a)
        print('\nDelta: {}'.format(delta))
        print('A equação possui apenas uma raíz: {}'.format(x))
    else:
        x1 = (-b + sqrt(delta)) / (2*a)
        x2 = (-b - sqrt(delta)) / (2*a)
        print('\nDelta: {}'.format(delta))
        print('As raízes da sua equação são: {} e {}'.format(x1, x2))
else:
    print('Não tem raíz, valor de "a" menor que zero')
