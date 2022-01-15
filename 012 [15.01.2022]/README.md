# PPJ cwiczenia 12
> niestacjonarne 15 Stycznia 2022

## 1. 
Wykorzystując kod programów z ćwiczeń utwórz program, który wypełni tablicę **Tree[] forest** drzewami takimi jak:

- sosny,
- modrzewie,
- dęby,
- osiki,
- morelowce
- śliwy

Wykorzystując mechanizm polimorfizmu wyświetl wszystkie informacje owszystkich drzewach. 

Na koniec zaimplementuj we wszystkich klasach metodę **pickFruit**. Jeżeli drzewo niebędzie drzewem owocowym, przez co nie będzie miało owoców - podniesiony zostanie wyjątek **DrzewoBezOwocoweException**.

## 2.
Utwórz klasę **Alarm** dziedziczącą po klasie **Exception**. Następnie przygotuj klasę **DetektorDymu** zawierającą metodę **sprawdz**, która może podnieść wyjątek **Alarm** jeśli wyczuje dym.

## 3.
Utwórz klasę **Rakieta**, zbudowaną z pól:

- String nazwa
- int wagaPaliwa

konstruktora inicjującego pola oraz następujących metod:

- zatankuj- ładującą losową ilośćpaliwa,
- start- rozpoczynającą procedurę startową

W ramach kontroli przedstartowej metoda **start** sprawdzi stan paliwa i jeżeli jest on mniejszy niż 1000, podniesiony zostanie wyjątek **Exception** z komentarzem ’start anulowany - za mało paliwa’.

Przyjmij że procedura tankowania jest z definicji niebezpieczna i istnieje 5% szansa wybuchu rakiety. W takim wypadku należy podnieść niedozorowany wyjątek **BoomException**.