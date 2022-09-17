import java.util.ArrayList;
import java.util.LinkedList;

public class Linktoarray {

    public static void main(String[] args) {

        LinkedList<Integer> linklist = new LinkedList<>();
        linklist.add(1);
        linklist.add(5);
        linklist.add(9);
        ArrayList<Integer> arraylist = new ArrayList<>(linklist);
        System.out.println(arraylist);
    }
}
