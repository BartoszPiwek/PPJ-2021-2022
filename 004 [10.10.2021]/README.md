# PPJ ćwiczenia 4

> niestacjonarne 10 Października 2021

## 1.

Poniższy fragment kodu pozwoli na wprowadzenie do programu liczby wprowadzonej
z klawiatury, a następnie przechowa pozyskaną wartość w zmiennej **studentId**:

```
java.util.Scanner in = new java.util.Scanner(System.in);
int studentId = in.nextInt();
```

- liczb całkowitych
- liczb rzeczywistych
- znaków

Umieść go w obrębie metody **main**, a następnie skompiluj i uruchom program. Po uruchomieniu, za pomocą klawiszy numerycznych klawiatury, należy wprowadzić sekwencję złożoną z jednej lub więcej liczby cyfr. Zatwierdzenie wprowadzonych danych następuje po wciśnięciu klawisza **Enter** na klawiaturze.

Utwórz program, który przywita studenta wprowadzonym numerem np.:

```
Hello s1701
```

gdzie 1701 jest wprowadzonym z klawiatury ciągiem cyfr.

## 2.

Jaki będzie rezultat poniższego programu:

```
double a = ...;
double x;
if (a >= 0) x = 1.701;
if (a < 0) x = 2D * 3.14f;
System.out.println(x);
```

## 3.

Przeanalizuj poniższy fragment źle napisanego kodu i zapisz na kartce rezultat działania tego kodu.

```java
int zmInt = 4 
double zmDouble = -1.0;
if (zmInt > 0)
if (zmDouble > 0)
System.out.println("HereIam!");
else
System.out.println("No, I am here!") ;
System.out.println("No, actually , I am here!");
```

Następnie uruchom ten kod w programie i znajdź różnice i błędy

## 4.

Dana jest poniższy fragment kodu, w którym **doesSignificantWork**, **makesBreakthrough** i **nobelPrizeCandidate** są zmiennymi typu **boolean**:

```java
if (doesSignificantWork) {
if (makesBreakthrough)
nobelPrizeCandidate = true;
else
nobelPrizeCandidate = false;
}
else if (!doesSignificantWork)
nobelPrizeCandidate = false;
```

Zastanów się czy można dokonać prostszego zapisu tego programu, a jeżeli tak - zapisz to. Następnie użyj pojedynczego przypisania, które będzie działało tak samo.

## 5.

Zdefiniuj trzy zmienne typu int, następnie używając operatora ternarnego wypisz na ekranie są takie same lub nie są takie same stosownie do sytuacji.

## 6.

Przyjmując że **a** i **b** są zmiennymi typu **int**, zapisz poniższe wyrażenie w możliwie prostej postaci:

```
(!( a < b ) && !( a > b ))
```

## 7.

Zainicjuj zmienną typu rzeczywistego dowolną wartością. Następnie napisz program, który sprawdzi czy wprowadzona wartość należy do poniższych przedziałów.

- A = [0, ∞)
- B = (−∞, 1]
- C = [0, 1]

Zadbaj aby klasyfikacja była jednoznaczna (nie składana) i możliwie optymalna przy założeniu że istnieje dokładnie taka sama szansa na wystąpienie każdej z liczb.

## 8

Dane są następujące zbiory:

- A = (−15, −10] ∪ (−5, 0) ∪ (5, 10)
- B = (−∞, −13] ∪ (−8, −3]
- C = [−4,∞)

Napisz program weryfikujący, czy zmienna int wrt należy do części wspólnej tych zbiorów.

## 9.

Napisz program, który pozwoli użytkownikowi na wprowadzenie liczby. Liczba ta będzie reprezentowała jakiś rok. Program powinien wyświetlić informację o tym, czy ten rok jest przestępny. Wykorzystaj fakt, że aby rok był przestępny, liczba reprezentująca rok musi:

- być podzielna bez reszty przez 4 i nie być podzielna przez 100,
- lub być podzielna bez reszty przez 400

## 10

Napisz program wyświetlający wartości od 1 do 10. Wykorzystaj w tym celu pętle.

## 11

Wykorzystując pętle wyświetl na ekranie tabliczkę mnożenia dla wartości od 1 do **n**, gdzie n będzie wartością liczbową podawaną przez użytkownika. W celu pobrania wartości wykorzystaj polecenie Scanner omówione w poprzednich zadaniach

## 12

Napisz program, który wykorzystując literał "\*" i pętle utworzy trójkąt składający się z literału "\*":

```
*
**
***
****
*****
```

Uwaga, w programie nie można używać nie omawianych podczas wykładów typów
odnośnikowych np. **String**
