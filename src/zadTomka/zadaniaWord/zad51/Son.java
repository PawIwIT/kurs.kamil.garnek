package zadTomka.zadaniaWord.zad51;

public class Son extends FamilyMember{

    public Son(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        super.introduce("i am son");
    }

    @Override
    public boolean isAdult() {
        System.out.println("Nieletni czlonek rodziny");
        return false;
    }
}
