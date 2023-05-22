package zadTomka.interfejs2;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;


        if (main.shouldMultiply()) {
            computation = new Mnozenie(); // zaimplementuj brakującą klasę
        } else {
            computation = new Dodawanie(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();


        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Wybierz mnozelnie wpisujac litere m w przeciwnym razie jaka kolwiek inna litera wykona dodawanie");
        return scanner.next().equals("m"); // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("podaj liczbe");
        return scanner.nextDouble(); // tutaj pobierz liczbę od użytkownika
    }
}
