
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class HashSet_TreeSet {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();

        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(62);
            hs.add(String.valueOf(str.charAt(number)));
        }

        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(62);
            treeSet.add(String.valueOf(str.charAt(number)));
        }

        LocalDateTime start = LocalDateTime.now();

        System.out.println("Search: ");

        if(hs.contains("7")) {
            System.out.println("hashSet contains \"7\"");
        }else{
            System.out.println("\"7\" not found");
        }
        System.out.println("HashSet: " + hs);



        LocalDateTime end = LocalDateTime.now();

        long HashSetTime = ChronoUnit.MILLIS.between(start, end);

        start = LocalDateTime.now();

        if(treeSet.contains("7")) {
            System.out.println("TreeSet contains \"7\"");
        }else{
            System.out.println("\"7\" not found");
        }
        System.out.println("TreeSet: " + treeSet);

        end = LocalDateTime.now();

        long TreeSetTime = ChronoUnit.MILLIS.between(start, end);

        System.out.println("HashSetTime = " + HashSetTime);
        System.out.println("linkedListTime = " + TreeSetTime);
    }
}
