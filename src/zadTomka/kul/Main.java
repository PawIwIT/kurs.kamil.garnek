package zadTomka.kul;

public class Main {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Ford");
        samochod1.start();
        samochod1.stop();

        Pies pies1 = new Pies("Azor");
        System.out.println(pies1.getVoice(1));
        pies1.start();
        pies1.stop();
        pies1.getTyp();
        System.out.println(pies1.getTyp());


        System.out.println("wyscig");
        Moveable.wyscig(new Rower(),new Samochod("bmw"),new Pies("azor"));



    }
}
