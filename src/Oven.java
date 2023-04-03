public class Oven implements BakingOven, RoastingOven {

    int time;
    int temperature;

    @Override
    public void bakeCookies() {
        temperature = 300;
        time = 100;
        turnOn();
    }

    @Override
    public void bakeBread() {
        temperature = 200;
        time = 120;
        turnOn();
    }

    @Override
    public void roastChicken() {
        temperature = 130;
        time = 240;
        turnOn();
    }

    private void turnOn() {
        System.out.println(String.format("Start.Heat up to %s and work for %d minutes.", temperature, time));
    }
}
