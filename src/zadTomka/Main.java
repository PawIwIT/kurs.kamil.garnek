package zadTomka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj liczbe calkowita dodatnia");

       /* int userChoice = scanner.nextInt();

        for (int i = 0; i <= userChoice; i++) {

            if (i % 2 != 0) {
                System.out.println(i);*/

        //Napisać program, który wykorzystuje pętle i wypisuje liczby podzielne przez 3 lub przez 5 w przedziale od 3 do 100 (3,5,6,9,10,...)
      /*  for (int j = 3; j <= 100; j++) {

            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println(j);
            }*/

        //Napisać program, który wykorzystuje pętle i wczytuje od użytkownika przedział liczbowy (użytkownik ma podać dolną granicę zakresu i górną) (początek i koniec przedziału),
        // a następnie wypisz wszystkie liczby z tego przedziału podzielne przez 6.

       /* System.out.println("Podaj pierwsza liczbe z dolnego przedzialu");
        int userChoice = scanner.nextInt();
        System.out.println("podaj ostatnia liczbe z gornego przedzialu");
        int userChoice2 = scanner.nextInt();

        for (int i = userChoice; i <= userChoice2; i++) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }*/
        //program wypisujacy litery od a do z
/*       char a = 'a';
        char z = 'z';
        while (a<=z){
            System.out.println(a++);
        }*/

//    Napisz program, który wypisuje “Hello World” zadaną przez użytkownika ilość razy.

      /*  String helloWorld = "Hello World";

        System.out.println("ile razy ma sie wyswietlic hello world?");
        int liczbaPodana = scanner.nextInt();

        for (int i =0; i < liczbaPodana ; i++) {
            System.out.println(helloWorld);
        }*/


        //  Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B,
        //  a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A,A + 1,...,B).
        //  Obliczenia należy wykonać dwukrotnie stosując kolejno pętle: while, for.
        //		Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60


      /*  System.out.println("Podaj liczbe calkowita");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj liczbe calkowita");
        int liczb2 = scanner.nextInt();
        int suma = 0;

        for (; liczba1 <= liczb2; ) {
            suma = suma + liczba1;
            liczba1++;
            System.out.println(suma);
        }
*/


        //Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
        //    a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
        //    się w tablicy.


      /*  int[] tab = new int[20];
        Random generator = new Random();
        for (int i = 0; i < 20; i++) {
            tab[i] = generator.nextInt(10) + 1;
        }
        int[] tabPowtorzen = new int[11];
        for (int i = 0; i < 20; i++) {
            for (int j = 1; j <= 10; j++) {
                if (tab[i] == j) {
                    tabPowtorzen[j]++;
                }
            }
        }
        System.out.println("Wystapienia:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + tabPowtorzen[i]);
        }*/

        //Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic.
        // Pierwsza tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.


       /* int[] parzysteLiczby = {2, 4, 6, 8, 10, 12};

        int[] nieparzysteLiczby = {3, 5, 9};

        for (int i = 0; i < parzysteLiczby.length; i = i + 2) {
            int i1 = parzysteLiczby[i];
            System.out.println(i1);
        }

        System.out.println(" ");

        for (int i = 0; i < nieparzysteLiczby.length; i = i + 2) {
            int i2 = nieparzysteLiczby[i];
            System.out.println(i2);
        }*/

        // Napisz program, który wypisze największą liczbę z tablicy. Tablicę zainicjalizuj przykładowymi wartościami.

   /*     int[] tab = {2, 50, 100, 800, 600};
        // System.out.println(Arrays.stream(tab).max());
        int niejwiekszaLiczba = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > niejwiekszaLiczba) {
                niejwiekszaLiczba = tab[i];
            }
        }
        System.out.println("najwieksza liczba to: " + niejwiekszaLiczba);*/


        //Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją przykładowymi wartościami.
        // Skorzystaj z pętli for-each, aby wypisać wszystkie wartości tablicy ze wszystkimi literami zamienionymi na wielkie.
        // Skorzystaj z funkcjonalności toUpperCase wartości typu String, którą poznaliśmy już w jednym z poprzednich rozdziałów.


/*        String[] imiona = {"ala","ma","kota"};
        for (String s : imiona) {
            System.out.println(s.toUpperCase());
        }*/

//Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy.
// Następnie, program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami zapisanymi od końca do początku.
// Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i", "psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".

       /* System.out.println("podaj pierwsze slowo");
        String slowo1 = scanner.nextLine();
        System.out.println("podaj drugie slowo");
        String slowo2 = scanner.nextLine();
        System.out.println("podaj trzecie slowo");
        String slowo3 = scanner.nextLine();
        System.out.println("podaj czwarte slowo");
        String slowo4 = scanner.nextLine();
        System.out.println("podaj piate slowo");
        String slowo5 = scanner.nextLine();

        String[] tabSlow = {slowo1, slowo2, slowo3, slowo4, slowo5};

        for (int i = tabSlow.length - 1; i >= 0; i--) {
            String oslowPrzedOdwroceniem = tabSlow[i];
            String[] slowoPoSplit = slowoPrzedOdwroceniem.split("");

            String odwroconeSlowo = "";
            for (int j = slowoPoSplit.length - 1; j >= 0; j--) {
                odwroconeSlowo = odwroconeSlowo + slowoPoSplit[j];
            }
            System.out.println(odwroconeSlowo);
        }*/

        // 10, -2, 1, 100, 20, -15, 0, 10, // -15, -2, 0, 1, 10, 10, 20, 100.

      /*  int[] tablicaLiczb = new int[8];

        System.out.println("Podaj 8 wybranych przez siebie cyfr");
        //pobieramy liczby
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println((i + 1) + " liczba: ");
            tablicaLiczb[i] = pobierzLiczbe();

        }
        for (int i = 0; i < tablicaLiczb.length; i++) {
            System.out.println(tablicaLiczb[i]);
        }

    }

    public static int pobierzLiczbe() {
        return new Scanner(System.in).nextInt();
    }*/


        //Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy,
        // a następnie policzy i wypisze silnię każdej z pobranych liczb.

       /* int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            int liczbyUzytkowniak = scanner.nextInt();
            tab[i] = liczbyUzytkowniak;
        }
        for (int i1 : tab) {
            if (i1 < 0) {
                System.out.println("do wyliczenia silni liczba musi byc wieksza lub = 0" + i1);
            } else {
                int silnia = 1;
                for (int i = 1; i <= i1; i++) {
                    silnia = silnia * i;
                }
                System.out.println("silnia liczby " + i1 + "wynosi " + silnia);
            }
        }*/

        // Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String.
        // Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności.
        // Napisz kod, który porówna obie tablice i odpowie na pytanie, czy są one takie same.

       /* String[] pierwszaTablica = {"ala", "ma", "kota"};
        String[] drugaTablica = {"ala", "ma", "kota"};

        boolean jestRoznica = false;

        if (pierwszaTablica.length != drugaTablica.length) {
            jestRoznica = true;
        } else {
            for (int i = 0; i < pierwszaTablica.length ; i++) {
                if (!pierwszaTablica[i].equals(drugaTablica[i])){
                    jestRoznica=true;
                }
            }
            if (jestRoznica){
                System.out.println("tablice nie sa takie same");
            } else {
                System.out.println("tablice sa takie same");
            }
        }*/
        //Napisz program, który pobierze od użytkownika trzy boki trójkąta,
        // policzy jego obwód i wypisze wynik na ekran.
     /*   System.out.println("aby policzyc obwod podaj dlugosci bokow");
        int obowod = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
        System.out.println("Obwod trojkata to : " + obowod);*/

        //Napisz program, który wczyta od użytkownika trzy słowa i wypisze je w odwrotnej kolejności, niż podał je użytkownik, oddzielone przecinkami. Dla przykładu, gdy użytkownik poda:
        //
        //Ala
        //ma
        //kota
        //To program powinien wypisać kota, ma, Ala

        /*String[] tab = {"ala", "ma", "kota"};*/
        /*for (int i = tab.length - 1; i >= 0; i--) {
            String slowoNieOdwrocone = tab[i];

            String[] slowoPoSplit = slowoNieOdwrocone.split(" , ");

            System.out.println(Arrays.toString(slowoPoSplit));
        }*/

        //Napisz program, który wczyta od użytkownika jeden wyraz i wypisz liczbę znaków, z których się składa.
        // Dla przykładu, dla podanego słowa nauka wypisze 5.
/*        System.out.println("podaj jeden wyraz: ");
        String podanyWyraz= scanner.nextLine();
        System.out.println("w tym slowie jest dokladnie : "+ podanyWyraz.length() + " litery");*/

//Zmień poniższy kod, by wynik wypisany na ekran nie był liczbą zaokrągloną do całkowitej wartości,
// lecz zmienną rzeczywistą (z częścią ułamkową):

 /*       int x = 5;
        int y = 2;
        double wynik = (double) x / y;

        System.out.println(wynik);*/

        //Napisz program, który pobierze od użytkownika słowo i wypisze je z małymi literami zamienionymi na wielkie.
        // Skorzystaj z metody toUpperCase typu String.
       /* System.out.println("podaj slowo");
        String slowoUzytkownika=scanner.nextLine();
        System.out.println(slowoUzytkownika.toUpperCase());*/

        //Napisz program, który policzy pole koła o promieniu podanym przez użytkownika i wypisze wynik na ekran.
        // Promień koła powinien być liczbą całkowitą – do jego przechowywania użyj zmiennej typu int.
        /*System.out.println("podaj promien kola");
        int promienUzytkownika = scanner.nextInt();
        double polekola = 3.14 * promienUzytkownika * promienUzytkownika;
        System.out.println(polekola);*/


        //Napisz program, który wczyta od użytkownika liczbę i wypisze, czy jest podzielna bez reszty przez 3.
        // Skorzystaj z operatora reszty z dzielenia – jeżeli reszta z dzielenia jest równa 0,
        // to liczba jest podzielna przez 3.
     /*   System.out.println("podaj liczbe");
        int liczbaUzytkownika = scanner.nextInt();

        if (liczbaUzytkownika % 3 == 0) {
            System.out.println("podana przez Ciebie liczba jest podzielna przez 3");
        }else {
            System.out.println("liczba nie jest podzielna prze 3");
        }*/

//Napisz program, który wczyta od użytkownika trzy liczby i odpowie na pytanie,
// czy można z nich zbudować trójkąt (suma każdych dwóch boków powinna być większa od trzeciego boku).

    /*    int[] tablicaBokowTrojkata = new int[3];

        for (int i = 0; i < tablicaBokowTrojkata.length; i++) {
            int bokTrojkatapodanyPrzezUzytkownika = scanner.nextInt();
            tablicaBokowTrojkata[i] = bokTrojkatapodanyPrzezUzytkownika;

        }
            if (tablicaBokowTrojkata[0] + tablicaBokowTrojkata[1] > tablicaBokowTrojkata[2]) {
                System.out.println("z podanych bokow mozesz zbudowac trojkat");
            } else if (tablicaBokowTrojkata[0] + tablicaBokowTrojkata[2] > tablicaBokowTrojkata[1]) {
                System.out.println("z podanych bokow mozesz zbudowac trojkat");
            } else if (tablicaBokowTrojkata[1] + tablicaBokowTrojkata[2] > tablicaBokowTrojkata[0]) {
                System.out.println("z podanych bokow mozesz zbudowac trojkat");
            } else {
                System.out.println("z podanych bokow nie mozna zbudowac trojkata");
            }*/


        //Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.

     /*   int[] tablicaIntow = new int[3];
        for (int i = 0; i < tablicaIntow.length; i++) {
            int liczbaPobranaOdUzytkownika = scanner.nextInt();
            tablicaIntow[i] = liczbaPobranaOdUzytkownika;
        }

        if (tablicaIntow[0] >= tablicaIntow[1]) {
            if (tablicaIntow[0] >= tablicaIntow[2]) {
                System.out.println("najwieksza liczba to : " + tablicaIntow[0]);
            } else {
                System.out.println("nawieksza liczba to " + tablicaIntow[2]);
            }
        } else {
            if (tablicaIntow[1] >= tablicaIntow[2]) {
                System.out.println("najwieksza liczba to: " + tablicaIntow[1]);
            } else {
                System.out.println("najwieksza liczba to: " + tablicaIntow[2]);
            }
            }*/

        //Napisz program, który pobierze od użytkownika numer miesiąca i wypisze jego nazwę,
        // lub komunikat "Nieprawidlowy numer miesiaca", jeżeli podany numer będzie spoza zakresu 1..12. Skorzystaj z instrukcji switch.
       /* System.out.println("Podaj numer: ");
        int numerMiesiacaodUzytkownika = scanner.nextInt();
        if (numerMiesiacaodUzytkownika > 12) {
            System.out.println("Musisz podaj liczbe zgodna z liczba miesiecy w roku!");
        }

            switch (numerMiesiacaodUzytkownika) {
                case 1:
                    System.out.println("styczen");
                    break;
                case 2:
                    System.out.println("luty");
                    break;
                case 3:
                    System.out.println("marzec");
                    break;
                case 4:
                    System.out.println("kwiecien");
                    break;
                case 5:
                    System.out.println("maj");
                    break;
                case 6:
                    System.out.println("czerwiec");
                    break;
                case 7:
                    System.out.println("lipiec");
                    break;
                case 8:
                    System.out.println("sierpien");
                    break;
                case 9:
                    System.out.println("wrzesien");
                    break;
                case 10:
                    System.out.println("pazdziernik");
                    break;
                case 11:
                    System.out.println("listopad");
                    break;
                case 12:
                    System.out.println("grudzien");
                    break;

                default:
                    System.out.println("nieprawidlowa cyfra");
            }*/

        // Napisz program, który pobierze od użytkownika jego imię i odpowie na pytanie, czy jego imię jest takie samo,
        // jak Twoje (załóżmy, że użytkownik podaje swoje imię bez polskich znaków).
        //
        //Uwaga! Pamiętaj, aby skorzystać z metody equals typu String zamiast porównywać stringi za pomocą operatora == !

      /*  System.out.println("sprawdzmy czy nasze imiona sa takie same: ");
        String podaneImiePrzezUzytkownika = scanner.nextLine();
        if (podaneImiePrzezUzytkownika.equals("pawel")) {
            System.out.println("nasze imiona sa takie same");

        } else {

            System.out.println("nasze imiona sa rozne");
        }*/

        //Napisz program, który pobiera wiek od użytkownika. Zapisz w zmiennej typu boolean informację, czy użytkownik jest pełnoletni, czy nie.
        // Skorzystaj z trój-argumentowego operatora warunkowego. Wypisz wynik zdefiniowanej zmiennej typu boolean na ekran.
/*        boolean czyPelnoletni;

        System.out.println("podaj swoj wiek");
        int wiekUzytkownika = scanner.nextInt();

        czyPelnoletni = wiekUzytkownika >= 18 ? true : false;
        System.out.println("czy pelnoletni? "+ czyPelnoletni);*/

        //Napisz program, który pobierze od użytkownika rok i odpowie na pytanie, czy podany rok jest rokiem przestępnym, czy nie. Wskazówka: rok jest rokiem przestępnym, jeżeli:
        //
        //dzieli się przez 4 i nie dzieli się przez 100
        //lub
        //dzieli się przez 400.

       /* System.out.println("podaj rok");

        int rokPodanyPrzezUzytkownika = scanner.nextInt();

        if (rokPodanyPrzezUzytkownika % 4 == 0 && rokPodanyPrzezUzytkownika % 100 !=0 || rokPodanyPrzezUzytkownika % 400==0) {
            System.out.println("ten rok jest przestepnym");
        } else {
            System.out.println("podany rok nie jest rokiem przestepnym");
        }*/

        //ZADANIA Z DZIAŁU TABLICE

        //Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic.
        //
        // Pierwsza tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.

       /* int[] liczbyparzyste = {2, 4, 6, 8};
        int[] liczbyNieParzyste = {3, 5, 7, 9};

        for (int i = 0; i < liczbyparzyste.length; i+=2) {
            System.out.println(liczbyparzyste[i]);
        }*/
//Napisz program, który wypisze największą liczbę z tablicy. Tablicę zainicjalizuj przykładowymi wartościami.

        /*int[] tabLiczby = {900,100, 50, 40, 58, 600};

        int najwiekszaLiczba = tabLiczby[0];
        for (int i = 1; i < tabLiczby.length; i++) {
            if (tabLiczby[i] > najwiekszaLiczba) {
                najwiekszaLiczba = tabLiczby[i];
            }
        }
        System.out.println("najwieksza liczba to: " + najwiekszaLiczba);*/

        //Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją przykładowymi wartościami.
        // Skorzystaj z pętli for-each, aby wypisać wszystkie wartości tablicy ze wszystkimi literami zamienionymi na wielkie.
        // Skorzystaj z funkcjonalności toUpperCase wartości typu String, którą poznaliśmy już w jednym z poprzednich rozdziałów.
/*
        String[] tablica = {"ala","ma","kota"};

        for (String slowa : tablica) {
            System.out.println(slowa.toUpperCase());
        }*/
//Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy.
// Następnie, program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami zapisanymi od końca do początku.
// Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i", "psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".

 /*       String[] tablicaSlowUzytkownika =new String[5];

        for (int i = 0; i < tablicaSlowUzytkownika.length ; i++) {
            System.out.println((i+1)+"slowo: ");
        tablicaSlowUzytkownika[i]= scanner.nextLine();
        }
        for (int i = tablicaSlowUzytkownika.length-1; i >=0 ; i--) {
            for (int j = tablicaSlowUzytkownika[i].length()-1; j >=0 ; j--) {
                System.out.print(tablicaSlowUzytkownika[i].charAt(j));

            }
        }*/

//Napisz metodę, która zwróci ostatni znak w przesłanym jako argument stringu.
//Dla przykładu, dla argumentu "Witaj", metoda powinna zwrócić literę j.

 /*       System.out.println(ostatniaLiteraSlowa("Witajcie"));
        }
    private static char ostatniaLiteraSlowa(String s) {
        return s.charAt(s.length()-1);*/


        //Napisz metodę, która odpowiada na pytanie, czy podany string jest palindromem.
        // Palindromy to słowa, które są takie same czytane od początku i od końca, np. kajak.

        //Dla przykładu, dla argumentu "kajak" (a także "Kajak"), metoda ta powinna zwrócić true, a dla argumentu "kot" – false.


 /*    System.out.println(
             "Czy kajak to palindrom? " + czyPalindrom("kajak")
    );

    System.out.println(
            "Czy Kajak to palindrom? " + czyPalindrom("Kajak")
    );

    System.out.println(
            "Czy kot to palindrom? " + czyPalindrom("kot")
    );
}

    public static boolean czyPalindrom(String slowo) {
        String slowoMaleLitery = slowo.toLowerCase();
        int dlugoscSlowa = slowo.length();

        for (int i = 0; i < dlugoscSlowa / 2; i++) {
            if (slowoMaleLitery.charAt(i) != slowoMaleLitery.charAt(dlugoscSlowa - 1 - i)) {
                return false;
            }
        }

        return true;*/


        //Napisz metodę, która przyjmuje tablicę liczb całkowitych i zwraca sumę wszystkich elementów tej tablicy.
        //
        //Dla przykładu, dla tablicy o elementach { 1, 7, 20, 100 } metoda powinna zwrócić liczbę 128.

     /*   int[] tablicaLiczb = {1, 7, 20, 100};

        System.out.println(sumaLiczb(tablicaLiczb));
    }

    public static int sumaLiczb(int[] tablica) {
        int suma = 0;

        for (int i : tablica) {
            suma += i;
        }
        return suma;*/

        //Napisz metodę, która przyjmuje jako argument string i znak (char) i zwraca liczbę równą liczbie wystąpień podanego znaku w danym stringu.
        //
        //Dla argumentów: "Ala ma kota", 'a', metoda powinna zwrócić 3, ponieważ string zawiera trzy małe litery a. Uwaga: znaki zapisujemy w apostrofach, a stringi w cudzysłowach.
        // Przykładowe wywołanie metody, którą należy napisać w tym zadaniu:
        //
        //int liczbaLiterA = zliczWystapienia("Ala ma kota", 'a');
  /*      System.out.println(zliczWystapienia("ala ma kota",'a'));
    }
    private static int zliczWystapienia(String slowa, char znak) {
        int liczbaZnakow = 0;
        for (int i = 0; i < slowa.length(); i++) {
            if (slowa.charAt(i)==znak){
                liczbaZnakow++;
            }
        }
        return liczbaZnakow;*/



        //    Utwórz klasę TeddyBear, który będzie miał pole prywatne String name; Dodaj konstruktor, który przyjmie za parametr imię.
        //    Co to znaczy że pole jest prywatne?
        //    Dodaj metodę, która wyświetli imię misia;

 /*       TeddyBear teddyBear = new TeddyBear("Misia");
        String imie = teddyBear.getImie();
        System.out.println(imie);*/

//Stwórz klasę Student która posiada:
//        - pole numer indeksu
//        - pole imie
//        - pole nazwisko
//        - listę ocen
//
//	- kolekcję ocen:
//		a) tablicę ocen (stwórz tablicę maksymalnie 100 ocen)
//        - metody getterów i setterów
//        - metodę do obliczania średniej
//        - metodę która zwraca true jeśli żadna z ocen w liście/tablicy ocen nie jest 1 ani 2, oraz false w przeciwnym razie.


        /*JOptionPane.showMessageDialog(null,"Hello");*/


    }
}















