# PPJ cwiczenia 13
> niestacjonarne 29 Stycznia 2022

## 1. 
Dany jest ciąg znaków typu String ”A.B.C.D.”, w którym należy przyjąć że w miejsce  wielkich liter mogą wystąpić dowolne znaki alfabetu. Utwórz wyrażenie regularne, opisujące cały ten ciąg.

## 2.
Utwórz wyrażenie regularne, które jednoznacznie opiszę datę w formacie yyyy-mm-dd, gdzie dzień i miesiąc mogą być zapisane w postaci jedno lub dwu znakowej.

## 3.
Utwórz metodę, która wykorzysta wyrażenie regularne do sprawdzenia czy dostarczony ciąg znaków String jest zapisaną wartością heksadecymalną.

## 4.
Dany jest tekst: 
```
wieś w Polsce położona w województwie wielkopolskim, w powiecie kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w województwie konińskim.
```
Wykorzystując wyrażenia regularne zdiagnozuj ile par liczb wystąpiło w tym tekście.

## 5.
Przygotuj w notatniku plik zawierający 31 zer i jedynek opisujących liczbę. Następnie napisz program, który odczyta znak po znaku wartości z pliku i wykorzystując operacje bitowe przechowa je w zmiennej. Następnie zapisz tą zmienną w postaci bajtowej do innego pliku i porównaj wielkości obu plików.

## 6.
Utwórz program, który pozwoli wprowadzać z klawiatury liczbę całkowitą o rozmiarze od 0 do 2^31. Następnie wykorzystując operacje bitowe napisz funkcję, która zamieni podaną wartość na ciąg znaków String reprezentujący liczbę w systemie dwójkowym, czwórkowym, ósemkowym i szesnastkowym.

Rezultatem programu, dla wprowadzonej wartości 127 powinien być:

```
bin     00000000000000000000000001111111
quad    0000000000001333
oct     00000000177
hex     0000007F
```