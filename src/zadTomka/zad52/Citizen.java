package zadTomka.zad52;

public abstract class Citizen {
Statut statut;
String imie;

    public Citizen(Statut statut, String imie) {
        this.statut = statut;
        this.imie = imie;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public String getImie() {
        return imie;
    }

    public abstract boolean CanVote();
}
