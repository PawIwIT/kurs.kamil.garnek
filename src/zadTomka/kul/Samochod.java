package zadTomka.kul;

public class Samochod implements Moveable {
    String marka;

    public Samochod(String marka) {
        this.marka = marka;
    }

    @Override
    public void start() {
        System.out.println("samochod" + marka + "rusza");
    }

    @Override
    public void stop() {
        System.out.println("somochod" + marka + "zatrzymuje sie");
    }
}
