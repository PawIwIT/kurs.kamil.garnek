package kamilBrzezinskiZadaniaStream1;

public class Main {

    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.setUp();
       /* streamExample.firstStream();
        System.out.println();
        streamExample.mapOperation();
        System.out.println();
        streamExample.bestRating();
        System.out.println();
        streamExample.sortedOperation();*/
        /*streamExample.countOperation();*/
     /*   streamExample.reduceOperation();
        System.out.println();*/
        streamExample.takeWhileOperation();
  /*      games.stream()

                .filter(game -> game.maxPlayers > 4)
                .filter(game -> game.rating > 8)
                .filter(game -> new BigDecimal(150).compareTo(game.price) > 0)
                .map(game -> game.name.toUpperCase())
                .forEach(System.out::println);*/
                /*.filter(game -> game.name.contains("a"))
                .max(Comparator.comparingDouble(g1 -> g1.rating)).get();*/
      /*  Stream<BoardGame> gamesStream = games.stream();

        Stream<BoardGame> filteredStream = gamesStream
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> g.name.contains("a"))
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0);

        Stream<String> namesStream = filteredStream
                .map(g -> g.name.toUpperCase());
        namesStream.forEach(out::println);*/

    }
}
