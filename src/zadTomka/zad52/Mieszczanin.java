package zadTomka.zad52;

public class Mieszczanin extends Citizen {

    @Override
    public String toString() {
        return "Mieszczanin{" +
                "statut=" + statut +
                ", imie='" + imie + '\'' +
                '}';
    }

    public Mieszczanin(Statut statut, String imie) {
        super(statut, imie);

    }

    @Override
    public boolean CanVote() {
        return true;
    }
}
