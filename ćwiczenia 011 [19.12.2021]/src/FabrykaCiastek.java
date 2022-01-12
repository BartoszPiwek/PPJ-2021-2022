public class FabrykaCiastek {
    static Ciastko[] cookies = new Ciastko[2];

    static Ciastko przygotuj(int value) {
        if (cookies[value] != null) {
            return cookies[value];
        }

        switch (value) {
            case 0: {
                cookies[value] = new Ciastko("Czekoladowe", 10);
            }
            case 1: {
                cookies[value] = new Ciastko("Truskawkowe", 7);
            }
        }

        return cookies[value];
    }
}
