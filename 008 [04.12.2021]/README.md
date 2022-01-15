# PPJ ćwiczenia 8

> niestacjonarne 04 Grudnia 2021

## 1.

Utwórz statyczną funkcję `splitToDigits` przyjmującą jako argument wartość całkowitą dodatnią i zwracającą jednowymiarową tablicę wartości całkowitych dodatnich.
Celem funkcji będzie utworzenie tablicy o rozmiarze tożsamym z ilością cyfr liczby dostarczonej jako argument, a następnie wypełnienie jej cyframi z jakich składa się
dostarczona liczba.

## 2.

Utwórz statyczną funkcję `isArmstrongNumber` przyjmującą jako argument wartość typu `int` i dostarczającą jako rezultat wartość logiczną. Przyjmij że działanie tej
funkcji będzie adekwatne do nazwy funkcji i będzie sprawdzało czy dostarczona jako argument wartość jest liczbą **Armstronga (narcystyczną)**.

## 3.

Dany jest nagłówek funkcji:

```
public static int[][] calculateSquares (int screenWidth , int screenHeight, int side)
```

przyjmujący jako argumenty odpowiednio: szerokość i wysokość ekranu, oraz długość boku kwadratu. Uzupełnij ciało tej metody algorytmem wyliczającym ile kwadratów o zadanej długości boku można umieścić na ekranie. Następnie wylicz współrzędne (górnego lewego rogu) `x` i `y wszystkich kwadratów i zwróć je w postaci dwu wymiarowej tablicy w której pierwsza kolumna opisuje współrzędne `x`a druga`y`.

## 4.

Metoda `printMonth` przyjmuje jako argumenty `int m` i `int y`, opisujące odpowiednio miesiąc i rok. Uzupełnij ciało tej metody tak aby wyświetlała pełen miesiąc
kalendarza, jak w przykładzie:

```
        1   2   3   4   5
6   7   8   9   10  11  12
13  14  15  16  17  18  19
20  21  22  23  24  25  26
27  28  29  30  31
```

## 5.

Utwórz i przetestuj metodę rekurencyjną, która stwierdzi czy dostarczone w tablicy zmiennych typu `char` słowo jest palindromem.

## 6.

Przekształć metodę sprawdzającą czy tablica `char[]` reprezentuje palindrom w ten sposób, aby na ekranie wypisany został tekst od środka, np. dla słowa `Anna` oczekujemy
`nAan`. Jeżeli palindromem ma nieparzystą ilości znaków, wówczas należy pominąć znak środkowy, zatem dla słowa `kajak` uzyskamy `akka`.
