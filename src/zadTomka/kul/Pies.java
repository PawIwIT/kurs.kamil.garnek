package zadTomka.kul;

public class Pies extends Zwierze implements Moveable, Speakable {
    public Pies(String name) {
        super(name);
    }
    @Override
    public void start() {
        System.out.println("Pies zaczal biec");
    }
    @Override
    public void stop() {
        System.out.println("Pies sie zatrzymal");
    }
    @Override
    public String getVoice(int voice) {
        if (LOUD == voice)
            return "hauhau";
        else if (QUIET == voice) {
            return "cichehauhau";
        } else {
            return null;
        }
    }
    @Override
    public String getTyp() {
        return "pies";
    }
}
