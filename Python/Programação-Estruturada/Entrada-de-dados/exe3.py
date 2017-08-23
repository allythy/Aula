"""
Desenvolva um programa que leia as duas notas de
um aluno, calcule e mostre a sua média.
"""
nota1 = float(input('Digite a sua primeira nota: '))
nota2 = float(input('Digite a sua seugnda nota: '))

media = (nota1 + nota2) / 2
print('A sua media foi: {:.1f}'.format(media))
