import java.util.Collections;
import java.util.LinkedList;

public class Shuffel {
    public static void main(String[] args) {
        LinkedList<Integer> linklist = new LinkedList<>();
        linklist.add(1);
        linklist.add(2);
        linklist.add(3);
        linklist.add(4);
        linklist.add(5);
        linklist.add(6);
        System.out.println(linklist);
         Collections.shuffle(linklist);
        System.out.println(linklist);

    }
}
