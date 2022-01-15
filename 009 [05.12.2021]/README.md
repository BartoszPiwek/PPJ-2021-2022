# PPJ ćwiczenia 9

> niestacjonarne 05 Grudnia 2021

## 1.

Utwórz klasę Person zawierającą publiczne pola:

- String name
- String surname
- int birthyear

Utwórz obiekt klasy `Person` i przechowaj go w zmiennej `person`. Wykorzystaj możliwość dostępu do publicznych pól tej klasy i przypisz im literały lub wartości opisujące
tworzoną osobę.

## 2.

Utwórz klasę `Fruit` z polami `String name` i `double weight`. Nazwa owocu zostanie dostarczona do konstruktora klasy, natomiast waga zostanie zainicjowana losową
wartością z przedziału `0.5 - 0.8`. Następnie utwórz metodę show tak aby wyświetlała informacje o nazwie i wadze owocu.

## 3.

Przyjmij że jeden balon wykonany z lateksu o wielkości 9 cali wypełniony helem o pojemności `0,007m3` jest w stanie udźwignąć 6 gramowy ciężar. Przygotuj klasę
`Balloon` zawierającą:

- domyślny konstruktor - który wylosuje ilość helu jakim wypełniony będzie balon przyjmując że ilość helu może się wahać od `0,005m3 do 0,009m3`
- metoda `getLoad` - wyliczy udźwig balonu, na podstawie założonych danych.

Utwórz klasę Donkey definiującą prywatne pola: `double mass` (wyrażoną w kilogramach) i jednowymiarową tablicę typu `Baloon`. Następnie przygotuj metody:

- void `addBaloon(Baloon)`, która przechowa dodany balon w tablicy
- `boolean isFlying()`, która zwróci wartość `true` gdy jest wystarczająco balonów aby podnieść ciężar osła i `false` w przeciwnym przypadku. Napisz program, który oderwie od ziemi osła i gdy się to już stanie osioł radośnie
  wykrzyknie "Ja latam!!!".

## 4.

Zadbaj aby tablica balonów zdefiniowana w poprzednim zadaniu dopasowywała swój
rozmiar do ilości balonów.

## 5.

Utwórz klasę `Point2D` zawierającą pola opisane jako x i y, oraz:

- rezultatową metodę get dostarczającą trzy elementową tablicę

[x]<br>
[y]<br>
[1]<br>

- bezrezultatową metodę `set` ustalającą współrzędne x, y na podstawie dostarczonej jednowymiarowej tablicy

[x]<br>
[y]<br>
[1]<br>
