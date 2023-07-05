package brzezinskiObiektowosc.usbpamiec;

public class PenDrive implements USBPamiec {

    private String nazwa;
    private boolean ejected = false;

    public PenDrive(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public boolean podlczacz() {
        System.out.println("Pendrive jest podlaczony");
        return true;

    }

    @Override
    public boolean odlacz() {

        if (!ejected) {
            System.out.println("zanim wyjmiesz Pendrivea - odlacz go");
            return false;
        } else {
            System.out.println("Pendrive odlaczony poprawnie");
            return true;
        }
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }

    public void eject() {
        System.out.println("odlaczanie Pendriva");
        ejected = true;
    }
}
