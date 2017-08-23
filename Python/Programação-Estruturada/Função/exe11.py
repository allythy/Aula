"""
Faça uma função para resolver o Coeficiente binomial.
Fórmula: n! / k!(n -k)!
"""


def fatorial(x):
    fat = 1
    while (x > 1):
        fat = fat * x
        x = x - 1
    return fat


def formula(n, k):
    return fatorial(n) / (fatorial(k) * fatorial(n-k))


n = int(input('Digite o valor de n: '))
k = int(input('Digite o valor de k: '))

if n < k:
    print('N não pode ser menor de K')
else:
    print('Resultado: {}'.format(formula(n, k)))
