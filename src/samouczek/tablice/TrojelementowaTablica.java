package samouczek.tablice;

public class TrojelementowaTablica {
    //Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.

    public int najwiekszaLiczba(int[] numbers) {
        int najwieksza = numbers[0]; // inicjalizujemy najwieksza liczbe z tablicy (trzyelementowej)

        if (numbers[1] > najwieksza) {
            najwieksza = numbers[1];
        }
        if (numbers[2] > najwieksza) {
            najwieksza = numbers[2];
        }
        return najwieksza;
    }


}

