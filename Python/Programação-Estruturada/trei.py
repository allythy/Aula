# -*- coding: utf-8 -*-

frase = 'Use software Livre'
frase2 = '   Use Debian  '
"""
Vai imprimir a letra que tá na posição 3,
Lembrando que começamos a contar do zero
"""
print(frase[5])

"""
Vai imprimir a letra que tá na posição 5
menos uma unidade da posição final que você informou.
"""
print(frase[5:9])

"""
Vai imprimir a letra que tá na posição 5 até
a posição 18 pulando 2 posições.
"""
print(frase[5:18:2])

"""
Vair imprimir a letra que tá na posição 0 até
a letra que tá na posição 5. Os dois
"""
print(frase[:5])

"""
Vai imprimir a letra que tá na posição 5
até a letra que tá na ultima posição.
"""
print(frase[5:])

"""
Vai imprimir a letra na posição 2 até
a letra na posição final pulando duas posições.
"""
print(frase[2::2])

"""
A função len mostra a quantidade de caracteres que a string possui.
"""
print(len(frase))

"""
O count vai contar quantas vezes aparecer o carácter ou palavra que
você indicou.
"""
print(frase.count('e'))

"""
Vai mostrar quantas letras 'e' tem dá posição 0 até a 12.
"""
print(frase.count('e', 0, 12))

"""
O find vai mostrar onde a palavra ou carácter começou.
Caso ele não encontre vai mostrar -1.
"""
print(frase.find('livre'))

"""
O replace vai substituir um carácter ou palavra que você indicou
por outra.
"""
print(frase.replace('software', 'programa'))

"""
O upper vai deixar todas as letras maiúsculas.
"""
print(frase.upper())

"""
O lower vai deixar todas as letras minúsculas.
"""
print(frase.lower())

"""
O capitalize vai deixar todos os caracteres minúsculos, deixando apenas
a primeira letra da primiera palavra na sua string maiúscula.
"""
print(frase.capitalize())

"""
O title vai deixar maiúscula a primeira letra de todas as palavra
na sua string, levando em conta o espaço como separador.
"""
print(frase.title())

"""
O strip vai remover o carácter que você indicou como parâmetro no
começo e final da sua string, caso você não informe o parâmetro
ele vai remover os espaços em branco.Também tem o rstrip que vai
remover apenas os espaços a direita(últimos) e lstrip que vai remover
os espeços a esquerda(começo).
"""
print(frase2.strip())

"""
O split vai dividir uma string em uma lista levando em consideração
o carácter delimitador que por padrão é o espaço, mas você pode informar
o carácter delimitador no parâmetro.
"""
print(frase.split())

"""
O join vai fazer a junção de nomes em um lista
"""
lista = ['Use', 'software', 'Livre']
print('-'.join(lista))
