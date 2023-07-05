package brzezinskiObiektowosc;

import brzezinskiObiektowosc.Dysk.Dysk;
import brzezinskiObiektowosc.usbpamiec.USBPamiec;

import java.util.ArrayList;
import java.util.List;

public class Komputer {
    private Monitor monitor;
    private Dysk dysk;
    private Sluchawki sluchawki;

    List<USBPamiec> listaUzadzenUSB = new ArrayList<>();

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Dysk getDysk() {
        return dysk;
    }

    public void setDysk(Dysk dysk) {
        this.dysk = dysk;
    }

    public Sluchawki getSluchawki() {
        return sluchawki;
    }

    public void setSluchawki(Sluchawki sluchawki) {
        this.sluchawki = sluchawki;
    }

    public Komputer(Monitor monitor, Dysk dysk) {
        this.monitor = monitor;
        this.dysk = dysk;
    }

    private List<USBPamiec> getListaUzadzenUSB() {
        return listaUzadzenUSB;
    }

    public void dodajUrzadzenieUSB(USBPamiec usbPamiec) {
        boolean podlczaczony = usbPamiec.podlczacz();
        if (podlczaczony) {
            listaUzadzenUSB.add(usbPamiec);
        }
    }

    public void usunUrzadzenieUSB(USBPamiec usbPamiec) {
        boolean odloczony = usbPamiec.odlacz();
        if (!odloczony) {
            System.out.println("urzadzenie odpiete sila");
        }
        listaUzadzenUSB.remove(usbPamiec);
    }
}
