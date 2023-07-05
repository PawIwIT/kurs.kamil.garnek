package zadTomka.zad52;

public class Krol extends Citizen {

    public Krol(Statut statut, String imie) {
        super(statut, imie);
    }

    @Override
    public boolean CanVote() {
        return false;
    }
}
