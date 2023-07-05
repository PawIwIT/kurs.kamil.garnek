package zadTomka.zadaniaWord.zad51;

public class Father extends  FamilyMember{
    public Father(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        super.introduce("I am Father");

    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
