
public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> firstPair = new Pair<>("Hello World", 10);
        Pair<String, Integer> secondPair = new Pair<>("Bye World", 50);

        boolean equals = firstPair.equals(secondPair);
        String format = "First pair: %s and second pair: %s are equals: %s";

        System.out.println(String.format(format, firstPair, secondPair, equals));
    }
}
