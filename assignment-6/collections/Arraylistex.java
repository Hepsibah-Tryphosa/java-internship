import java.util.ArrayList;
import java.util.Collections;

public class Arraylistex {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(4);
        arraylist.add(77);
        arraylist.add(8);
        arraylist.add(0);
        arraylist.add(200);
        arraylist.add(66);
        arraylist.add(104);

        // Collections.sort(arraylist);
        // System.out.println(arraylist);

        int maximum = Collections.max(arraylist);
        System.out.println(maximum);

        for (int i = 0; i < arraylist.size(); i++) {

            for (int j = arraylist.size() - 1; j > i; j--) {
                if (arraylist.get(i) > arraylist.get(j)) {
                    int s = arraylist.get(i);
                    s = arraylist.get(i);
                    s = arraylist.get(j);
                }

            }

        }
        System.out.print("[");
        for (int i : arraylist) {

            System.out.print(i + ",");
        }
        System.out.println("]");

        int s = arraylist.size();
        int maxvalue = arraylist.get(0);
        for (int i = 1; i < arraylist.size(); i++) {
            if (arraylist.get(i) > maxvalue) {
                maxvalue = arraylist.get(i);
            }

        }
        System.out.println(maxvalue);

    }

}