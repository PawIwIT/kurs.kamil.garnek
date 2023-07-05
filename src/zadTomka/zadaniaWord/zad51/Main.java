package zadTomka.zadaniaWord.zad51;

//Utwórz klasę FamilyMember z polem name i metodą introduce() która wypisuje komunikat "I am just a simple family member".
//    Wykorzystaj dziedziczenie (extends FamilyMember ) w klasach Mother, Father, Son, Daugther.
//    W metodzie introduce poszczególnych klas wpisz implementację:
//        - i am mother ...
//        - i am father ...
//        - i am son ...
//        - i am daughter ...
//
//	B)
//    Dodaj metodę (*abstrakcyjną) boolean isAdult do klasy FamilyMember, załóż że rodzice są zawsze dorośli, a dzieci nie.
//    Nadpisz te metody w klasach podrzędnych.
public class Main {
    public static void main(String[] args) {
        Son son = new Son("Pawel");
        son.introduce();
        son.isAdult();

        Mother mother = new Mother("Ala");
        mother.introduce();
        mother.isAdult();
    }
}
