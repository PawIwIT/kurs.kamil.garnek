package zadTomka.zad52;

public class Chlop extends Citizen {

    public Chlop(Statut statut, String imie) {
        super(statut, imie);
    }

    @Override
    public String toString() {
        return "Chlop{" +
                "statut=" + statut +
                ", imie='" + imie + '\'' +
                '}';
    }

    @Override
    public boolean CanVote() {
        return false;
    }
}
