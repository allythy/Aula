"""
Faça um programa que peça para o usuário digitar um númetro e
que os números digitas sejem somados.
Ex: Usuário: 123
    Resultado: 6
"""

lista = str(input('Digite o numero: '))
lista = (' '.join(lista))
lista = list(map(int, lista.split()))

soma = 0
for i in lista:
    soma = soma + i
print(soma)
