package samouczekMetody;

public class Temperature {
    int temperature;

    public void sprawdzTemperature(int temperature) {
        if (temperature > 0) {
            System.out.println(temperature + " Temperatura jest dodatnia");
        } else {
            System.out.println(temperature + " temperatura jest ujemna");
        }
    }
}

