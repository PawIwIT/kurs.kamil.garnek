package kamilBrzezinskiZadaniaStream1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample {
    List<BoardGame> games = new ArrayList<>();

    public void setUp() {
        BoardGame pierwszaGra = new BoardGame("Terraforming Mars", 8.38, new BigDecimal("123.49"), 1, 5);
        BoardGame drugaGra = new BoardGame("Codenames", 7.82, new BigDecimal("64.95"), 2, 8);
        BoardGame trzecieGra = new BoardGame("Puerto Rico", 8.07, new BigDecimal("149.99"), 2, 5);
        BoardGame czwartaGra = new BoardGame("Terra Mystica", 8.26, new BigDecimal("252.99"), 2, 5);
        BoardGame piataGra = new BoardGame("Scythe", 8.3, new BigDecimal("314.95"), 1, 5);
        BoardGame szustaGra = new BoardGame("Power Grid", 7.92, new BigDecimal("145"), 2, 6);
        BoardGame siudmaGra = new BoardGame("7 Wonders Duel", 8.15, new BigDecimal("109.95"), 2, 2);
        BoardGame osmaGra = new BoardGame("Dominion: Intrigue", 7.77, new BigDecimal("159.95"), 2, 4);
        BoardGame dziewiataGra = new BoardGame("Patchwork", 7.77, new BigDecimal("75"), 2, 2);
        BoardGame dziesiataGra = new BoardGame("The Castles of Burgundy", 8.12, new BigDecimal("129.95"), 2, 4);
        BoardGame jedensataGra = new BoardGame("Spartakus", 9.0, new BigDecimal(120), 4, 8);

        games.add(pierwszaGra);
        games.add(drugaGra);
        games.add(trzecieGra);
        games.add(czwartaGra);
        games.add(piataGra);
        games.add(szustaGra);
        games.add(siudmaGra);
        games.add(osmaGra);
        games.add(dziewiataGra);
        games.add(dziesiataGra);
        games.add(jedensataGra);
    }

    public void firstStream() {
        games
                .forEach(System.out::println);
    }

    public void mapOperation() {
        games.stream()
                .map(BoardGame::getName)// zamienilismy streama obiektu Boardgame na streama obiektu typu String
                .forEach(System.out::println);
    }

    public void bestRating() {
        BoardGame bestGame1 = games.stream()
                .filter(g -> g.name.contains("a"))
                .max(Comparator.comparingDouble(g1 -> g1.rating)).get();
        System.out.println("Najlepiej oceniana gra to:" + bestGame1.name + " " + bestGame1.rating);
    }

    public void sortedOperation() {
        games
                .stream().sorted(Comparator.comparing(BoardGame::getPrice))
                .forEach(System.out::println);
    }

    public void countOperation() {
        long numberOfGame = games.stream()
                .count();
        System.out.println("w lisie mamy :" + numberOfGame + "gier");
    }

    public void reduceOperation() {
        Integer sumofMaxPlayers = games.stream()
                .map(BoardGame::getMaxPlayers)
                .reduce((b1, b2) -> b1 + b2)
                .get();
        System.out.println(sumofMaxPlayers);
    }
  public void takeWhileOperation(){
      games.stream()
              .sorted(Comparator.comparing(BoardGame::getRating))
              .takeWhile(boardGame -> boardGame.getRating() < 8)
              .forEach(System.out::println);



  }
}