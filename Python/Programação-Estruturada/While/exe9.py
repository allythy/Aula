"""
Faça um programa que peça para o usuário
digitar a quantidade de números que ele vai
querer somar e mostre a soma deles.
"""

soma = 0
i = 0

quantidade = int(input("Digite a quantidade: "))
while i < quantidade:
    valor = float(input("Digite um numero: "))
    soma = soma + valor
    i = i + 1
print("A soma dos numeros digitados foi: {}".format(soma))
