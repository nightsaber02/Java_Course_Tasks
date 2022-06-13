import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s;
        int longestLength = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5-word sentence (DO NOT ENTER ANY PUNCTUATION MARKS!): ");
        s = sc.nextLine();
        s = s.trim();

        String longest = Arrays.stream(s.split("\\s+")).max(Comparator.comparingInt(String::length)).orElse(null);

        System.out.println("Longest word: " + longest);
        System.out.println("Longest word's length: " + longest.length());
        String[] w2 = s.split(" ");
        String w2r = w2[w2.length-4];
        System.out.println("Second word in reverse: " + new StringBuilder(w2r).reverse());
    }
}