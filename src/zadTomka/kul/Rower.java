package zadTomka.kul;

public class Rower implements Moveable {
    @Override
    public void start() {
        System.out.println("Rower rusza");
    }
    @Override
    public void stop() {
        System.out.println("Rower sie zatrzymal");
    }
}
