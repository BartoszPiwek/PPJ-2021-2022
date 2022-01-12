# PPJ cwiczenia 11
> niestacjonarne 19 Grudnia 2021

## 1. 
Zdefiniuj klase **Ciastko** z polami:
- String smak,
- double waga.

Utwórz konstruktor inicjujacy te pola i metode **show()** wyswietlajaca stan wszystkich
pól ciastka.

## 2.
Zdefiniuj klase **FabrykaCiastek** implementujaca statyczna metode **przygotuj**. Metoda
ta bedzie przyjmowac jako parametr wartosc typu **int** okreslajaca jaki rodzaj
ciastek nalezy produkowac, a zwracac obiekt reprezentujacy to ciastko. Jezeli ciastko
okreslonego typu było juz produkowane w tej fabryce, nalezy zwrócic jego obiekt. W
przeciwnym przypadku metoda **przygotuj** poprzedzi zwrócenie obiektu jego fabrykacja.

Utwórz klase **Kontener** zawierajaca:
- pole Ciastko ladunek,
- pole double masaLadunku,
- pole int dniPrzydatnosci,
- konstruktor – inicjujacy pole dopuszczalna masa ładunku,
- metode – załaduj przyjmujaca argumenty:
  - **Ciastko**,
  - **dniPrzydatnosci** - przypisujaca ile dni ciastka moga byc przechowywane;
- metode **sprawdzPrzydatnosc** – zwracajaca wartosc logiczna czy produkt nadaje
sie jeszcze do spozycia.

## 3.
Utwórz klase **MagazynTablicowy** przechowujaca **Kontenery** w piecioelementowej tablicy,
oraz implementujaca metody **przyjmijKontener** i **wydajKontener**, które beda
działały zgodnie z zasada _pierwszy wprowadzony, ostatni wyjety_.

Przedstaw przykład pokazujacy poprawne działanie magazynu.


## 4. 
Stos jest struktura danych, w której kolejne elementy sa odkładane na wierzch stosu
i z wierzchołka stosu sa pobierane w kolejnosci odwrotnej niz były wkładane (LIFO).

Utwórz klase **MagazynListowy** przechowujaca **Kontenery** w liscie realizujacej sto ,
oraz implementujaca metody **przyjmijKontener** i **wydajKontener**, które beda działały
zgodnie z zasada _pierwszy wprowadzony, ostatni wyjety_.

Przedstaw przykład pokazujacy poprawne działanie obu magazynów.

## 5.
Zadbaj aby kontenery przechowywane w magazynie zawsze poukładane były w kolejnosci
ilosci dni przydatnosci produktu.