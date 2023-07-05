package argumentyMetod;

public class Main {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();
        punkt.x = 5;
        punkt.y = 6;

        Test.zmien(punkt);
        System.out.println(punkt.x);


    }
}
