# PPJ ćwiczenia 6

> niestacjonarne 7 Listopada 2021

## 1.

Przeanalizuj poniższy program, co jest w nim źle?:

```java
int [] tab;

for (int i=0; i < 5 ; i++)
tab [i] = i ∗ i;
```

## 2.

Przeanalizuj poniższy program i wypisz wyświetlane wartości:

```java
int [] a = {1, 2, 3};
int [] b = {1, 2, 3};
System.out.println(a == b);
```

## 3.

Przeanalizuj poniższy program i wypisz wyświetlane wartości:

```java
int tab [ ] = { 789 , 678 , 567};

for (int i = 0; i < tab.length; i++)
for (int j = i; j < tab.length; j++)
System.out.println(tab[i] − tab[j]);
```

## 4.

Dana jest dziesięcio elementwa tablica zmiennych typu **byte**. Utwórz program wypełniający tą tablicę wartościami wprowadzanymi z klawiatury do wprowadzenia wartości 0. Zadbaj aby wprowadzane były tylko liczby dodatnie, a w przypadku gdy użytkownik wprowadzi liczbę ujemną należy ją zamienić na liczbę dodatnią.

## 5.

Dana jest jednowymiarowa tablica zmiennych typu byte wypełniona elementami o
losowych wartościach z przedziału 0 do 5. Napisz program tworzący dwie tablice
o rozmiarach pozwalających na pomieszczenie odpowiednio: wszystkich elementów
parzystych i nieparzystych.

## 6.

Dana jest poniższa tablica:

```java
int [] arr = {153 , 333 , 370 , 515 , 407 , 80};
```

Utwórz program sprawdzający i wyświetlający, które z tych liczb są liczbami Armstronga (narcystycznymi).

W programie należy wykorzystać tylko narzędzia omówione podczas wykładów i ćwiczeń

## 7.

Dana jest przykładowa tablica:

```java
int[] tab = {1,2,3,4,1,2,3,4}
```

Napisz program wyświetlający na ekranie **true**, gdy wszystkie elementy w tablicy występują przynajmniej dwa razy, lub **false** w przeciwnym przypadku (wpp).

Zadanie zrealizuj bez modyfikowania tablicy oraz bez wykorzystania dodatkowej tablicy pomocniczej.

## 8.

Dana jest dwu wymiarowa tablica zmiennych typu byte o wymiarach 5 × 5, którą
wypełnimy losowymi wartościami z przedziału 0 do 125. Napisz program sprawdzający czy:

- wartości po lewej stronie pionowej osi tej tablicy będą takie same jak wartości po prawej stronie;
- wartości w górnej części poziomej osi tej tablicy będą takie same jak wartości w dolnej części;
- wartości poniżej przekątnej będą takie same jak wartości powyżej przekątnej.
