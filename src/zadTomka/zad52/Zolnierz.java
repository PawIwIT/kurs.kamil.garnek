package zadTomka.zad52;

public class Zolnierz extends Citizen {

    public Zolnierz(Statut statut, String imie) {
        super(statut, imie);
    }

    @Override
    public boolean CanVote() {
        return true;
    }
}
