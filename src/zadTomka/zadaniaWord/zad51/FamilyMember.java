package zadTomka.zadaniaWord.zad51;

public abstract class FamilyMember {
    private String name;
    private String rolawrodzinie;

    public FamilyMember(String name) {
        this.name = name;
    }

    public void introduce(String rolawrodzinie){
        this.rolawrodzinie = rolawrodzinie;
        System.out.println("I am just a simple family member " + rolawrodzinie +" "+ name);
    }
    public abstract void introduce();

    public abstract boolean isAdult();
}
