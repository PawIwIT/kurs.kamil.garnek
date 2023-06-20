package brzezinskiObiektowosc;

import brzezinskiObiektowosc.Dysk.Dysk;

import java.util.ArrayList;
import java.util.List;

public class Komputer {
    private Monitor monitor;
    private Dysk dysk;
    private Sluchawki sluchawki;

    List<PamiecUSB> listaUzadzenUSB = new ArrayList<>();

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

    public List<PamiecUSB> getListaUzadzenUSB() {
        return listaUzadzenUSB;
    }
}
