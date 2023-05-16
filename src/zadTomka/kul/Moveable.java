package zadTomka.kul;

public interface Moveable {

    void start();

    void stop();

    public static void wyscig(Moveable...moveables){
        for (Moveable moveable : moveables) {
            moveable.start();
            if (moveable instanceof Pies){
                System.out.println("imie psa to "+ ((Pies)moveable).getName());
        }

        }
    }
}
