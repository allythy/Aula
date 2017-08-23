"""
Crie um programa que leia um valor em metros e
exiba a conversão para as outras unidades.
"""

medida = float(input('Digite a distância em metros: '))

km = medida / 1000
hm = medida / 100
dam = medida / 10
dm = medida * 10
cm = medida * 100
mm = medida * 1000

print(' \nQuilômetro(km): {} \nHectômetro(hm): {} \nDecâmetro(dam): {}'.format(km, hm, dam))
print('Metro(m): {} \nDecímetro(dm): {} \nCentímetros(cm): {} \nMilímetro(mm): {} \n'.format(medida, dm, cm, mm))
