package zadTomka.Klasy;
//Napisz klasę Punkt, która będzie zawierała punkt na płaszczyźnie opisany przez dwie wartości x oraz y (pola typu int).
// Napisz konstruktor inicjalizujący pola x i y, a także zaimplementuj metodę equals. Sprawdź, czy metoda działa zgodnie z założeniami.
public class Punkt {
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
