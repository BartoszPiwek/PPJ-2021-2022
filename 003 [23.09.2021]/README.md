# PPJ ćwiczenia 3

> niestacjonarne 23 Października 2021

## 1.

Utwórz program sprawdzający, jak zachowują się operacje matematyczne (+,-,*,÷,%)
gdy operują na parach literałów:

- liczb całkowitych
- liczb rzeczywistych
- znaków

Nie działające operacje wykomentuj.

## 2.

Zadeklaruj i zainicjuj dowolnymi znakami dwie zmienne typu **char** nadając im nazwy:
- charValue
- charvalue
- 
Zanim skompilujesz program zastanów się, czy rzeczywiście się on skompiluje - zakładając, że kod jest całkowicie poprawny od strony składniowej? Przypuszczenia
zapisz w komentarzu blokowym i sprawdź, czy były poprawne. Następnie odejmij
jedną zmienną od drugiej, a wynik wyświetl na ekranie.


## 3.

Przyjmij że dane są wartości logiczne jak w poniższej tabelce:

|boolean1|boolean2|
|---|---|
|true|true|
|true|false|
|false|true|
|false|false|

Przeanalizuj jaką wartość uzyskamy, gdy wartości te zostaną podstawione do wyrażenia:

> (boolean1 && !boolean2) || (boolean2 && !boolean1)

## 4.

Twój numer studenta reprezentuje liczbę w systemie heksadecymalnym. Przekształć
ją na postać binarną. Używając literału w postaci binarnej oraz symbolu ”_” oddziel jej części w taki sposób by poszczególne cyfry z zapisu heksadecymalnego były
wyszczególnione.

## 5.

Dane są liczby 13, 15 i 17. Bazując na schemacie blokowym sprawdź, czy są to liczby
pierwsze czy nie. Jeśli któraś z tych liczb jest pierwsza, przedstaw program potwierdzający tę tezę. Wykorzystaj tylko te operacje, jakie zostały omówione na zajęciach.

## 6.

Dane jest wyrażenie: 
> int x = 2 * 5 + 3 * 4 - 8; 

Jaki jest wynik działania podanych operacji? Zmodyfikuj kolejność działań (dodając nawiasy) tak, aby rezultatem
była wartość 48.

## 7

Kod Greya, zwany również kodem refleksyjnym, charakteryzuje się tym że dwa kolejne _słowa kodowe_ różnią się tylko stanem jednego bitu. Jest również kodem cyklicznym, bowiem ostatni i pierwszy wyraz tego kodu także spełniają wyżej wymienioną
zasadę. Przedstaw program, który pokaże sekwencję zer i jedynek opisującą 5 bitowy
kod wraz z wartością liczbową (przedstawioną w systemie dziesiętnym) opisującą
wartość tego słowa. Przykładowo dla kodu 2 bitowego oczekiwany rezultat będzie
wyglądał następująco:

|||
|---|---|
|0|00|
|1|01|
|3|11|
|4|10|