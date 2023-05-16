package zadTomka.interfejsy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Figure[] tablicaFigur = new Figure[1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj promien kola");
        tablicaFigur[0]= new Circle(scanner.nextDouble());

        for (Figure figure : tablicaFigur) {
            System.out.println(figure.getPerimetr());
            System.out.println(figure.getArea());
            System.out.println(figure.getType());
        }


    }
}
