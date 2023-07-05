package brzezinskiObiektowosc.usbpamiec;

public class Myszka implements USBPamiec {

    private String nazwa;

    public Myszka(String name) {
        this.nazwa = name;
    }

    @Override
    public boolean podlczacz() {
        System.out.println("Myszka jest podlaczona");
        return true;
    }

    @Override
    public boolean odlacz() {
        System.out.println("Myszka jest odlaczona");
        return true;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }
}
