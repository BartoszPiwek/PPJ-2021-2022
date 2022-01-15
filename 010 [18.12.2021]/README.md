# PPJ ćwiczenia 9

> niestacjonarne 18 Grudnia 2021

## 1.

Utwórz klasę `Person` z prywatnym polem `String name` i dziedziczącą po niej klasę `Welder` z polam `jobSeniority`. Utwórz w obu klasach metodę `String getString()`, która wykorzystując słowo kluczowe `super` zwróci ciąg znaków zawierający wszystkie informacje zawarte w obiekcie tej klasy.

## 2.

Zadeklaruj klasę Jam zawierającą prywatne pola:

- String taste,
- double weight

Utwórz konstruktory przyjmujące jako parametry zmienne:

- (String taste, double weight),
- (double weight),
- (String taste)

Dostarczone parametry konstruktorów powinny zainicjalizować pola klasy. W przypadku gdy konstruktor nie dostarcza niezbędnego parametru należy przyjąć, że pole `taste` musi przyjąć wartość `No name`, natomiast `weight – 100.0`.

Przedstaw wykorzystanie wszystkich konstruktorów tworząc obiekty reprezentujące trzy rodzaje dżemów.

Uwaga: należy założyć, że tylko konstruktor z dwoma parametrami może przypisać
wartości polom klasy.

## 3.

Utwórz klasę `Tree` z polami `boolean alwaysGreen`, `int hight` oraz `String crossSection`, następnie zaimplementuj konstruktory inicjujące pola i metodę `String toString()` zwracającą informacje o drzewie.

## 4.

Utwórz klasę `ConiferTree` dziedziczącą po klasie `Tree`, oraz definiująca pola `int needleQuantity` i `double coneLength`. Następnie przygotuj konstruktor inicjujący wszystkie pola oraz metodę `String toString()` zwracającą informacje o drzewie wraz z wartościami pól opisujących drzewo iglaste.

Utwórz klasę `DeciduousTree` dziedziczącą po klasie `Tree`, oraz definiująca pole `int leavesShape` i metodę S`tring toString()` zwracającą informacje o drzewie.

Utwórz klasę `FruitTree` dziedziczącą po klasie `DeciduousTree`, oraz definiująca pole `String fruitName`, podobnie jak w poprzednich zadaniach uzupełnij klasę o konstruktor i funkcjonalną metodę `toString`.

## 5.

Na koniec utwórz program, który wypełni tablicę `Tree[]` forest drzewami takimi jak:

- sosny,
- modrzewie,
- dęby,
- osiki,
- morelowce
- śliwy

Wykorzystując mechanizm polimorfizmu wyświetl wszystkie informacje o wszystkich drzewach.
