import random

def deck():
    lista = [2,3,4,5,6,7,8,9,10,'J','D','K','A']
    lista2 = ['c','d','h','s' ]
    wynik = list()
    for i in lista:
        for x in lista2:
            t = (i,x)
            wynik.append((t))
    return wynik


def shuffledeck(wynik):
   
    random.shuffle(wynik)
    return wynik
    
    
def deal(deck, n):
    lista_win = list()
    for ii in range(n):
        lista_temp = []
        for x in range(5):
            lista_temp.append(deck.pop())
        lista_win.append("Gracz :")
        lista_win.append(ii)
        lista_win.append(lista_temp)
    return lista_win
