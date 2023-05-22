package zadTomka.interfejsy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Figure[] tablicaFigur = new Figure[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj promien kola");
        tablicaFigur[0] = new Circle(scanner.nextDouble());

        System.out.println("Podaj dwa boki trojkata prostokatnego");
        tablicaFigur[1] = new Triangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("podaj boki prostokata");
        tablicaFigur[2] = new Rectangle((scanner.nextDouble()), scanner.nextDouble());


        for (Figure figure : tablicaFigur) {
            System.out.println("Obwod to: " + figure.getPerimetr());
            System.out.println("Pole to : " + figure.getArea());
            System.out.println(figure.getType());
        }
    }
}
