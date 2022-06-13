
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<10000;i++){
            int number=random.nextInt(62);
            arraylist.add(String.valueOf(str.charAt(number)));
        }

        for(int i=0;i<10000;i++){
            int number=random.nextInt(62);
            linkedList.add( String.valueOf(str.charAt(number)));
        }

        LocalDateTime start = LocalDateTime.now();

        System.out.println("Insertion at the beginning: ");

        for(int i=0;i<100;i++){
            int number=random.nextInt(62);
            arraylist.add(0, String.valueOf(str.charAt(number)));
        }

        LocalDateTime end = LocalDateTime.now();

        long arraylistTime = ChronoUnit.MILLIS.between(start, end);



        start = LocalDateTime.now();

        for(int i=0;i<100;i++){
            int number=random.nextInt(62);
            linkedList.addFirst(String.valueOf(str.charAt(number)));
        }

        end = LocalDateTime.now();

        long linkedListTime = ChronoUnit.MILLIS.between(start, end);

        System.out.println("arraylistTime = " + arraylistTime);
        System.out.println("linkedListTime = " + linkedListTime);


        System.out.println("Insertion at the end: ");

        start = LocalDateTime.now();

        for(int i=0;i<100;i++){
            int number=random.nextInt(62);
            arraylist.add( String.valueOf(str.charAt(number)));
        }

         end = LocalDateTime.now();

         arraylistTime = ChronoUnit.MILLIS.between(start, end);



        start = LocalDateTime.now();

        for(int i=0;i<100;i++){
            int number=random.nextInt(62);
            linkedList.add(String.valueOf(str.charAt(number)));
        }

        end = LocalDateTime.now();

         linkedListTime = ChronoUnit.MILLIS.between(start, end);

        System.out.println("arraylistTime = " + arraylistTime);
        System.out.println("linkedListTime = " + linkedListTime);


        System.out.println("Deleting: ");

        start = LocalDateTime.now();

        for(int i=0;i<100;i++){
            arraylist.remove(i);
        }

        end = LocalDateTime.now();

        arraylistTime = ChronoUnit.MILLIS.between(start, end);



        start = LocalDateTime.now();

        for(int i=0;i<100;i++){
            linkedList.remove(i);
        }

        end = LocalDateTime.now();

        linkedListTime = ChronoUnit.MILLIS.between(start, end);

        System.out.println("arraylistTime = " + arraylistTime);
        System.out.println("linkedListTime = " + linkedListTime);

        System.out.println("Iterator: ");

        start = LocalDateTime.now();

        Iterator<String> iter = arraylist.iterator();


        System.out.println("\nThe iterator values"
                + " of arrayList are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        end = LocalDateTime.now();

        arraylistTime = ChronoUnit.MILLIS.between(start, end);



        start = LocalDateTime.now();

        System.out.print("\nIterating the LinkedList using for each function :\n ");

        linkedList.forEach(
                (element) -> System.out.print(element + " "));

        end = LocalDateTime.now();

        linkedListTime = ChronoUnit.MILLIS.between(start, end);

        System.out.println("\narraylistTime = " + arraylistTime);
        System.out.println("linkedListTime = " + linkedListTime);
    }
}
