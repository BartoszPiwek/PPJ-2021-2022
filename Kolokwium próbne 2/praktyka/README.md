# Próbne kolowkium 2 - praktyka

Uzupełnij kod listingu poniższej metody Main o klasy i metody, które będą realizowały odpowiednie funkcjonalności, zgodnie z widocznym rezultatem wykonania programu. Niedopuszczalne są metody, które będą „na sztywno” wyświetlały konkretne wartości. Muszą one być elastyczne, w zależności od wartości na podstawie których ma być realizowany efekt wyświetlenia.

```java
public class Main {
    public static void main(String[] args) {
        Fabryka fabryka = new Fabryka("truskawkowy");
        Cukierek[] tab = fabryka.produkuj(10);
        
        try {
            for (int i = 0; i < tab.length; i++)
                System.out.println(tab[i]);
                System.out.println(fabryka.produkuj(10)[9]);
                System.out.println(fabryka.produkuj(5)[5]);
        }catch (Exception ex) {
            System.out.println("My fault");
        }
    }
}
```

## Rezultat wykonania:

```
Produkcja 10 cukierkow o smaku: truskawkowy
Wyprodukowano 5 cukierkow
Wyprodukowano 5 cukierkow
Cukierek nr 1 smak: truskawkowy11
Cukierek nr 2 smak: truskawkowy11
Cukierek nr 3 smak: truskawkowy11
Cukierek nr 4 smak: truskawkowy11
Cukierek nr 5 smak: truskawkowy11
Cukierek nr 6 smak: truskawkowy
Cukierek nr 7 smak: truskawkowy
Cukierek nr 8 smak: truskawkowy
Cukierek nr 9 smak: truskawkowy
Cukierek nr 10 smak: truskawkowy
Produkcja 10 cukierkow o smaku: truskawkowy
Wyprodukowano 5 cukierkow
Wyprodukowano 5 cukierkow
Cukierek nr 20 smak: truskawkowy
Produkcja 5 cukierkow o smaku: truskawkowy
Wyprodukowano 5 cukierkow
My fault
```