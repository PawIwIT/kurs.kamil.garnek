package zadTomka.kalkulator;
//Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania, odejmowania,
// mnożenia i dzielenia na dwóch liczbach rzeczywistych.
// Program ma identyﬁkować sytuację wprowadzenia błędnego symbolu działania oraz próbę dzielenia przez zero.
// Zastosować instrukcję if else do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu operacji.
// Scenariusz działania programu:
//		a) Program wyświetla informację o swoim przeznaczeniu.
//		b) Wczytuje pierwszą liczbę.
//		c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//		d) Wczytuje drugą liczbę.
//		e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
//
////Dla każdej operacji osobna metoda – stworzyć klase MathCalc która będzie trzymala te metody
////Program uruchamiany w mainie w petli, tak długo az uzytownik nie napisze „EXIT”
public class Main {
    public static void main(String[] args) {
        MojeObliczenia mojeObliczenia = new MojeObliczenia();

        mojeObliczenia.showInstruction();
        mojeObliczenia.firstNumber();
        mojeObliczenia.symbol();
        mojeObliczenia.secondNumber();
        mojeObliczenia.calculator();
    }
}
