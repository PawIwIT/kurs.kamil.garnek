package zadTomka.kalkulator;

import java.util.Scanner;

public class MojeObliczenia {
    double userNumber1;
    String userSymbol;
    double userNumber2;
    char symbol;
    Scanner scanner = new Scanner(System.in);

    public void showInstruction() {
        System.out.println("Witaj w aplikacji kalkulator, podaj 2 liczby rzeczywiste dodatnie");
    }

    public void firstNumber() {
        userNumber1 = scanner.nextDouble();
    }

    public void symbol() {
        userSymbol = scanner.next();
    }

    public void secondNumber() {
        userNumber2 = scanner.nextDouble();
    }

    //Metoda wykonujaca dzialania
    public void calculator() {
        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");
        System.out.println("Operacaja modulo - wciśnij %");
        symbol=scanner.next().charAt(0);

        switch (symbol){
            case '+'-> System.out.println(userNumber1+userNumber2);
            case '-'-> System.out.println(userNumber1-userNumber2);
            case '*'-> System.out.println(userNumber1 * userNumber2);
            case '/'-> System.out.println(userNumber1 / userNumber2);
        }

    }

}

