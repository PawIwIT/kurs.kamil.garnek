package zadTomka.kul;

public abstract class Zwierze {
    private String name = "bez imienia";

    public Zwierze(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "name='" + name + '\'' +
                '}';
    }
    public abstract String getTyp();
}
