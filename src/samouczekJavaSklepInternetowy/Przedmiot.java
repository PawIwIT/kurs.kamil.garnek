package samouczekJavaSklepInternetowy;

public class Przedmiot {

    private String name;
    private double cena;

    public Przedmiot(String name, double cena) {
        this.name = name;
        this.cena = cena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "name='" + name + '\'' +
                ", cena=" + cena +
                '}';
    }
}
