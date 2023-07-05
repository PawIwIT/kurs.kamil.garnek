package zadTomka.zadaniaWord.zad51;

public class Mother extends FamilyMember {

    public Mother(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        super.introduce("I am mom");

    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
