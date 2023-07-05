package brzezinskiObiektowosc;

import brzezinskiObiektowosc.Dysk.HDDDysk;
import brzezinskiObiektowosc.usbpamiec.Myszka;
import brzezinskiObiektowosc.usbpamiec.PenDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        //     SSDDysk dysk = new SSDDysk();
        HDDDysk dysk = new HDDDysk();

        Komputer komputer = new Komputer(monitor, dysk);

       /* dysk.dodawaniePliku(new Pliki("jnsp.jpg"));
        dysk.listaPlikow();*/

        PenDrive kingston = new PenDrive("Kingston");
        Myszka myszka = new Myszka("Logitech");

        komputer.dodajUrzadzenieUSB(kingston);
        komputer.dodajUrzadzenieUSB(myszka);

        kingston.eject();
        komputer.usunUrzadzenieUSB(kingston);
        komputer.usunUrzadzenieUSB(myszka);



    }


}