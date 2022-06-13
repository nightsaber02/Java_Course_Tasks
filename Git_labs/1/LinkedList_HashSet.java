
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class LinkedList_HashSet {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        LinkedList<String> linkedList = new LinkedList<>();

        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(62);
            hs.add(String.valueOf(str.charAt(number)));
        }

        for (int i = 0; i < 10000; i++) {
            int number = random.nextInt(62);
            linkedList.add(String.valueOf(str.charAt(number)));
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

        if(linkedList.contains("7")) {
            System.out.println("LinkedList contains \"7\"");
        }else{
            System.out.println("\"7\" not found");
        }
        System.out.println("LinkedList: " + linkedList);

        end = LocalDateTime.now();

        long linkedListTime = ChronoUnit.MILLIS.between(start, end);

        System.out.println("arraylistTime = " + HashSetTime);
        System.out.println("linkedListTime = " + linkedListTime);
    }
}